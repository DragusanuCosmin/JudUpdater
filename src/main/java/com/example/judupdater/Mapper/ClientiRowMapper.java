package com.example.judupdater.Mapper;

import com.example.judupdater.Entities.Clienti;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ClientiRowMapper implements RowMapper<Clienti> {
    @Override
    public Clienti mapRow(ResultSet rs, int rowNum) {
        int id;
        String email;
        String telefon;
        String firebaseId;
        try {
            id = rs.getInt("id");
            email = rs.getString("email");
            telefon = rs.getString("telefon");
            firebaseId = rs.getString("firebaseId");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return new Clienti(id,email,telefon,firebaseId);
    }

}
