package com.example.judupdater.Controller;

import com.example.judupdater.Entities.DosareMonitorizate;
import com.example.judupdater.Service.MonitorizareService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/monitorizare")
@Api(tags = "Monitorizare")
public class MonitorizareController {
    private final MonitorizareService monitorizareService;
    @Autowired
    public MonitorizareController(MonitorizareService monitorizareService) {
        this.monitorizareService = monitorizareService;
    }
    @PostMapping("/adaugaremonitorizare")
    @ApiOperation("Endpoint to add to monitoring")
    public void AdaugareMonitorizare(@RequestBody DosareMonitorizate dosareMonitorizate) {
        monitorizareService.AdaugareMonitorizare(dosareMonitorizate);
    }
    @ApiOperation("Endpoint to remove from monitoring")
    @DeleteMapping("/scoatere")
    public void ScoatereMonitorizare(@RequestBody DosareMonitorizate dosareMonitorizate){
        monitorizareService.ScoatereMonitorizare(dosareMonitorizate);
    }
    @ApiOperation("Endpoint to deactivate monitoring")
    @PutMapping("/dezactivare")
    public void DeactivareMonitorizare(@RequestBody DosareMonitorizate dosareMonitorizate){
        monitorizareService.DeactivareMonitorizare(dosareMonitorizate);
    }
    @ApiOperation("Endpoint to reactivate monitoring")
    @PutMapping("/reactivare")
    public void ReactivareMonitorizare(@RequestBody DosareMonitorizate dosareMonitorizate){
        monitorizareService.ReactivareMonitorizare(dosareMonitorizate);
    }

}
