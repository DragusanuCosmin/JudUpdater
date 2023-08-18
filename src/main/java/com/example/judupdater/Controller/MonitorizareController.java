package com.example.judupdater.Controller;

import com.example.judupdater.Entities.DosareMonitorizate;
import com.example.judupdater.Service.MonitorizareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/monitorizare")
public class MonitorizareController {
    private final MonitorizareService service;
    @Autowired

    public MonitorizareController(MonitorizareService service) {
        this.service = service;
    }
    @PostMapping("/adaugaremonitorizare")
    public void AdaugareMonitorizare(@RequestBody DosareMonitorizate dosareMonitorizate) {
        service.AdaugareMonitorizare(dosareMonitorizate);
    }
    @DeleteMapping("/scoatere")
    public void ScoatereMonitorizare(@RequestBody DosareMonitorizate dosareMonitorizate){
        service.ScoatereMonitorizare(dosareMonitorizate);
    }
    @PutMapping("/dezactivare")
    public void DeactivareMonitorizare(@RequestBody DosareMonitorizate dosareMonitorizate){
        service.DeactivareMonitorizare(dosareMonitorizate);
    }
    @PutMapping("/reactivare")
    public void ReactivareMonitorizare(@RequestBody DosareMonitorizate dosareMonitorizate){
        service.ReactivareMonitorizare(dosareMonitorizate);
    }
}
