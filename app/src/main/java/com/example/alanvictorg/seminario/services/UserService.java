package com.example.alanvictorg.seminario.services;

import com.example.alanvictorg.seminario.models.Turma;
import com.example.alanvictorg.seminario.models.User;
import com.example.alanvictorg.seminario.models.UserParameter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Field;
import retrofit2.http.Path;
import retrofit2.http.Query;


/**
 * Created by Alan Victor G on 11/09/2017.
 */

public interface UserService {
    public static final String BASE_URL = "http://192.168.56.1:8000/api/";

    @POST("auth/student-login")
    Call<User> logar(@Body UserParameter userParameter);

    @GET("student/getClasses/{id}")
    Call<List<Turma>> getClasses(@Path("id") String id );
}
