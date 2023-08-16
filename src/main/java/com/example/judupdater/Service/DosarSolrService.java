//package com.example.judupdater.Service;
//
//import com.example.judupdater.Entities.DosareSolr;
//import com.example.judupdater.Repository.DosarSolrRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class DosarSolrService {
//
//
//    private final DosarSolrRepository dosarSolrRepository;
//    @Autowired
//    public DosarSolrService(DosarSolrRepository dosarSolrRepository) {
//        this.dosarSolrRepository = dosarSolrRepository;
//    }
//
//    public Optional<DosareSolr> getDosarById(String id) {
//        return dosarSolrRepository.findById(id);
//    }
//
//}
