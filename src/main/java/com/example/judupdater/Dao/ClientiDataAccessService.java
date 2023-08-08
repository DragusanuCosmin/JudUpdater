package com.example.judupdater.Dao;

import com.example.judupdater.Entities.Clienti;
import com.example.judupdater.Entities.ContacteClienti;
import com.example.judupdater.Mapper.ClientiRowMapper;
import com.example.judupdater.Mapper.ContacteClientiRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("ClientiDao")
public class ClientiDataAccessService implements ClientiDao{
    private final JdbcTemplate jdbcTemplate;
    public ClientiDataAccessService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Deprecated
    public ContacteClienti getClienti(int dosarId) {
        final String sql= "SELECT c.* FROM dosare_clienti d JOIN clienti c ON d.id_client = c.id WHERE d.id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{dosarId}, new ContacteClientiRowMapper());
    }

    @Override
    @Deprecated
    public Clienti gasireClient(int id) {
        final String sql= "SELECT * FROM clienti WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new ClientiRowMapper());
    }
}
