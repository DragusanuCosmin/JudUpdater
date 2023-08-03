package com.example.judupdater.Entities;

public class Message {
    private int id;
    private int idClient;
    private String content;
    private long timestamp;

    public Message(int id,int idClient, String content, long timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
        this.idClient = idClient;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
