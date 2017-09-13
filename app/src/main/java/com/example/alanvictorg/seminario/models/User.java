package com.example.alanvictorg.seminario.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Alan Victor G on 11/09/2017.
 */

public class User implements Serializable{
    private String id;
    private String nome;
    private String email;
    private String token;
    private Date created_at;
    private Date updated_at;

    public User() {
        nome = null;
        email = null;
    }

    public User(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
