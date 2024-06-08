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
                1) %s - Peso argentino --> USD - Dolar
                2) %s - Boliviano boliviano --> USD - Dolar
                3) %s - Real brasileño --> USD - Dolar
                4) %s - Peso chileno --> USD - Dolar
                5) %s - Peso colombiano --> USD - Dolar
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
                6) %s Dolar estadounidense
                
                """.formatted(Moneda.monedasDisponibles.toArray())
                +"a que moneda desea convertir";
    }

    static public String mostrarConvercion(String moneda1, String moneda2, Double convercion,Double cantidad){
        return String.format("convercion de $%.2f %s a %s es de : $%.2f %s",cantidad,moneda1,moneda2,convercion,moneda2);
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
