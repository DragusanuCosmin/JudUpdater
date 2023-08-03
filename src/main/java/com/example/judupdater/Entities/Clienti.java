package com.example.judupdater.Entities;

import java.sql.Timestamp;

public class Clienti {
    public int id;
    public String denumire;
    public String licenta;
    public String detalii;
    public Timestamp dataCreare;
    public char valid;
    public Clienti(int id, String denumire, String licenta, String detalii, Timestamp dataCreare, char valid) {
        this.id = id;
        this.denumire = denumire;
        this.licenta = licenta;
        this.detalii = detalii;
        this.dataCreare = dataCreare;
        this.valid = valid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getLicenta() {
        return licenta;
    }

    public void setLicenta(String licenta) {
        this.licenta = licenta;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public Timestamp getDataCreare() {
        return dataCreare;
    }

    public void setDataCreare(Timestamp dataCreare) {
        this.dataCreare = dataCreare;
    }

    public char getValid() {
        return valid;
    }

    public void setValid(char valid) {
        this.valid = valid;
    }
}
