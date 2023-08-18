package com.example.judupdater.Service;

import com.example.judupdater.Dao.DosareDao;
import com.example.judupdater.Dao.IstoricActiuniDao;
import com.example.judupdater.Entities.DosareMonitorizate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MonitorizareService {
    private final DosareDao dosareDao;
    private final IstoricActiuniDao istoricActiuniDao;
    @Autowired
    public MonitorizareService(DosareDao dosareDao,IstoricActiuniDao istoricActiuniDao){
        this.istoricActiuniDao=istoricActiuniDao;
        this.dosareDao = dosareDao;
    }
    public void AdaugareMonitorizare(DosareMonitorizate dosareMonitorizate){
        dosareDao.AdaugareMonitorizare(dosareMonitorizate);
        istoricActiuniDao.AdaugareMonitorizare(dosareMonitorizate);
    }
    public void ScoatereMonitorizare(DosareMonitorizate dosareMonitorizate){
        dosareDao.ScoatereMonitorizare(dosareMonitorizate);
        istoricActiuniDao.ScoatereMonitorizare(dosareMonitorizate);
    }
    public void DeactivareMonitorizare(DosareMonitorizate dosareMonitorizate){
        dosareDao.DeactivareMonitorizare(dosareMonitorizate);
        istoricActiuniDao.DeactivareMonitorizare(dosareMonitorizate);
    }
    public void ReactivareMonitorizare(DosareMonitorizate dosareMonitorizate){
        dosareDao.ReactivareMonitorizare(dosareMonitorizate);
        istoricActiuniDao.ReactivareMonitorizare(dosareMonitorizate);
    }
}
