package com.example.judupdater.Mapper;

import com.example.judupdater.Entities.Aplicatie;
import com.example.judupdater.Entities.DosareMonitorizate;
import com.example.judupdater.Entities.iLegisUser;
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
         Aplicatie aplicatie=null;
         String instanta;
         iLegisUser contIlegis;
         Date dataMonitorizare;
        try {
            id = rs.getInt("id");
            idClient = rs.getInt("idClient");
            numarDosar = rs.getString("numarDosar");
            switch(rs.getString("aplicatioe")){
                case "ILEGIS":
                    aplicatie = Aplicatie.ILEGIS;
                    break;
                    case "ILEGIS_MOBILE":
                    aplicatie = Aplicatie.ILEGIS_MOBILE;
                    break;
                    case "JURISTPRO_LIGHT":
                    aplicatie = Aplicatie.JURISTPRO_LIGHT;
                    break;
                    case "JURISTPRO_PRO":
                    aplicatie = Aplicatie.JURISTPRO_PRO;
                    break;
            }
            instanta = rs.getString("instanta");
            contIlegis = new iLegisUser(rs.getString("nume"), rs.getString("parola"));
            dataMonitorizare = rs.getDate("dataMonitorizare");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new DosareMonitorizate(id,idClient,numarDosar,aplicatie,instanta,contIlegis,dataMonitorizare);
    }
}
