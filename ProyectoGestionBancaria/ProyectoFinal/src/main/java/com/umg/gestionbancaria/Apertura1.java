/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.gestionbancaria;

/**
 *
 * @author erick.ramazzini
 */

import com.sun.source.tree.TryTree;
import java.io.BufferedReader;
import javax.swing.JOptionPane;

// para obtner la fecha actual
import java.time.LocalDate;
// para obtenr la hora y fecha actual
import java.time.LocalDateTime;
// para formatear la fecha y hora
import java.time.format.DateTimeFormatter;


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Apertura1 {
    String Ape = System.getProperty("user.dir") + "/registro/Apertura.txt";
    String rutaArchivo = System.getProperty("user.dir") + "/registro/registro.txt";
    String cuentaArchivo = System.getProperty("user.dir") + "/registro/Cuenta.txt";
    
    private String tipo;
    private double montoIncial;
    private String DPI;
    
    private String Nombre;
    private String Apellido;
    
    
    public void SetApertura1(String tipo, double monto, String DPI){
        
        this.tipo = tipo;
        this.DPI = DPI;
        this.montoIncial = monto;
    
    
    }

    public String getTipo() {
        return tipo;
    }

    public double getMontoIncial() {
        return montoIncial;
    }

    public String getDPI() {
        return DPI;
    }

   
    
  public void proceso(){
      boolean comprobador = true;
      String tipoCuenta = null;
  // creames condicion para saber el tipo de cuenta
      if (this.tipo.equalsIgnoreCase("1")){
     tipoCuenta = "CUENTA M0NETARIA";
      comprobador = true;
      }
      else if( this.tipo.equalsIgnoreCase("2")){
       tipoCuenta = "CEUNTA DE AHORRO";
      comprobador = true;
      }
      else{
      JOptionPane.showMessageDialog(null,"LA OPCION NO ES VALIDA:"+this.tipo);
      } 
     
    
      if(comprobador = true){
      // con esto obtenemos la hora y la fecha actual
  LocalDateTime ahora = LocalDateTime.now();
  
    // procso para formatera la fecha y la hora
        DateTimeFormatter formatoGenerarNu = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String formatoFechaHora = ahora.format(formatoGenerarNu);
      
        // aqui ya esta generado el numero de cuenta con la fecha y la hora actual
        String numeroCuenta = formatoFechaHora;
        
        // para obtener la fecha actual
        LocalDate fecha = LocalDate.now();
        
        // aguaradomos los datos en el archivo de texto
        FileWriter escritor = null;
        BufferedWriter bw = null;
        
        try {
           // Escribir en el archivo de apertura
    FileWriter escritorApertura = new FileWriter(Ape, true);
    BufferedWriter bwApertura = new BufferedWriter(escritorApertura);
    
    // Escribir en el archivo de cuenta
    FileWriter escritorCuenta = new FileWriter(cuentaArchivo, true);
    BufferedWriter bwCuenta = new BufferedWriter(escritorCuenta);
    
    String tarea = "DPI: "+this.DPI+", Numero de cuenta:"+numeroCuenta +", Fecha: "+fecha+", Monto Inicial: "+this.montoIncial+", Tipo de Cuenta: "+tipoCuenta;
    
    // Escribir en el archivo de apertura
    bwApertura.write(tarea);
    bwApertura.newLine();
    
    // Escribir en el archivo de cuenta
    bwCuenta.write(numeroCuenta +","+this.montoIncial);
    bwCuenta.newLine();
    
    // Cerrar los archivos de manera independiente
    bwApertura.close();
    bwCuenta.close();
            //
            
        } catch (Exception e) {
            System.out.println("Error al guardar la tarea: " + e.getMessage());
        } finally {
            // CERRAR EL ARCHIVO
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo. " + e.getMessage());
            }
        }
        
    }
        
        
        
      } 

   public void buscarPorDPI(String dpiBuscado) {
       
        BufferedReader lector = null;
        try {
            lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (linea.contains("DPI: " + dpiBuscado)) {
                    String[] partes = linea.split(", ");
                    for (String parte : partes) {
                        if (parte.startsWith("NOMBRE: ")) {
                            Nombre = parte.substring("NOMBRE: ".length());
                        } else if (parte.startsWith("APELLIDO: ")) {
                            Apellido = parte.substring("APELLIDO: ".length());
                        }
                    }
                    break; // Salir del bucle una vez encontrada la línea
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
        
        JOptionPane.showMessageDialog(null,"Nombre: "+Nombre +"\n Apellido: "+Apellido);
    }
    
       
        
       
    }    
   

