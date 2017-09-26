package com.example.alanvictorg.seminario.models;

import java.io.Serializable;

/**
 * Created by Alan Victor G on 25/09/2017.
 */

public class Profile implements Serializable {
    private User user;

    public Profile(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
