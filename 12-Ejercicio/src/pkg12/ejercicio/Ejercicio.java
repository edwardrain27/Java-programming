/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.ejercicio;

import java.util.Scanner;

/**
Escriba un programa que solicite una edad (un entero) e indique en la salida 
estándar si la edad introducida está en el rango [18-25].
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        int edad;
        edad = entrada.nextInt();
        
        if((edad >= 18) && (edad <= 25))
        {
            System.out.println("La persona esta en el rango [18-25]");
        }else
        {
            System.out.println("La persona no se encuentra en este rango de edad");
        }
        
    }
    
}
