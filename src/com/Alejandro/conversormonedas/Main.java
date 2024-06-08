package com.Alejandro.conversormonedas;

import com.Alejandro.conversormonedas.menu.Menu;

import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        try {
            new Menu().iniciar();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}