/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.gestionbancaria;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class OperacionesDelDia {
    String rutadeposito = System.getProperty("user.dir") + "/registro/Deposito.txt"; //numero de cuenta
    String rutaretirar = System.getProperty("user.dir") + "/registro/Retirar.txt"; //numero de cuenta
    String  rutaoperacionesdia = System.getProperty("user.dir") + "/registro/OperacionesDia.txt"; //numero de cuenta
    
    public void OperacionesDia(int numeroCuenta) {
    // Leer información de los archivos Deposito y Retirar
        String depositos = leerArchivo(rutadeposito);
        String retirar = leerArchivo(rutaretirar);

        // Escribir la información en el archivo OperacionesDia
        escribirArchivo(rutaoperacionesdia, "Depositos Realizados", depositos);
        escribirArchivo(rutaoperacionesdia, "Retiros Realizados", retirar);
    }

    private static String leerArchivo(String rutaArchivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenido.toString();
    }

    private static void escribirArchivo(String rutaArchivo, String titulo, String contenido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            writer.write(titulo + ":\n");
            writer.write(contenido);
            writer.write("\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
