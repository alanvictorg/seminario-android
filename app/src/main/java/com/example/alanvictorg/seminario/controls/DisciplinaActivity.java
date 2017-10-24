package com.example.alanvictorg.seminario.controls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.alanvictorg.seminario.R;

public class DisciplinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina);
        Intent intent = getIntent();
        String parametroNome = (String) intent.getSerializableExtra("nomeDisc");
        TextView nomeDisc = (TextView) findViewById(R.id.txtNomeDisc);

        nomeDisc.setText(parametroNome);
    }
}
