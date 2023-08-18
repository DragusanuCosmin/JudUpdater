package com.example.judupdater.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class IstoricNotificari {
    private int id;
    private int idClient;
    private String numarDosar;
    private Date data;
    private String modalitate;
}
