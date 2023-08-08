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
        String denumire;
        String licenta;
        String detalii;
        Date dataCreare;
        String valid;
        try {
            id = rs.getInt("id");
            denumire = rs.getString("denumire");
            licenta = rs.getString("licenta");
            detalii = rs.getString("detalii");
            dataCreare= rs.getDate("dataCreare");
            valid = rs.getString("valid");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return new Clienti(id,denumire,licenta,detalii,dataCreare,valid);
    }

}
