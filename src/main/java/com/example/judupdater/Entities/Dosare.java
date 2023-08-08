package com.example.judupdater.Entities;

public class Dosare {
    private int id;
    private int idClient;
    private String numarDosar;
    private String notifEmail;
    private String notifSMS;
    private String detaliiDosar;
    private long timestamp;

    public Dosare(int id, int idClient, String numarDosar, String notifEmail, String notifSMS, String detaliiDosar, long timestamp) {
        this.id = id;
        this.idClient = idClient;
        this.numarDosar = numarDosar;
        this.notifEmail = notifEmail;
        this.notifSMS = notifSMS;
        this.detaliiDosar = detaliiDosar;
        this.timestamp = timestamp;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumarDosar() {
        return numarDosar;
    }

    public void setNumarDosar(String numarDosar) {
        this.numarDosar = numarDosar;
    }

    public String getNotifEmail() {
        return notifEmail;
    }

    public void setNotifEmail(String notifEmail) {
        this.notifEmail = notifEmail;
    }

    public String getNotifSMS() {
        return notifSMS;
    }

    public void setNotifSMS(String notifSMS) {
        this.notifSMS = notifSMS;
    }

    public String getDetaliiDosar() {
        return detaliiDosar;
    }

    public void setDetaliiDosar(String detaliiDosar) {
        this.detaliiDosar = detaliiDosar;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
