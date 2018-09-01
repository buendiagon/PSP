package com.example.bienestaraprendiz.psp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bienestaraprendiz.psp.adaptadores.AdapterProyectos;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> proyectos;
    RecyclerView recycler;
    AdapterProyectos adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proyectos=new ArrayList<>();

        for(int i=0;i<60;i++){
            proyectos.add("#"+i);
        }


        recycler=findViewById(R.id.contenedor);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter=new AdapterProyectos(proyectos);
        recycler.setAdapter(adapter);
    }
}
