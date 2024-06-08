package com.Alejandro.conversormonedas.historial;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Historial {

    private File file;
    public Historial() {
        try {
            file = File.createTempFile("historial", ".txt",
                    new File(String.valueOf(Path.of(getClass().getResource(".").toURI()))));
//                    new File(Thread.currentThread().getContextClassLoader()
//                            .getResource("").getPath()
//                            .replace("/","\\")
//                            .replace("%20"," ")
//                            +"src\\com\\Alejandro\\conversormonedas"));
                    System.out.println(file.getPath());
            file.deleteOnExit();
        }catch (IOException | NullPointerException | URISyntaxException e){
            System.out.println(e.getMessage());
        }
    }
    public void escribirHistorial(String conversion) {
        try {
            // Creamos un FileWriter para escribir en el archivo en modo append
            FileWriter fw = new FileWriter(file, true);
            // Escribimos algo en el archivo
            fw.write(conversion + "\n"); // Agregamos un salto de línea para separar las conversiones
            // No olvides cerrar el FileWriter para asegurarte de que los cambios se guarden
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void leerHistorial() {
        try (FileReader reader = new FileReader(file)) {
            int caracter;
            while ((caracter = reader.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

