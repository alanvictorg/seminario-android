package com.example.alanvictorg.seminario.models;

import java.io.Serializable;

/**
 * Created by fortes on 31/10/2017.
 */

public class Professor implements Serializable {
    private String id;
    private String login;
    private String nome;
    private String email;
    private String created_at;
    private String updated_at;

    public Professor(String id, String login, String nome, String email, String created_at, String updated_at) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.email = email;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
