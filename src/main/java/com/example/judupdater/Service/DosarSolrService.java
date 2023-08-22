package com.example.judupdater.Service;

import com.example.judupdater.Dao.DosarSolrDao;
import com.example.judupdater.Entities.DosareSolr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class DosarSolrService {
    public final DosarSolrDao dosarSolrDao;
    @Autowired
    public DosarSolrService(DosarSolrDao dosarSolrDao) {
        this.dosarSolrDao = dosarSolrDao;
    }
    public Page<DosareSolr> findByNumardosar(String searchTerm){
        return dosarSolrDao.findByNumardosarContainingCustom(searchTerm, PageRequest.of(0, 10));
    }
}
