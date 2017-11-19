package com.example.alanvictorg.seminario.controls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        String parametroN1 = (String) intent.getSerializableExtra("n1");
        TextView n1 = (TextView) findViewById(R.id.txtN1);

        String parametroN2 = (String) intent.getSerializableExtra("n2");
        TextView n2 = (TextView) findViewById(R.id.txtN2);

        String parametroN3 = (String) intent.getSerializableExtra("n3");
        TextView n3 = (TextView) findViewById(R.id.txtN3);

        String parametroMedia = (String) intent.getSerializableExtra("media");
        TextView media = (TextView) findViewById(R.id.txtMedia);

        anoDisc.setText(parametroAnoDisc);
        nomeDisc.setText(parametroNomeDisc);
        nomeProf.setText(parametroNomeProf);
        n1.setText(parametroN1);
        n2.setText(parametroN2);
        n3.setText(parametroN3);
        media.setText(parametroMedia);
    }
//    public void irproinicio(View view) {
//        setContentView(R.layout.activity_main);
//    }


}
