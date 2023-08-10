//package com.example.judupdater.Mapper;
//
//import com.example.judupdater.Entities.Aplicatie;
//import com.example.judupdater.Entities.DosareMonitorizate;
//import com.example.judupdater.Entities.iLegisUser;
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Date;
//
//public class DosareRowMapper implements RowMapper<DosareMonitorizate> {
//    @Override
//    public DosareMonitorizate mapRow(ResultSet rs, int rowNum) {
//         int id;
//         int idClient;
//         String numarDosar;
//         Aplicatie aplicatie;
//         String instanta;
//         iLegisUser contIlegis;
//         Date dataMonitorizare;
//        try {
//            id = rs.getInt("id");
//            idClient = rs.getInt("idClient");
//            numarDosar = rs.getString("numarDosar");
//            switch (rs.getString("aplicatie")) {
//                case "ILEGIS" -> aplicatie = Aplicatie.ILEGIS;
//                case "ILEGIS_MOBILE" -> aplicatie = Aplicatie.ILEGIS_MOBILE;
//                case "JURISTPRO_LIGHT" -> aplicatie = Aplicatie.JURISTPRO_LIGHT;
//                case "JURISTPRO_PRO" -> aplicatie = Aplicatie.JURISTPRO_PRO;
//            }
//            timestamp = rs.getLong("timestamp");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return new DosareMonitorizate(id,idClient,numarDosar,aplicatie,notifSMS,detaliiDosar,timestamp);
//    }
//}
