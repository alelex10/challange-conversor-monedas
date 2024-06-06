package com.Alejandro.conversormonedas.modelos;

import com.Alejandro.conversormonedas.servicio.ConsumoAPI;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

public class Moneda {
    public static List<String> monedasDisponibles=new ArrayList<>
            (Arrays.asList("ARS", "BOB", "BRL", "CLP", "COP", "USD"));
    @SerializedName("conversion_rates")
    private Map<String,Double> coverciones;

    public Map<String, Double> getCoverciones() {
        return coverciones;
    }
}
