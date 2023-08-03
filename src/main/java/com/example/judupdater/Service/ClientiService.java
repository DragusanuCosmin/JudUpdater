package com.example.judupdater.Service;

import com.example.judupdater.Entities.Clienti;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ClientiService {
    private final Map<Integer, Clienti> clients = new HashMap<>();
    public void addClient(Clienti client) {
        clients.put(client.getId(), client);
    }
    public Clienti getClientById(int idClient) {
        return clients.get(idClient);
    }
}

