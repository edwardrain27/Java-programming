/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg44.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /*
    Diseñar una aplicación que declare una tabla
    de 10 elementos enteros.
    Leer mediante el teclado 8 números. Después
    se debe pedir un número y una posición, insertarlo
    en la posición indicada, desplazando los que están detrás.
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int[10];
        
        
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1)+" .Digite un numero: ");
            a[i] = entrada.nextInt();   
        }
        
        System.out.println("Digite un numero: ");
        int numero = entrada.nextInt();
        System.out.println("Digite una posición");
        int posicion = entrada.nextInt();
        
        int aux, aux2;
        for (int i = 7; i >= posicion; i--) {
            a[i+1] = a[i];
        }
        
        a[posicion] = numero;
        
        for(int i:a)
        {
            System.out.println(i);
        }
        
    }
    
}
