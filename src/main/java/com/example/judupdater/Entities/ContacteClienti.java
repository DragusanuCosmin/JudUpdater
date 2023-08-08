package com.example.judupdater.Entities;

public class ContacteClienti {
    private int id;
    private int id_client;
    private String
            data_creare,
            email,
            valid;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getData_creare() {
        return data_creare;
    }

    public void setData_creare(String data_creare) {
        this.data_creare = data_creare;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public ContacteClienti(int id, String data_creare, String email, int id_client,String valid) {
        this.id = id;
        this.id_client = id_client;
        this.data_creare = data_creare;
        this.email = email;
        this.valid = valid;
    }





}
