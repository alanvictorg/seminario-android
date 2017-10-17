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

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;

/**
 * Created by fortes on 03/10/2017.
 */

public class TurmaAdapter extends ArrayAdapter<Turma> {

    private final Context context ;
    private final ArrayList<Turma> turmas;


    public TurmaAdapter(Context context, ArrayList<Turma> turmas) {
        super(context, R.layout.item_lista, turmas);
        this.context = context;
        this.turmas = turmas;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.item_lista, viewGroup, false);
        Turma turma = turmas.get(i);

        //pegando as referências das Views
        TextView codigo = (TextView) v.findViewById(R.id.txtCod);
        TextView turno = (TextView) v.findViewById(R.id.txtTurno);

        //populando as Views
        codigo.setText(turma.getCodigo());
        turno.setText(turma.getTurno());

        return v;
    }
}
