package com.example.judupdater.Controller;
import com.example.judupdater.Entities.DosareSolr;
import com.example.judupdater.Repository.DosarSolrRepository;
import com.example.judupdater.Service.DosarSolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RequestMapping("/dosare")

@RestController
public class DosareSolrController {
    public final DosarSolrService service;
    @Autowired
    public DosareSolrController(DosarSolrService service) {
        this.service = service;
    }
    @GetMapping("/getdosaresolr/{id}")
    public Optional<DosareSolr> getDosarById(@PathVariable String id) {
        return service.getDosarById(id);
    }
}
