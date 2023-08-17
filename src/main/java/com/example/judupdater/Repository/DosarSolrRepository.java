package com.example.judupdater.Repository;

import com.example.judupdater.Entities.DosareSolr;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DosarSolrRepository extends SolrCrudRepository<DosareSolr, String> {
}