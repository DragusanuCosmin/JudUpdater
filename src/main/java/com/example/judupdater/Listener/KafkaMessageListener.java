package com.example.judupdater.Listener;

import com.example.judupdater.Entities.Clienti;
import com.example.judupdater.Entities.DosareSolr;
import com.example.judupdater.Mapper.ClientiRowMapper;
import com.example.judupdater.Mapper.DosareSolrRowMapper;
import com.example.judupdater.Service.EmailService;
import com.example.judupdater.Service.LogNotificariService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class KafkaMessageListener {
    private final EmailService emailSenderService;
    private final LogNotificariService logNotificariService;
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public KafkaMessageListener(EmailService emailSenderService, LogNotificariService logNotificariService, JdbcTemplate jdbcTemplate) {
        this.emailSenderService = emailSenderService;
        this.logNotificariService = logNotificariService;
        this.jdbcTemplate = jdbcTemplate;
    }
    @KafkaListener(topics = "dosare_noi", groupId = "test-consumer-group")
    public void listen(String nrDosar) {
        DosareSolr dosar = gasireDosar(String.valueOf(Integer.parseInt(nrDosar.split("/")[0])));
        Clienti client = gasireClient(String.valueOf(Integer.parseInt(nrDosar.split("/")[1])));
        try {
           // emailSenderService.sendMessage("gabrielcosmin402@gmail.com","Schimbarea dosarului" , String.format("Dosarul cu numarul %d a fost schimbat", dosarId));
            logNotificariService.save(String.valueOf(client.getId()), dosar.getNumardosar(), "actualizare");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
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
