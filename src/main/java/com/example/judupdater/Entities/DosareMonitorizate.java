package com.example.judupdater.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@AllArgsConstructor

public class DosareMonitorizate {
    private int id;
    private int idClient;
    private String numarDosar;
    private Aplicatie  aplicatie;
    private String instanta;
    private iLegisUser contIlegis;
    private Date dataMonitorizare;
}
