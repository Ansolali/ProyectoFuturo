/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.aplicacion;

/**
 *
 * @author alia_
 */
public class Aplicacion {
         
public static String veredicto(String valor1, String valor2) {       
    if (valor1.equals(valor2)) {
        return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
    if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
        return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }  
     public static void main(String[] args) {
        System.out.println("Nombre alumno " + args[0] + " " + args[1]);
        System.out.println(veredicto(args[3],args[2]));
    }
}