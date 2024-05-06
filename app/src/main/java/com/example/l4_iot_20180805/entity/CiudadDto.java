package com.example.l4_iot_20180805.entity;

import java.util.List;

public class CiudadDto {

    private List<Ciudad> lista;
    private String estado;

    public CiudadDto(List<Ciudad> lista, String estado) {
        this.lista = lista;
        this.estado = estado;
    }

    public List<Ciudad> getLista() {
        return lista;
    }

    public void setLista(List<Ciudad> lista) {
        this.lista = lista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
