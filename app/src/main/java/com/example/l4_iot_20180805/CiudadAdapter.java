package com.example.l4_iot_20180805;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.l4_iot_20180805.entity.Ciudad;
import com.example.lab4_iot_20180805.R;

import java.util.List;

public class CiudadAdapter extends RecyclerView.Adapter<CiudadAdapter.CiudadViewHolder> {

    private List<Ciudad> listaCiudad;
    private Context context;

    private static final String TAG = "msg-test-CiudadViewHolder";

    @NonNull
    @Override
    public CiudadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ivr_ciudad, parent, false);
        return new CiudadViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CiudadViewHolder holder, int position) {
        Ciudad ciudad = listaCiudad.get(position);
        holder.ciudad = ciudad;

        TextView tvNombre = holder.itemView.findViewById(R.id.textViewNombre);
        TextView tvLatitud = holder.itemView.findViewById(R.id.textViewLatitud);
        TextView tvLongitud = holder.itemView.findViewById(R.id.textViewLongitud);

        tvNombre.setText(ciudad.getNombre());
        tvLatitud.setText(ciudad.getLatitud());
        tvLongitud.setText(String.valueOf(ciudad.getLongitud()));

    }

    @Override
    public int getItemCount() {
        return listaCiudad.size();
    }

    public List<Ciudad> getListaCiudad() {
        return listaCiudad;
    }

    public void setListaCiudad(List<Ciudad> listaCiudad) {
        this.listaCiudad = listaCiudad;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public class CiudadViewHolder extends RecyclerView.ViewHolder {

        Ciudad ciudad;

        public CiudadViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
