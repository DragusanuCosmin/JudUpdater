package com.example.judupdater.Mapper;

import com.example.judupdater.Entities.Dosare;
import org.springframework.jdbc.core.RowMapper;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DosareRowMapper implements RowMapper<Dosare> {
    @Override
    public Dosare mapRow(ResultSet rs, int rowNum) {
         int id;
         int idClient;
         String numarDosar;
         String notifEmail
                 ,notifSMS
                 ,detaliiDosar;
         long timestamp;
        try {
            id = rs.getInt("id");
            idClient = rs.getInt("idClient");
            numarDosar = rs.getString("numarDosar");
            notifEmail = rs.getString("notifEmail");
            notifSMS = rs.getString("notifSMS");
            detaliiDosar = rs.getString("detaliiDosar");
            timestamp = rs.getLong("timestamp");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new Dosare(id,idClient,numarDosar,notifEmail,notifSMS,detaliiDosar,timestamp);
    }
}
