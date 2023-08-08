package com.example.judupdater.Mapper;

import com.example.judupdater.Entities.ContacteClienti;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContacteClientiRowMapper implements RowMapper<ContacteClienti> {
    @Override
    public ContacteClienti mapRow(ResultSet rs, int rowNum) {
         int id;
         String
                 email,
                 dataCreare;
         int idClient;
         String valid;
        try {
            id = rs.getInt("id");
            idClient = rs.getInt("id_client");
            email = rs.getString("email");
            dataCreare= rs.getString("data_creare");
            valid = rs.getString("valid");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new ContacteClienti(id,dataCreare,email,idClient,valid);
    }
}
