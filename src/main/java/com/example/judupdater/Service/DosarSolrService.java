package com.example.judupdater.Service;

import com.example.judupdater.Entities.DosareSolr;
import com.example.judupdater.Repository.DosarSolrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class DosarSolrService {


    private final DosarSolrRepository dosarSolrRepository;
    @Autowired
    public DosarSolrService(DosarSolrRepository dosarSolrRepository) {
        this.dosarSolrRepository = dosarSolrRepository;
    }

    public List<DosareSolr> getDosarById(String id) {
            List<DosareSolr> objects = dosarSolrRepository.findById(id);
            return StreamSupport.stream(objects.spliterator(), false)
                    .collect(Collectors.toList());
    }
}
