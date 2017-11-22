package com.example.alanvictorg.seminario.controls;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alanvictorg.seminario.R;
import com.example.alanvictorg.seminario.adapter.TurmaAdapter;
import com.example.alanvictorg.seminario.models.Professor;
import com.example.alanvictorg.seminario.models.Turma;
import com.example.alanvictorg.seminario.services.UserService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    TextView userId;
    Retrofit retrofit;
    private List<Turma> lturma;
    private ListView minhaLista;
    private TurmaAdapter turmaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent it = getIntent();

        String id = it.getStringExtra("user_id");

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.addInterceptor(loggingInterceptor);

        retrofit = new Retrofit.Builder()
                .baseUrl(UserService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClientBuilder.build())
                .build();

        final UserService service = retrofit.create(UserService.class);

        final ListView minhaLista = (ListView) findViewById(R.id.minhaLista);
        Call<ArrayList<Turma>> requestClasses = service.getClasses(id);

        requestClasses.enqueue(new Callback<ArrayList<Turma>>() {
            @Override
            public void onResponse(Call<ArrayList<Turma>> call, Response<ArrayList<Turma>> response) {
                final ArrayList<Turma> retorno = response.body();
                for (Turma t : retorno) {
                    Log.i("RETORNO ","retorno-> " + t.getN1());
                }
//                turmaAdapter = new TurmaAdapter(MainActivity.this, retorno);
                ArrayAdapter turmaAdapter = new TurmaAdapter(MainActivity.this, retorno);
                minhaLista.setAdapter(turmaAdapter);

                minhaLista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        int professorid = retorno.get(i).getProfessor_id();
                        Call<Professor> requestProfessor = service.getProfessor(professorid);
                        final Intent intent = new Intent(MainActivity.this, DisciplinaActivity.class);

                        intent.putExtra("nomeDisc", retorno.get(i).getCodigo());
                        intent.putExtra("anoDisc", retorno.get(i).getAno());
                        intent.putExtra("turnoDisc", retorno.get(i).getTurno());
                        intent.putExtra("n1", retorno.get(i).getN1());
                        intent.putExtra("n2", retorno.get(i).getN2());
                        intent.putExtra("n3", retorno.get(i).getN3());
                        intent.putExtra("media", retorno.get(i).getMedia());

                        requestProfessor.enqueue(new Callback<Professor>() {
                            @Override
                            public void onResponse(Call<Professor> call, Response<Professor> response) {
                                final Professor retorno = response.body();
//                                Log.i("Professor: ","Detalhes-> " + retorno.getNome());
                                intent.putExtra("nomeProf", retorno.getNome());
                                startActivity(intent);
                            }

                            @Override
                            public void onFailure(Call<Professor> call, Throwable t) {

                            }
                        });



                    }
                });
            }

            @Override
            public void onFailure(Call<ArrayList<Turma>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Erro :(", Toast.LENGTH_SHORT).show();

            }
        });
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
