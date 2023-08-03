    package com.example.judupdater.Entities;

    public class Clienti {
        private int id;
        private String nume;
        private String email;
        private char valid;

        public Clienti(int id, String nume, String email, char valid) {
            this.id = id;
            this.nume = nume;
            this.email = email;
            this.valid = valid;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNume() {
            return nume;
        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getValid() {
            return valid;
        }

        public void setValid(char valid) {
            this.valid = valid;
        }
    }
