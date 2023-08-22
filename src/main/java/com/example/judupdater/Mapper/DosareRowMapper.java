package com.example.judupdater.Mapper;

import com.example.judupdater.Entities.DosareMonitorizate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DosareRowMapper implements RowMapper<DosareMonitorizate> {
    @Override
    public DosareMonitorizate mapRow(ResultSet rs, int rowNum) {
        int id;
        int idClient;
        String numarDosar;
        String aplicatie;
        String instanta;
        String contIlegis;
        Date dataMonitorizare;
        boolean activ;
        try {
            id = rs.getInt("id");
            idClient = rs.getInt("id_dlient");
            numarDosar = rs.getString("nr_dosar");
            aplicatie=rs.getString("aplicatie_monitorizare");
            instanta = rs.getString("instanta_monitorizare");
            contIlegis = rs.getString("cont_ilegis");
            dataMonitorizare = rs.getDate("data_monitorizare");
            activ=rs.getInt("activ")==1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new DosareMonitorizate(id,idClient,numarDosar,aplicatie,instanta,contIlegis,dataMonitorizare,activ);
    }
}
