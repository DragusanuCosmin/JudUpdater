package com.example.judupdater.Service;

import com.example.judupdater.Dao.LogNotificariDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogNotificariService {
    public final LogNotificariDao logNotificariDao;
    @Autowired
    public LogNotificariService(LogNotificariDao logNotificariDao) {
        this.logNotificariDao = logNotificariDao;
    }
    public void save(String idClient, String idDosar, String actiune){
        logNotificariDao.save(idClient, idDosar, actiune);
    }
}
