/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /**
 Escribe un programa que defina un vector de números y calcule la suma de 
sus elementos.

     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int n,sum = 0;
        System.out.println("Digite el numero de elementos del vector: ");
        n = entrada.nextInt();
        
        int []numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Digite el valor de la posición "+i);
            numeros[i] = entrada.nextInt();
            sum+=numeros[i];
        }
        
        for(int i:numeros)
        {
            System.out.println(i);
        }
        System.out.println("la suma es: "+sum);
    }
    
}
