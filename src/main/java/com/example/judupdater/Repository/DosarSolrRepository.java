package com.example.judupdater.Repository;

import com.example.judupdater.Entities.DosareSolr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DosarSolrRepository extends SolrCrudRepository<DosareSolr, String> {
    Optional<DosareSolr> findByNumardosar(String numarDosar);
    @Query("numardosar:?0")
    Page<DosareSolr> findByNumardosarContainingCustom(String searchTerm, Pageable pageable);



}
