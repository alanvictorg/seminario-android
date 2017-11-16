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

        String parametroNomeDisc = (String) intent.getSerializableExtra("nomeDisc");
        TextView nomeDisc = (TextView) findViewById(R.id.txtNomeDisc);

        String parametroAnoDisc = (String) intent.getSerializableExtra("anoDisc");
        TextView anoDisc = (TextView) findViewById(R.id.txtAnoDisc);

        String parametroNomeProf = (String) intent.getSerializableExtra("nomeProf");
        TextView nomeProf = (TextView) findViewById(R.id.txtNomeProf);

        anoDisc.setText(parametroAnoDisc);
        nomeDisc.setText(parametroNomeDisc);
        nomeProf.setText(parametroNomeProf);
    }
}
