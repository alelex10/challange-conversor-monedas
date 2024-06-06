package com.Alejandro.conversormonedas.menu;

import com.Alejandro.conversormonedas.modelos.Moneda;

public class StringOpciones {

    static String principal(){
        return """
             
                ********************************
               
                ***** CONVERSOR DE MONEDAS *****
               
                ********************************
                
                1) Convertir a Dolares
                2) Convertir otras monedas
                3) Historial de convercion
                0) Salir
                
                Elija una opocion valida""";
    }
    static String convercionDolares(){
        return """
                **************************************************************
                1) %s - Peso argentino --> USD - Dólar
                2) %s - Boliviano boliviano --> USD - Dólar
                3) %s - Real brasileño --> USD - Dólar
                4) %s - Peso chileno --> USD - Dólar
                5) %s - Peso colombiano --> USD - Dólar
                """.formatted(Moneda.monedasDisponibles.toArray());
    }
    static String otrasConverciones(){
        return """          
                **************************************************************
                1) %s Peso argentino
                2) %s Boliviano boliviano
                3) %s Real brasileño
                4) %s Peso chileno
                5) %s Peso colombiano
                6) %s Dólar estadounidense
                
                """.formatted(Moneda.monedasDisponibles.toArray())
                +"a que moneda desea convertir";
    }

    static public String mostrarConvercion(String moneda1, String moneda2, Double convercion){
        return String.format("la cantidad convertida de %s a %s es de : $%.2f",moneda1,moneda2,convercion);
    }
    static public String convertirA(String moneda){
        return "que moneda desea convertir a %s:".formatted(moneda);
    }
    public static String cantidadAConvertir(String moneda1, String moneda2){
        return "ingrese la cantidad que desee convertir de "+moneda1+" a "+moneda2;
    }
    static public String opcionesFinales(){
        return """
                
                1) continuar
                2) Historial de convericon
                0) salir
                """;
    }
}
