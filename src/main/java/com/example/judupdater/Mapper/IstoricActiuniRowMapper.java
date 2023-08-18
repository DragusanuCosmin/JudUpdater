package com.example.judupdater.Mapper;

import com.example.judupdater.Entities.DosareMonitorizate;
import com.example.judupdater.Entities.IstoricActiuni;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class IstoricActiuniRowMapper implements RowMapper<IstoricActiuni> {
    @Override
    public IstoricActiuni mapRow(ResultSet rs, int rowNum) {
         int id_dosar;
         int id_client;
         String actiune;
         Date data;
        try {
            id_dosar = rs.getInt("id_dosar");
            id_client = rs.getInt("id_client");
            actiune=rs.getString("actiune");
            data = rs.getDate("data");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new IstoricActiuni(id_dosar,id_client,actiune,data);
    }
}
