package com.example.judupdater.Entities;

import java.util.Date;

public class DosareMonitorizate {
    private int id;
    private int idClient;
    private String numarDosar;
    private Aplicatie  aplicatie;
    private String instanta;
    private iLegisUser contIlegis;
    private Date dataMonitorizare;

    public DosareMonitorizate(int id, int idClient, String numarDosar, Aplicatie  aplicatie,String instanta, iLegisUser contIlegis, Date dataMonitorizare) {
        this.id = id;
        this.idClient = idClient;
        this.numarDosar = numarDosar;
        this.aplicatie=aplicatie;
        this.instanta=instanta;
        this.contIlegis=contIlegis;
        this.dataMonitorizare=dataMonitorizare;
    }

    public Aplicatie  getAplicatie() {
        return aplicatie;
    }
    public void setAplicatie(Aplicatie  aplicatie) {
        this.aplicatie = aplicatie;
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

    public String getInstanta() {
        return instanta;
    }

    public void setInstanta(String instanta) {
        this.instanta = instanta;
    }

    public iLegisUser getContIlegis() {
        return contIlegis;
    }

    public void setContIlegis(iLegisUser contIlegis) {
        this.contIlegis = contIlegis;
    }

    public Date getDataMonitorizare() {
        return dataMonitorizare;
    }

    public void setDataMonitorizare(Date dataMonitorizare) {
        this.dataMonitorizare = dataMonitorizare;
    }
}
