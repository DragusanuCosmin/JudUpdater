package com.example.judupdater.Entities;

import java.util.Date;


public class IstoricNotificari {
    private int id;
    private int idClient;
    private String numarDosar;
    private Date data;

    public IstoricNotificari(int id, int idClient, String numarDosar, Date data) {
        this.id = id;
        this.idClient = idClient;
        this.numarDosar = numarDosar;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNumarDosar() {
        return numarDosar;
    }

    public void setNumarDosar(String numarDosar) {
        this.numarDosar = numarDosar;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
