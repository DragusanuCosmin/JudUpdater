package com.example.judupdater.Service;
import com.example.judupdater.Dao.ActualizareDosarDao;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActualizareDosarService {
    public final ActualizareDosarDao actualizareDosarDao;
    @Autowired
    public ActualizareDosarService(ActualizareDosarDao actualizareDosarDao) {
        this.actualizareDosarDao = actualizareDosarDao;
    }
    public void actualizare(String numarDosar){
        actualizareDosarDao.actualizareDosar(StringEscapeUtils.escapeJava(numarDosar));
    }
}

