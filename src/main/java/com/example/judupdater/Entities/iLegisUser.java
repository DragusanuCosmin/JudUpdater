package com.example.judupdater.Entities;

public class iLegisUser {
    private String nume;
    private String parola;

    public iLegisUser(String nume, String parola) {
        this.nume = nume;
        this.parola = parola;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}
