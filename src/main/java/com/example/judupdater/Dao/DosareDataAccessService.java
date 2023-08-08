package com.example.judupdater.Dao;

import com.example.judupdater.Entities.Dosare;
import com.example.judupdater.Mapper.DosareRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository("DosareDao")
public class DosareDataAccessService implements DosareDao {
    private final JdbcTemplate jdbcTemplate;
    public DosareDataAccessService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Optional<List<Dosare>> getDosare(int clientId) {
        final String sql="SELECT * from dosare_clienti where id_client = ?";
        try {
            return Optional.of(jdbcTemplate.query(sql, new DosareRowMapper(), clientId));
        } catch (RuntimeException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
