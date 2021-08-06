/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22.ejercicio;

import java.util.Scanner;

/**
Escriba un programa que calcule x^y, donde tanto x como y son enteros 
positivos, sin utilizar la función pow()
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        long x,y, funcion = 1;
        System.out.println("Digite el valor de x: ");
        x = entrada.nextInt();
        System.out.println("Digite el valor de y: ");
        y = entrada.nextInt();
        
        for (int i = 0; i < y; i++) {
            
            funcion*=x;
        }
        System.out.println("el valor de la funcion es: "+funcion);
    
    
    }
    
}
