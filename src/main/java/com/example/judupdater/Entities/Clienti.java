package com.example.judupdater.Entities;

import java.util.Date;

public class Clienti {
    private String denumire;
    private String licenta;
    private String detalii;
    private Date data_creare;
    private String valid;
    private int id;

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

    public Date getData_creare() {
        return data_creare;
    }

    public void setData_creare(Date data_creare) {
        this.data_creare = data_creare;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public Clienti(int id, String denumire, String licenta, String detalii,Date data_creare, String valid) {
        this.id = id;
        this.denumire = denumire;
        this.licenta = licenta;
        this.detalii = detalii;
        this.data_creare = data_creare;
        this.valid = valid;
    }

}
