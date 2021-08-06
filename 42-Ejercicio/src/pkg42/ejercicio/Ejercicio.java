/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg42.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /*
     
    Leer por teclado una serie de 10 números enteros. la aplicación debe indicarnos si los
    números están ordenados de forma creciente, decreciente, o si están desordenados.
     */
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int a[], asc = 0, desc = 0;
        a = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+" .Digite un numero: ");
            a[i] = entrada.nextInt();
            
        }
        
        for (int i = 1; i < a.length; i++) {
            
            if(a[i] >= a[i-1])
            {
                asc++;
            }else if(a[i] <= a[i-1])
            {
                desc++;
            }
        }
        
        if(desc == 9)
        {
            System.out.println("Los números estan ordenados de forma descendente");
        }else if(asc == 9)
        {
            System.out.println("los numeros estan ordenados de forma creciente");
        }else
        {
            System.out.println("Los numeros están desordenados");
        }
        
    }
    
}
