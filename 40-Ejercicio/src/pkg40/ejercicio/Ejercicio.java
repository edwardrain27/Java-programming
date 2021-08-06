/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg40.ejercicio;

import java.util.Scanner;

/**
leer por teclado dos tablas de 10 números enteros
* y mezclarars en una tercera de la forma: el 1 del a, el 1 del B,
*2 del a, el 2 del b, etc.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[],b[],c[];
        Scanner entrada = new Scanner(System.in);
        
        a = new int[10];
        b = new int[10];
        c = new int[a.length+b.length];
        
        System.out.println("Digite el primer arreglo :");
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+" Digite un numero: ");
            a[i] = entrada.nextInt();
            
        }
        
        System.out.println("\nDigite el segundo arreglo");
        for (int i = 0; i < b.length; i++) {
            System.out.print((i+1)+" Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        int aux = 0;
        for (int i = 0; i < 10; i++) {
            
            c[aux] = a[i]; //el primer elemento del A
            c[aux+1] = b[i]; //el primer elemento del B
            aux+=2;
        }
        
        for (int i:c) {
            System.out.println(i);
        }
    }
    
}
