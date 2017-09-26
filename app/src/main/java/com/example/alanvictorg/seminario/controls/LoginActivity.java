package com.example.alanvictorg.seminario.controls;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alanvictorg.seminario.R;
import com.example.alanvictorg.seminario.models.User;
import com.example.alanvictorg.seminario.models.UserParameter;
import com.example.alanvictorg.seminario.services.UserService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Alan Victor G on 11/09/2017.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtEmail;
    EditText edtPassword;
    TextView mTextMensagem;
    ProgressBar mProgressBar;
    Context _this;

    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        _this = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.addInterceptor(loggingInterceptor);


        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassword = (EditText) findViewById(R.id.edtSenha);

        View view = getLayoutInflater().inflate(R.layout.activity_login, null);
        mTextMensagem = (TextView) view.findViewById(android.R.id.empty);
//        mProgressBar = (ProgressBar) view.findViewById(R.id.progressBar);

        Button btnLogin = (Button) findViewById(R.id.btnEntrar);
        btnLogin.setOnClickListener(this);


        retrofit = new Retrofit.Builder()
                .baseUrl(UserService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClientBuilder.build())
                .build();

    }


    @Override
    public void onClick(View view) {
        String email = edtEmail.getText().toString();
        String senha = edtPassword.getText().toString();
        UserParameter user = new UserParameter(email, senha);

        UserService service = retrofit.create(UserService.class);

        Call<User> requestLogin = service.logar(user);
        requestLogin.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (!response.isSuccessful())
                {
                    Log.i("TAG", " sem sucesso " + response.code());
                } else {
                    // Requisição retornou com sucesso
                    User retorno = response.body();

                    Intent intent = new Intent(_this, MainActivity.class);
                    intent.putExtra("user_id", retorno.getId());
                    startActivity(intent);
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "Erro :(", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
