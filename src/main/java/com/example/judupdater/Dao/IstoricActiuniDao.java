package com.example.judupdater.Dao;

import com.example.judupdater.Entities.DosareMonitorizate;

public interface IstoricActiuniDao {
    void AdaugareMonitorizare(DosareMonitorizate dosareMonitorizate);
    void ScoatereMonitorizare(DosareMonitorizate dosareMonitorizate);
    void DeactivareMonitorizare(DosareMonitorizate dosareMonitorizate);
    void ReactivareMonitorizare(DosareMonitorizate dosareMonitorizate);
}
