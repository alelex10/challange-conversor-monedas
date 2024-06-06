package com.Alejandro.conversormonedas.modelos;

import com.google.gson.annotations.SerializedName;

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
