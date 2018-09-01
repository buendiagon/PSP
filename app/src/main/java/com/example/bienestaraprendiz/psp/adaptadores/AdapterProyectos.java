package com.example.bienestaraprendiz.psp.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bienestaraprendiz.psp.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class AdapterProyectos extends RecyclerView.Adapter<AdapterProyectos.listaViewHolder> implements View.OnClickListener{
    ArrayList<String> proyectos;
    private View.OnClickListener listener;

    public AdapterProyectos(ArrayList<String> proyectos) {
        this.proyectos = proyectos;
    }

    @NonNull
    @Override
    public AdapterProyectos.listaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,null,false);
        return new listaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProyectos.listaViewHolder listaViewHolder, int i) {
        listaViewHolder.project.setText(proyectos.get(i));

    }

    @Override
    public int getItemCount() {
        return proyectos.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    class listaViewHolder extends RecyclerView.ViewHolder {
        TextView project;
        public listaViewHolder(@NonNull View itemView) {
            super(itemView);
            project=itemView.findViewById(R.id.project);
        }
    }
}
