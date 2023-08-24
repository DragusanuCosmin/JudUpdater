package com.example.judupdater.Listener;

import com.example.judupdater.Entities.Clienti;
import com.example.judupdater.Entities.DosareMonitorizate;
import com.example.judupdater.Mapper.ClientiRowMapper;
import com.example.judupdater.Mapper.DosareRowMapper;
import com.example.judupdater.Service.ActualizareDosarService;
import com.example.judupdater.Service.EmailService;
import com.example.judupdater.Service.LogNotificariService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Component
public class KafkaMessageListener {
    private final EmailService emailSenderService;
    private final LogNotificariService logNotificariService;
    private final JdbcTemplate jdbcTemplate;
    private final ActualizareDosarService actualizareDosarService;
    @Autowired
    public KafkaMessageListener(EmailService emailSenderService, LogNotificariService logNotificariService, JdbcTemplate jdbcTemplate, ActualizareDosarService actualizareDosarService) {
        this.emailSenderService = emailSenderService;
        this.logNotificariService = logNotificariService;
        this.jdbcTemplate = jdbcTemplate;
        this.actualizareDosarService = actualizareDosarService;
    }
    @KafkaListener(topics = "dosare_noi", groupId = "test-consumer-group")
    public void listen(String nrDosar) {
        List<DosareMonitorizate> dosare = gasireDosar(nrDosar);
        try {
            for (DosareMonitorizate dosar : dosare) {
                emailSenderService.sendMessage(gasireClient(String.valueOf(dosar.getIdClient())).getEmail(),"Schimbarea dosarului" , String.format("Dosarul cu numarul %s a fost schimbat", nrDosar));
                logNotificariService.save(null, dosar.getNumarDosar(), "actualizare");
                actualizareDosarService.actualizare(dosar.getNumarDosar());
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
    public Clienti gasireClient(String id) {
        final String sql= "SELECT * FROM clienti WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new ClientiRowMapper(), id);
    }
    public List<DosareMonitorizate> gasireDosar(String nrDosar) {
        final String sql= "SELECT * FROM dosareMonitorizate WHERE nr_dosar = ?";
        return jdbcTemplate.query(sql, new DosareRowMapper(), nrDosar);
    }

}
