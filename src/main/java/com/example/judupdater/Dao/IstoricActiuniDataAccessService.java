package com.example.judupdater.Dao;

import com.example.judupdater.Entities.DosareMonitorizate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
@Repository("IstoricActiuni")
public class IstoricActiuniDataAccessService implements IstoricActiuniDao {
    private final JdbcTemplate jdbcTemplate;
    public IstoricActiuniDataAccessService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void AdaugareMonitorizare(DosareMonitorizate dosareMonitorizate) {
        final String sql="INSERT INTO istoricActiuni(id_dosar,id_client,actiune,data) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql,dosareMonitorizate.getId(),dosareMonitorizate.getIdClient(),"Incepere Monitorizare", LocalDate.now());
    }

    @Override
    public void ScoatereMonitorizare(DosareMonitorizate dosareMonitorizate) {
        final String sql="INSERT INTO istoricActiuni(id_dosar,id_client,actiune,data) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql,dosareMonitorizate.getId(),dosareMonitorizate.getIdClient(),"Scoatere Monitorizare", LocalDate.now());
    }

    @Override
    public void DeactivareMonitorizare(DosareMonitorizate dosareMonitorizate) {
        final String sql="INSERT INTO istoricActiuni(id_dosar,id_client,actiune,data) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql,dosareMonitorizate.getId(),dosareMonitorizate.getIdClient(),"Suspendare Monitorizare", LocalDate.now());
    }

    @Override
    public void ReactivareMonitorizare(DosareMonitorizate dosareMonitorizate) {
        final String sql="INSERT INTO istoricActiuni(id_dosar,id_client,actiune,data) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql,dosareMonitorizate.getId(),dosareMonitorizate.getIdClient(),"Reluare Monitorizare", LocalDate.now());

    }
}
