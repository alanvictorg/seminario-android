package com.example.alanvictorg.seminario.services;

import com.example.alanvictorg.seminario.models.User;
import com.example.alanvictorg.seminario.models.UserParameter;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Field;


/**
 * Created by Alan Victor G on 11/09/2017.
 */

public interface UserService {
    public static final String BASE_URL = "http://192.168.25.13:8000/api/";

    @POST("auth/student-login")
    Call<User> logar(@Body UserParameter userParameter);
}
