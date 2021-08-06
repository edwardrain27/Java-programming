/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {
/*
Escriba un programa que calcule el valor de: 1+3+5+...+2n-1
*/ 
static Scanner entrada = new Scanner(System.in);
public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite un límite ");
        int sum = 0;
        int numero = entrada.nextInt();
        for (int i = 1; i < 2*numero-1; i = i+2) {
            System.out.println(i);
            sum+=i;
        
        }
        
        System.out.println("La suma es: "+sum);
        
    }
    
}
