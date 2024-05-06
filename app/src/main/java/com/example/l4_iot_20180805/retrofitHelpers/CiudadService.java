package com.example.l4_iot_20180805.retrofitHelpers;

import com.example.l4_iot_20180805.entity.CiudadDto;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CiudadService {

    @GET("lat=44.34&lon=10.99&appid=792edf06f1f5ebcaf43632b55d8b03fe")
    Call<CiudadDto> obtenerLista();
}
