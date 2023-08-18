package com.example.judupdater.Controller;
import com.example.judupdater.Entities.DosareSolr;
import com.example.judupdater.Repository.DosarSolrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/dosare")

@RestController
public class DosareSolrController {
    public final DosarSolrRepository repository;
    public final JdbcTemplate jdbcTemplate;
    @Autowired
    public DosareSolrController(DosarSolrRepository repository,JdbcTemplate jdbcTemplate) {
        this.repository = repository;
        this.jdbcTemplate = jdbcTemplate;
    }
    @PutMapping("/actualizaredosar")
    public void ActualizareDosar(@RequestBody String nrdosar) {
        Page<DosareSolr> dosare = repository.findByNumardosarContainingCustom(nrdosar, PageRequest.of(0, 10));
        if (dosare.hasContent()) {
            List<DosareSolr> dosareList = dosare.getContent();
            System.out.println(dosareList.get(0).getId());
            DosareSolr dosar= dosareList.get(0);
            final String sql="UPDATE dosaresolr SET id=?,data = ?, datamodificarii = ? ,numardosarvechi=?,iddosar=?, institutie = ? , stadiu = ? , sectie = ? , obiect = ? , calitateparte = ?, numeparte = ?, materie = ?, ora = ? , datadocument = ? , solutie = ?  , solutiesumar = ? , numardocument = ? , datapronuntare = ? , documentsedinta = ? , datasedinta = ? , complet = ? , tipcaleatac = ?,datadeclarare=?,partedeclaratoare=?,numardosarexact=? WHERE numardosar=?";
            jdbcTemplate.update(sql,dosar.getId(),dosar.getData(),dosar.getDatamodificarii(),dosar.getNumardosarvechi(),dosar.getIddosar(),dosar.getInstitutie(),dosar.getStadiu(),dosar.getSectie(),dosar.getObiect(),dosar.getCalitateparte(),dosar.getNumeparte(),dosar.getMaterie(),dosar.getOra(),dosar.getDatadocument(),dosar.getSolutie(),dosar.getSolutiesumar(),dosar.getNumardocument(),dosar.getDatapronuntare(),dosar.getDocumentsedinta(),dosar.getDatasedinta(),dosar.getComplet(),dosar.getTipcaleatac(),dosar.getDatadeclarare(),dosar.getPartedeclaratoare(),dosar.getNumardosarexact(),dosar.getNumardosar());
        } else {
            throw new RuntimeException("Numar Dosar invalid");
        }
    }
    @PostMapping("/adaugaredosar")
    public void AdaugareDosar(@RequestBody DosareSolr dosar) {
        repository.save(dosar);
        final String sql="INSERT INTO dosaresolr(id,iddosar,numardosar,institutie,data,datamodificarii,stadiu,sectie,obiect,materie,numeparte,calitateparte,datapronuntare,datasedinta,datadocument,complet,documentsedinta,numardocument,ora,solutie,solutiesumar,datadeclarare,partedeclaratoare,tipcaleatac,numardosarvechi,numardosarexact) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,dosar.getId(),dosar.getIddosar(),dosar.getNumardosar(),dosar.getInstitutie(),dosar.getData(),dosar.getDatamodificarii(),dosar.getStadiu(),dosar.getSectie(),dosar.getObiect(),dosar.getMaterie(),dosar.getNumeparte(),dosar.getCalitateparte(),dosar.getDatapronuntare(),dosar.getDatasedinta(),dosar.getDatadocument(),dosar.getComplet(),dosar.getDocumentsedinta(),dosar.getNumardocument(),dosar.getOra(),dosar.getSolutie(),dosar.getSolutiesumar(),dosar.getDatadeclarare(),dosar.getPartedeclaratoare(),dosar.getTipcaleatac(),dosar.getNumardosarvechi(),dosar.getNumardosarexact());
    }
}
