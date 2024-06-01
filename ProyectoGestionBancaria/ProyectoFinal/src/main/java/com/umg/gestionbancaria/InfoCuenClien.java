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

//clase separada para manejar la lectura de archivos y obtener los datos específicos.
public class InfoCuenClien {
    String rutaArchivoregistro = System.getProperty("user.dir") + "/registro/Cuenta.txt"; //numero de cuenta
    String rutaArchivoinfocliente = System.getProperty("user.dir") + "/registro/InfoCuentClient.txt";//dondeSeVaAlmacenar
    String rutaApertura = System.getProperty("user.dir") + "/registro/Apertura.txt";////informacion del cliente
    String rutaDepositos = System.getProperty("user.dir") + "/registro/Deposito.txt";//InformacionDeTransaccionesDelMes
    String rutaRetirar = System.getProperty("user.dir") + "/registro/Retirar.txt";//Informacion de Saldo Disponible
    
    
   public void leerDatos(int numeroCuenta) {
        BufferedReader readerCuenta = null;
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(rutaArchivoinfocliente, true)); // true para añadir al archivo existente

            // Escribir el título "Información de cuenta"
            writer.write("información de cuenta:");//Estoy escribiendo un titulo al aarchivo
            writer.newLine();

            // Leer datos del archivo cuenta.txt
            readerCuenta = new BufferedReader(new FileReader(rutaArchivoregistro));
            String lineaCuenta;
            boolean found = false;

            while ((lineaCuenta = readerCuenta.readLine()) != null) {
                int cuenta = Integer.parseInt(lineaCuenta.trim());
                if (cuenta == numeroCuenta) {
                    writer.write("numero de Cuenta: " + numeroCuenta); //escribiendo datos al archivo CuentClient
                    writer.newLine();
                    found = true;
                    break;
                }
            }

            if (found) {
                // Leer información del cliente de apertura.txt
                BufferedReader readerApertura = new BufferedReader(new FileReader(rutaApertura));
                String lineaApertura;

                writer.write("Información del cliente:");
                writer.newLine();

                while ((lineaApertura = readerApertura.readLine()) != null) {
                    String[] partes = lineaApertura.split(": ");
                    if (partes.length == 2 && Integer.parseInt(partes[0]) == numeroCuenta) {
                        writer.write(partes[1]);
                        writer.newLine();
                        break;
                    }
                }
                readerApertura.close();

                // Leer transacciones de depósitos de depositos.txt
                BufferedReader readerDepositos = new BufferedReader(new FileReader(rutaDepositos));
                String lineaDeposito;

                writer.write("Transacciones Realizadas El Mes Actual:");
                writer.newLine();

                while ((lineaDeposito = readerDepositos.readLine()) != null) {
                    String[] partes = lineaDeposito.split(": ");
                    if (partes.length == 2 && Integer.parseInt(partes[0]) == numeroCuenta) {
                        writer.write(partes[1]);
                        writer.newLine();
                    }
                }
                readerDepositos.close();

                // Leer saldo actual de retirar.txt
                BufferedReader readerRetirar = new BufferedReader(new FileReader(rutaRetirar));
                String lineaRetirar;

                writer.write("Saldo actual:");
                writer.newLine();

                while ((lineaRetirar = readerRetirar.readLine()) != null) {
                    String[] partes = lineaRetirar.split(": ");
                    if (partes.length == 2 && Integer.parseInt(partes[0]) == numeroCuenta) {
                        writer.write("saldo: " + partes[1]);
                        writer.newLine();
                        break;
                    }
                }
                readerRetirar.close();

            } else {
                writer.write("información no encontrada para la cuenta: " + numeroCuenta);
                writer.newLine();
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                if (readerCuenta != null) readerCuenta.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
   public void transacciones(){
   
   
   
   
   
   }
}
