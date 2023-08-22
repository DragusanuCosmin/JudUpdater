package com.example.judupdater.Service;

import com.example.judupdater.Dao.DosareDao;
import com.example.judupdater.Dao.IstoricActiuniDao;
import com.example.judupdater.Entities.DosareMonitorizate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonitorizareService {
    private final DosareDao dosareDao;
    private final IstoricActiuniDao istoricActiuniDao;
    private final LogNotificariService logNotificariService;
    @Autowired
    public MonitorizareService(DosareDao dosareDao, IstoricActiuniDao istoricActiuniDao, LogNotificariService logNotificariService){
        this.istoricActiuniDao=istoricActiuniDao;
        this.dosareDao = dosareDao;
        this.logNotificariService = logNotificariService;
    }
    public void AdaugareMonitorizare(DosareMonitorizate dosareMonitorizate){
        dosareDao.AdaugareMonitorizare(dosareMonitorizate);
        istoricActiuniDao.AdaugareMonitorizare(dosareMonitorizate);
        logNotificariService.save(String.valueOf(dosareMonitorizate.getIdClient()), dosareMonitorizate.getNumarDosar(), "adaugare la monitorizare");
    }
    public void ScoatereMonitorizare(DosareMonitorizate dosareMonitorizate){
        dosareDao.ScoatereMonitorizare(dosareMonitorizate);
        istoricActiuniDao.ScoatereMonitorizare(dosareMonitorizate);
        logNotificariService.save(String.valueOf(dosareMonitorizate.getIdClient()), dosareMonitorizate.getNumarDosar(), "scoatere de la monitorizare");
    }
    public void DeactivareMonitorizare(DosareMonitorizate dosareMonitorizate){
        dosareDao.DeactivareMonitorizare(dosareMonitorizate);
        istoricActiuniDao.DeactivareMonitorizare(dosareMonitorizate);
        logNotificariService.save(String.valueOf(dosareMonitorizate.getIdClient()), dosareMonitorizate.getNumarDosar(), "dezactivare monitorizare");
    }
    public void ReactivareMonitorizare(DosareMonitorizate dosareMonitorizate){
        dosareDao.ReactivareMonitorizare(dosareMonitorizate);
        istoricActiuniDao.ReactivareMonitorizare(dosareMonitorizate);
        logNotificariService.save(String.valueOf(dosareMonitorizate.getIdClient()), dosareMonitorizate.getNumarDosar(), "reactivare monitorizare");
    }
}
