/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27.ejercicio;

import java.util.Scanner;

/**
Escribe un programa que defina un vector de números y calcule si existe 
algún número en el vector cuyo valor equivale a la suma del resto de números del vector.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite el número de elemntos del vector: ");
        int sum = 0, aux = 0;
        int n = entrada.nextInt();
        int []numeros = new int[n];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite el valor de la posicion "+i);
            numeros[i] = entrada.nextInt();
            if(numeros[i] == sum)
            {
                aux+=1;
                System.out.println("hay "+aux+" numeros");
            }
            sum+=numeros[i];
        }
        
    }
    
}
