package com.example.judupdater.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@Getter
@Setter

public class IstoricActiuni {
    private int id_dosar;
    private int id_client;
    private String actiune;
    private Date data;

}
