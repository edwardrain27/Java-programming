/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.ejercicio;

import java.util.Scanner;

/**
 Escriba un programa que lea las tres notas de un alumno
 y calcule la nota final media de dicho alumno.
  
 * 
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here

        float nota1, nota2, nota3, definitiva = 0;
        
        System.out.println("Digite la nota 1: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digite la nota 2: ");
        nota2 = entrada.nextFloat();
        System.out.println("Digite la nota 3: ");
        nota3 = entrada.nextFloat();
        
        //realizar las operaciones
        
        definitiva = (nota1+nota2+nota3)/3;
        
        System.out.println("La nota final es: "+definitiva);
        
        
        
        
        
        
        
        
    }
    
}
