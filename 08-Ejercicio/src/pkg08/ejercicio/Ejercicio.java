/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08.ejercicio;

import java.util.Scanner;

/**
Escriba un programa que lea tres números y determine cuál de ellos
* es el mayor
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada  = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1,n2,n3;
        
        System.out.println("Digite el primer número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el segundo número: ");
        n2 = entrada.nextInt();
        System.out.println("Digite el tercer número: ");
        n3 = entrada.nextInt();
        
        
        if((n1 > n2) && (n1 > n3))
        {
            System.out.println("El mayor es "+n1);
        }else if((n2 > n1) && (n2 > n3))
        {
            System.out.println("El mayor es "+n2);
        }else
        {
            System.out.println("El mayor es: "+n3);
        }
    }
    
}
