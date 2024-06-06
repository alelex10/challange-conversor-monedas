package com.Alejandro.conversormonedas.menu;

import com.Alejandro.conversormonedas.modelos.Historial;
import com.Alejandro.conversormonedas.servicio.Conversor;

public class Menu {
    public int opcionElegida=1;
//    StringOpciones stringOpciones =new StringOpciones();
    Historial historial= new Historial();
    String moneda1="";
    String moneda2="";
    double convercionObtenida=0;
    double cantidad=0;
    protected void iniciar(){
        do{
            System.out.println(opcionElegida==1?StringOpciones.principal():"");
            opcionElegida = opcionElegida==1?Seleccionar.opcion():opcionElegida;
            switch (opcionElegida){
                case 0:
                    System.out.println("saliendo del programa");
                    break;
                case 1 ://convercion a dolares
                    System.out.println(StringOpciones.convercionDolares());
                    moneda1="USD";
                    System.out.println(StringOpciones.convertirA(moneda1));
                    moneda2= Seleccionar.moneda(true);
                    convercion(moneda1, moneda2);
                    break;
                case 2 ://otras converciones
                    System.out.println(StringOpciones.otrasConverciones());
                    moneda1= Seleccionar.moneda(false);
                    System.out.println(StringOpciones.convertirA(moneda1));
                    moneda2= Seleccionar.moneda(false);
                    convercion(moneda1,moneda2);
                    break;
                case 3://Mostrar Historial
                    System.out.println("************************ Historial ************************");
                    historial.leerHistorial();
                    System.out.println("***********************************************************");
                    break;
            }
            System.out.println(StringOpciones.opcionesFinales());
            opcionElegida=Seleccionar.opcionesFinales();

        }while (opcionElegida != 0);
    }
    private void convercion(String moneda1, String moneda2){
        System.out.println(StringOpciones.cantidadAConvertir(moneda2,moneda1));
        cantidad=Seleccionar.cantidad();
        convercionObtenida=Conversor.monedas(moneda1,moneda2,cantidad);
        String stringConvercion=StringOpciones.mostrarConvercion(moneda1,moneda2,convercionObtenida);
        historial.escribirHistorial(stringConvercion);
        System.out.println(stringConvercion);
    }
}
