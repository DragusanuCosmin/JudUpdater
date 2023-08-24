package com.example.judupdater.Dao;

import com.example.judupdater.Entities.DosareSolr;
import com.example.judupdater.Service.DosarSolrService;
import com.example.judupdater.Service.LogNotificariService;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;
@Repository("ActualizareDosarDao")
public class ActualizareDosarDataAccessService implements ActualizareDosarDao {
    public final DosarSolrService dosarSolrService;
    public final JdbcTemplate jdbcTemplate;
    public final LogNotificariService logNotificariService;
    @Autowired
    public ActualizareDosarDataAccessService(DosarSolrService dosarSolrService, JdbcTemplate jdbcTemplate, LogNotificariService logNotificariService) {
        this.dosarSolrService = dosarSolrService;
        this.jdbcTemplate = jdbcTemplate;
        this.logNotificariService = logNotificariService;
    }
    @Override
    public void actualizareDosar(String nrdosar) {
        Page<DosareSolr> dosare = dosarSolrService.findByNumardosar(nrdosar);
        try {
            if (dosare.hasContent()) {
                List<DosareSolr> dosareList = dosare.getContent();
                DosareSolr dosar = dosareList.get(0);
                String query = "SELECT COUNT(*) FROM dosaresolr WHERE numardosar = ?";
                Integer count = jdbcTemplate.queryForObject(query, Integer.class, nrdosar);
                System.out.println(count);
                assert count != null;
                if (count.equals(0)) {
                    AdaugareDosar(dosar);
                    logNotificariService.customsave("Dosarul " + dosar.getNumardosar() + " a fost adaugat");
                } else {
                    InlocuireDosar(dosar);
                    logNotificariService.customsave("Dosaruk " + dosar.getNumardosar() + " a fost actualizat");
                }
            } else {
                throw new RuntimeException("Numar Dosar invalid");
            }
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
    }
    public void InlocuireDosar(DosareSolr dosar) {
        final String sql = "UPDATE dosaresolr SET id=?, numardosar = ? ,institutie=?,data=?,datamodificarii=?, stadiu = ? , sectie = ? , obiect = ? ,materie=?, numeparte=?,calitateparte = ?, datapronuntare = ?, datasedinta = ?, datadocument = ?, complet = ?, documentsedinta = ?, numardocument = ?,ora = ?  , solutie = ?  , solutiesumar = ? , datadeclarare = ? , partedeclaratoare = ? , tipcaleatac = ?, numardosarexact = ? WHERE iddosar=?";
        jdbcTemplate.update(sql,dosar.getId(),dosar.getNumardosar(),dosar.getInstitutie(),dosar.getData(),dosar.getDatamodificarii(),dosar.getStadiu(),dosar.getSectie(),dosar.getObiect(),dosar.getMaterie(),convertstr(dosar.getNumeparte()),convertstr(dosar.getCalitateparte()),convertdate(dosar.getDatapronuntare()),convertdate(dosar.getDatasedinta()),convertdate(dosar.getDatadocument()),convertstr(dosar.getComplet()),convertstr(dosar.getDocumentsedinta()),convertstr(dosar.getNumardocument()),convertstr(dosar.getOra()),convertstr(dosar.getSolutie()),convertstr(dosar.getSolutiesumar()),convertdate(dosar.getDatadeclarare()),convertstr(dosar.getPartedeclaratoare()),convertstr(dosar.getTipcaleatac()),dosar.getNumardosarexact(),dosar.getIddosar());
    }
    public void AdaugareDosar(DosareSolr dosar) {
        final String sql="INSERT INTO dosaresolr(id,iddosar, numardosar ,institutie,data,datamodificarii, stadiu  , sectie  , obiect ,materie, numeparte,calitateparte, datapronuntare , datasedinta , datadocument , complet, documentsedinta, numardocument ,ora  , solutie  , solutiesumar , datadeclarare , partedeclaratoare , tipcaleatac , numardosarexact) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,dosar.getId(),dosar.getIddosar(),dosar.getNumardosar(),dosar.getInstitutie(),dosar.getData(),dosar.getDatamodificarii(),dosar.getStadiu(),dosar.getSectie(),dosar.getObiect(),dosar.getMaterie(),convertstr(dosar.getNumeparte()),convertstr(dosar.getCalitateparte()),convertdate(dosar.getDatapronuntare()),convertdate(dosar.getDatasedinta()),convertdate(dosar.getDatadocument()),convertstr(dosar.getComplet()),convertstr(dosar.getDocumentsedinta()),convertstr(dosar.getNumardocument()),convertstr(dosar.getOra()),convertstr(dosar.getSolutie()),convertstr(dosar.getSolutiesumar()),convertdate(dosar.getDatadeclarare()),convertstr(dosar.getPartedeclaratoare()),convertstr(dosar.getTipcaleatac()),dosar.getNumardosarexact());
    }
    public static String convertdate(List<Date> dateList) {
        SimpleDateFormat isoDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        isoDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        List<String> formattedDates = dateList.stream()
                .map(isoDateFormat::format)
                .collect(Collectors.toList());

        return String.join(", ", formattedDates);
    }
    public String convertstr(List<String> str) {
        return String.join(", ", str);
    }
}
