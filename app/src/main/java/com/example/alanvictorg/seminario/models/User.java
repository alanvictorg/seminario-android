package com.example.alanvictorg.seminario.models;

import java.io.Serializable;

/**
 * Created by Alan Victor G on 11/09/2017.
 */

public class User implements Serializable{
    private String nome;
    private String email;

    public User() {
        nome = null;
        email = null;
    }

    public User(String nome, String email){
        this.nome = nome;
        this.email = email;
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
