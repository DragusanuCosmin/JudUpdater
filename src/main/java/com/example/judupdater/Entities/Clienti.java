package com.example.judupdater.Entities;

public class Clienti {
    private int id;
    private String email;
    private String telefon;
    private String firebaseId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFirebaseId() {
        return firebaseId;
    }

    public void setFirebaseId(String firebaseId) {
        this.firebaseId = firebaseId;
    }

    public Clienti(int id, String email, String telefon, String firebaseId) {
        this.email = email;
        this.telefon = telefon;
        this.id = id;
        this.firebaseId = firebaseId;
    }

}
