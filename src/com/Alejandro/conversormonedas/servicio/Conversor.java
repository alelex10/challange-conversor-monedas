package com.Alejandro.conversormonedas.servicio;

import com.Alejandro.conversormonedas.modelos.Moneda;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Conversor  {

    public static double monedas(String monedaAConvertir, String convertirMonedaA, double cantidadAConvertir){
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        String json=ConsumoAPI.peticionHttp(monedaAConvertir);

        Moneda moneda = gson.fromJson(json, Moneda.class);
        return cantidadAConvertir/moneda.getCoverciones().get(convertirMonedaA);
    }
}
