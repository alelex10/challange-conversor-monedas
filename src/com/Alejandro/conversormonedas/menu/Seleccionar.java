package com.Alejandro.conversormonedas.menu;

import com.Alejandro.conversormonedas.modelos.Moneda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public interface Seleccionar {
    Scanner teclado= new Scanner(System.in);

    static int opcion(){
        ArrayList<Integer> opcionesValidas=new ArrayList<>(Arrays.asList(1,2,3,0));
        int opcionSeleccionada=-1;
        try {
            opcionSeleccionada=teclado.nextInt();
            while(!opcionesValidas.contains(opcionSeleccionada)){
                teclado.nextLine();
                System.out.println("seleccione una opcion valida");
                opcionSeleccionada=teclado.nextInt();
            }
            return opcionSeleccionada;
        }catch (InputMismatchException e){
            //la excepcion ocurre en la linea 17 y no avanza a la linea 18 por lo que
            teclado.next();//la excepcion se queda en el buffer
            System.out.println("ingrese un numero valido");
            return Seleccionar.opcion();
        }
    }
    static String moneda(boolean aDolares) {
        ArrayList<Integer> opcionesValidas= new ArrayList<>(
                aDolares ? Arrays.asList(1,2,3,4,5)
                        : Arrays.asList(1,2,3,4,5,6)
        );
        try{
            int monedaSeleccionada = teclado.nextInt();
            while (!opcionesValidas.contains(monedaSeleccionada)){
                teclado.nextLine();
                System.out.println("seleccione una moneda valida");
                monedaSeleccionada=teclado.nextInt();
            }
            return Moneda.monedasDisponibles.get(monedaSeleccionada - 1);
        }catch (InputMismatchException e){
            System.out.println("ingrese un numero valido");
            teclado.nextLine();//la excepcion se queda en el buffer
            return Seleccionar.moneda(aDolares);
        }
    }

    static double cantidad(){
        try {
            Scanner teclado = new Scanner(System.in);
            double cantidad= teclado.nextDouble();
            teclado.nextLine();
            return cantidad;
        }catch (InputMismatchException | IndexOutOfBoundsException e){
            System.out.println("por favor ingrese una cantidad valido");
            return Seleccionar.cantidad();
        }
    }
    static int opcionesFinales(){
        ArrayList<Integer> opcionesValidas= new ArrayList<>(Arrays.asList(1,2,0));
        try{
            int opcionSeleccionada = teclado.nextInt();
            while (!opcionesValidas.contains(opcionSeleccionada)){
                teclado.nextLine();
                System.out.println("seleccione una opcion valida");
                opcionSeleccionada=teclado.nextInt();
            }
            return opcionSeleccionada==2?3:opcionSeleccionada;
        }catch (InputMismatchException e){
            System.out.println("ingrese un numero valido");
            teclado.nextLine();//la excepcion se queda en el buffer
            return Seleccionar.opcionesFinales();
        }
    }
}
