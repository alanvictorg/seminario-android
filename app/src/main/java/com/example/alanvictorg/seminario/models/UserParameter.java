package com.example.alanvictorg.seminario.models;

/**
 * Created by Alan Victor G on 11/09/2017.
 */

public class UserParameter {
    private String email;
    private String senha;

    public UserParameter(String email, String senha)
    {
        this.email = null;
        this.senha = null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
