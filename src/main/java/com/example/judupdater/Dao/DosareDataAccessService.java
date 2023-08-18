package com.example.judupdater.Dao;

import com.example.judupdater.Entities.DosareMonitorizate;
import com.example.judupdater.Mapper.DosareRowMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("DosareDao")
public class DosareDataAccessService implements DosareDao {
    private final JdbcTemplate jdbcTemplate;
    public DosareDataAccessService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void AdaugareMonitorizare(DosareMonitorizate dosareMonitorizate) {
        final String sql="INSERT INTO dosareMonitorizate (id,id_client,nr_dosar,aplicatie_monitorizare,instanta_monitorizare,cont_ilegis,data_monitorizare,activ) VALUES (?,?,?,?,?,?,?,1)";
        jdbcTemplate.update(sql,dosareMonitorizate.getId(),dosareMonitorizate.getIdClient(),dosareMonitorizate.getNumarDosar(),dosareMonitorizate.getAplicatie(),dosareMonitorizate.getInstanta(),dosareMonitorizate.getContIlegis(),dosareMonitorizate.getDataMonitorizare());
    }

    @Override
    public void ScoatereMonitorizare(DosareMonitorizate dosareMonitorizate) {
        final String sql="DELETE FROM dosareMonitorizate WHERE id=?";
        jdbcTemplate.update(sql,dosareMonitorizate.getId());
    }

    @Override
    public void DeactivareMonitorizare(DosareMonitorizate dosareMonitorizate) {
        final String sql="UPDATE dosareMonitorizate SET activ = 0 WHERE id= ?";
        jdbcTemplate.update(sql,dosareMonitorizate.getId());
    }

    @Override
    public void ReactivareMonitorizare(DosareMonitorizate dosareMonitorizate) {
        final String sql="UPDATE dosareMonitorizate SET activ = 1 WHERE id= ?";
        jdbcTemplate.update(sql,dosareMonitorizate.getId());
    }
}
