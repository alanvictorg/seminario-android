package com.example.alanvictorg.seminario.controls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.alanvictorg.seminario.R;

public class MainActivity extends AppCompatActivity {

    TextView txtNome;
    TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = (TextView) findViewById(R.id.txtPrincipalNome);
        txtEmail = (TextView) findViewById(R.id.txtPrincipalEmail);

        Intent it = getIntent();

        String nome = it.getStringExtra("nome");
        txtNome.setText(nome);

        String email = it.getStringExtra("email");
        txtEmail.setText(email);

    }
}
