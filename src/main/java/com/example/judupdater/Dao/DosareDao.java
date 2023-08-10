package com.example.judupdater.Dao;

import com.example.judupdater.Entities.DosareMonitorizate;

import java.util.List;
import java.util.Optional;

public interface DosareDao {
    Optional<List<DosareMonitorizate>> getDosare(int clientId);

}
