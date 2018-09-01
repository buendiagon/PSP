package com.example.bienestaraprendiz.psp.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class AdapterProyectos extends RecyclerView.Adapter<AdapterProyectos.listaViewHolder> {

    @NonNull
    @Override
    public AdapterProyectos.listaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProyectos.listaViewHolder listaViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    class listaViewHolder extends RecyclerView.ViewHolder {

        public listaViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
