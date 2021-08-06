/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26.ejercicio;

import java.util.Scanner;

/**
Escribe un programa que lea de la entrada estándar un vector de números 
y muestre en la salida estándar los números del vector con sus índices asociados.

 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Digite el numero de elementos ");
        int n = entrada.nextInt();
        int []numeros = new int[n];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite el valor de la posición "+i);
            numeros[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(i+"."+numeros[i]);
        }
        
    }
    
}
