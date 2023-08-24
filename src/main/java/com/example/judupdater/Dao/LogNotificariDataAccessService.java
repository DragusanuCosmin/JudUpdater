package com.example.judupdater.Dao;

import com.example.judupdater.Entities.Clienti;
import com.example.judupdater.Entities.DosareSolr;
import com.example.judupdater.Mapper.ClientiRowMapper;
import com.example.judupdater.Mapper.DosareSolrRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Repository("IstoricNotificariDao")
public class LogNotificariDataAccessService implements LogNotificariDao {
    public final JdbcTemplate jdbcTemplate;
    final String LOG_FILE_PATH = "./istoricnotificari.log";
    @Autowired
    public LogNotificariDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(String idClient, String idDosar,String actiune) {
        try {
            int lastId = getLastWrittenId();
            int newId = lastId + 1;
            String timestamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
            String logMessage = timestamp + ":Notificare nr." + newId + ":: Notificare pentru " + actiune +
                    " trimisa la adresa " + gasireClient(idClient).getEmail() +
                    " in dosarul cu numarul " + gasireDosar(idDosar).getNumardosar() + "\n";

            FileWriter fileWriter = new FileWriter(LOG_FILE_PATH, true);
            fileWriter.write(logMessage);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void customsave(String message){
        try {
            int lastId = getLastWrittenId();
            int newId = lastId + 1;
            String timestamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
            String logMessage = timestamp + ":Notificare nr." + newId +"::"+ message+ "\n";

            FileWriter fileWriter = new FileWriter(LOG_FILE_PATH, true);
            fileWriter.write(logMessage);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private int getLastWrittenId() throws IOException {
        String lastLine = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("./istoricnotificari.log"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lastLine = line;
            }
        }
        int nrIndex = lastLine.indexOf("nr.");

        if (nrIndex != -1) {
            String idPart = lastLine.substring(nrIndex + 3).trim();
            return Integer.parseInt(idPart);
        } else {
            return 0;
        }
    }
    public Clienti gasireClient(String id) {
        final String sql= "SELECT * FROM clienti WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new ClientiRowMapper(), id);
    }
    public DosareSolr gasireDosar(String id) {
        final String sql= "SELECT * FROM dosaresolr WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new DosareSolrRowMapper(), id);
    }
    }
