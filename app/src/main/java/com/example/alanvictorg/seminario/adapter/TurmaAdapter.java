package com.example.alanvictorg.seminario.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.alanvictorg.seminario.R;
import com.example.alanvictorg.seminario.models.Turma;

import java.util.List;

/**
 * Created by fortes on 03/10/2017.
 */

public class TurmaAdapter extends BaseAdapter {

    private Context context;
    private List<Turma> turmas;


    public TurmaAdapter(Context context, List<Turma> turmas) {

        this.context = context;
        this.turmas = turmas;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        return v;
    }
}
