package com.example.judupdater.Dao;

import com.example.judupdater.Entities.Clienti;
import com.example.judupdater.Entities.ContacteClienti;

public interface ClientiDao {
    ContacteClienti getClienti(int dosarId);
    Clienti gasireClient(int id);
}
