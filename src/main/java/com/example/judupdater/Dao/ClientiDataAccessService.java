package com.example.judupdater.Dao;

import com.example.judupdater.Entities.Clienti;
import com.example.judupdater.Mapper.ClientiRowMapper;
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
    public Clienti gasireClient(int id) {
        final String sql= "SELECT * FROM clienti WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new ClientiRowMapper());
    }
}
