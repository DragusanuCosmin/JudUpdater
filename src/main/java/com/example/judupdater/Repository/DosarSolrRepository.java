package com.example.judupdater.Repository;

import com.example.judupdater.Entities.DosareSolr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;
public interface DosarSolrRepository extends SolrCrudRepository<DosareSolr, String> {

    public List<DosareSolr> findById(String id);

    @Query("id:*?0* OR name:*?0*")
    public Page<DosareSolr> findByCustomQuery(String searchTerm, Pageable pageable);

    @Query(name = "Dosare.findByNamedQuery")
    public Page<DosareSolr> findByNamedQuery(String searchTerm, Pageable pageable);
}