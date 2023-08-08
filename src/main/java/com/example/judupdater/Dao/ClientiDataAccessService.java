package com.example.judupdater.Dao;

import com.example.judupdater.Entities.Clienti;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("ClientiDao")
public class ClientiDataAccessService implements ClientiDao{
    private final JdbcTemplate jdbcTemplate;
    public ClientiDataAccessService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Clienti getClienti(int dosarId) {
        final String sql="SELECT c.*" +
                "FROM dosar d" +
                "JOIN clienti c ON d.clientId = c.clientId" +
                "WHERE d.dosarId = ?";
        return jdbcTemplate.update(sql, dosarId);
    }
}
