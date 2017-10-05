package com.example.alanvictorg.seminario.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.alanvictorg.seminario.R;
import com.example.alanvictorg.seminario.models.Turma;

import java.util.List;

/**
 * Created by fortes on 03/10/2017.
 */

public class TurmaAdapter extends BaseAdapter {

    private Activity act;
    private List<Turma> turmas;


    public TurmaAdapter(Activity act, List<Turma> turmas) {
        this.act = act;
        this.turmas = turmas;
    }

    @Override
    public int getCount() {

        return turmas.size();

    }

    @Override
    public Object getItem(int i) {

        return turmas.get(i);

    }

    @Override
    public long getItemId(int i) {

        return turmas.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = act.getLayoutInflater().inflate(R.layout.item_lista, viewGroup, false);
        Turma turma = turmas.get(i);

        //pegando as referências das Views
        TextView codigo = (TextView) view.findViewById(R.id.txtCod);
        TextView turno = (TextView) view.findViewById(R.id.txtTurno);

        //populando as Views
        codigo.setText(turma.getCodigo());
        turno.setText(turma.getTurno());

        return view;
    }
}
