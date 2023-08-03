package com.example.judupdater.Entities;

public class Dosare {
    private int id;
    private int idClient;
    private String numarDosar;
    private char notifEmail;
    private char notifSMS;
    private String detaliiDosar;
    private long timestamp;

    public Dosare(int id, int idClient, String numarDosar, char notifEmail, char notifSMS, String detaliiDosar, long timestamp) {
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

    public char getNotifEmail() {
        return notifEmail;
    }

    public void setNotifEmail(char notifEmail) {
        this.notifEmail = notifEmail;
    }

    public char getNotifSMS() {
        return notifSMS;
    }

    public void setNotifSMS(char notifSMS) {
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
