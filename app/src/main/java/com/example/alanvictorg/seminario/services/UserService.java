package com.example.alanvictorg.seminario.services;

import com.example.alanvictorg.seminario.models.User;
import com.example.alanvictorg.seminario.models.UserParameter;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Alan Victor G on 11/09/2017.
 */

public interface UserService {
    public static final String BASE_URL = "http://127.0.0.1:8000/api/";

    @POST("auth/student/student-login")
    Call<User> logar(@Body UserParameter userParameter);
}
