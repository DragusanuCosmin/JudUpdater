package com.example.judupdater.Dao;

import com.example.judupdater.Entities.DosareSolr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DosarSolrDao extends SolrCrudRepository<DosareSolr, String> {
    @Query("numardosar:?0")
    Page<DosareSolr> findByNumardosarContainingCustom(String searchTerm, Pageable pageable);
}
