/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.ejercicio;

import java.util.Scanner;

/**
Realice un programa que lea un valor entero y determine si se trata de un 
número par o impar.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        //lee un valor entero
        int number;
        
        System.out.println("Digite un numero: ");
        number = entrada.nextInt();
        
        
        if(number%2 == 0)
        {
            System.out.println("El número es par");
        }else
        {
            System.out.println("El número es impar");
        }
        
        
        System.out.println("Calcular el residuo del número: ");
        
        int d,r = 0;
        d = (int)number/2;
        System.out.println(d);
        r = number-d*2;
        System.out.println("El residuo es: "+r);
    }
    
}
