package com.Alejandro.conversormonedas.servicio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {

// Para probar la obtencion de monedas y suus valores
    public static String peticionHttp( String moneda) {
        try {
            // Crear una nueva instancia de HttpClient
            HttpClient client = HttpClient.newHttpClient();
            // Crear una solicitud GET
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/b956b8d42c941d59f90e8240/latest/"+moneda))
                    .build();
            //creo una variable donde se guardara la respuesta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error de peticion");
            return e.getMessage();
        }
    }

}
