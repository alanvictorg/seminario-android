package com.example.alanvictorg.seminario.models;

/**
 * Created by Alan Victor G on 11/09/2017.
 */

public class UserParameter {
    private String email;
    private String password;

    public UserParameter(String email, String password)
    {
        this.email = email;

        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
