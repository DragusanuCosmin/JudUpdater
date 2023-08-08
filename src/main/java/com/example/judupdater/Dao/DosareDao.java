package com.example.judupdater.Dao;

import com.example.judupdater.Entities.Dosare;

import java.util.List;
import java.util.Optional;

public interface DosareDao {
    Optional<List<Dosare>> getDosare(int clientId);

}
