package com.example.judupdater.Controller;
import com.example.judupdater.Entities.DosareSolr;
import com.example.judupdater.Service.DosarSolrService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/dosare")
@Api(tags = "Dosare")
public class DosareSolrController {
    public final DosarSolrService service;
    public final JdbcTemplate jdbcTemplate;
    @Autowired
    public DosareSolrController(DosarSolrService service, JdbcTemplate jdbcTemplate) {
        this.service = service;
        this.jdbcTemplate = jdbcTemplate;
    }
    @PutMapping("/actualizaredosar")
    @ApiOperation("Endpoint to update files")
        public void ActualizareDosar(@RequestBody String nrdosar) {
        System.out.println(nrdosar);
            Page<DosareSolr> dosare = service.findByNumardosar(nrdosar);
            try {
                if (dosare.hasContent()) {
                    List<DosareSolr> dosareList = dosare.getContent();
                    DosareSolr dosar = dosareList.get(0);
                    String query = "SELECT COUNT(*) FROM dosaresolr WHERE numardosar = ?";
                    Integer count = jdbcTemplate.queryForObject(query, Integer.class, nrdosar);
                    assert count != null;
                    if (count.equals(0)) {
                        AdaugareDosar(dosar);
                    } else {
                        InlocuireDosar(dosar);
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
        final String sql = "UPDATE dosaresolr SET id=?,data = ?, datamodificarii = ? ,numardosarvechi=?,iddosar=?, institutie = ? , stadiu = ? , sectie = ? , obiect = ? , calitateparte = ?, numeparte = ?, materie = ?, ora = ? , datadocument = ? , solutie = ?  , solutiesumar = ? , numardocument = ? , datapronuntare = ? , documentsedinta = ? , datasedinta = ? , complet = ? , tipcaleatac = ?,datadeclarare=?,partedeclaratoare=?,numardosarexact=? WHERE numardosar=?";
        jdbcTemplate.update(sql, dosar.getId(), dosar.getData(), dosar.getDatamodificarii(), dosar.getNumardosarvechi(), dosar.getIddosar(), dosar.getInstitutie(), dosar.getStadiu(), dosar.getSectie(), dosar.getObiect(), dosar.getCalitateparte(), dosar.getNumeparte(), dosar.getMaterie(), dosar.getOra(), dosar.getDatadocument(), dosar.getSolutie(), dosar.getSolutiesumar(), dosar.getNumardocument(), dosar.getDatapronuntare(), dosar.getDocumentsedinta(), dosar.getDatasedinta(), dosar.getComplet(), dosar.getTipcaleatac(), dosar.getDatadeclarare(), dosar.getPartedeclaratoare(), dosar.getNumardosarexact(), dosar.getNumardosar());
    }
    public void AdaugareDosar(DosareSolr dosar) {
        final String sql="INSERT INTO dosaresolr(id,iddosar,numardosar,institutie,data,datamodificarii,stadiu,sectie,obiect,materie,numeparte,calitateparte,datapronuntare,datasedinta,datadocument,complet,documentsedinta,numardocument,ora,solutie,solutiesumar,datadeclarare,partedeclaratoare,tipcaleatac,numardosarvechi,numardosarexact) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,dosar.getId(),dosar.getIddosar(),dosar.getNumardosar(),dosar.getInstitutie(),dosar.getData(),dosar.getDatamodificarii(),dosar.getStadiu(),dosar.getSectie(),dosar.getObiect(),dosar.getMaterie(),dosar.getNumeparte(),dosar.getCalitateparte(),dosar.getDatapronuntare(),dosar.getDatasedinta(),dosar.getDatadocument(),dosar.getComplet(),dosar.getDocumentsedinta(),dosar.getNumardocument(),dosar.getOra(),dosar.getSolutie(),dosar.getSolutiesumar(),dosar.getDatadeclarare(),dosar.getPartedeclaratoare(),dosar.getTipcaleatac(),dosar.getNumardosarvechi(),dosar.getNumardosarexact());
    }
}
