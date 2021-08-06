/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg45.ejercicio;

import java.util.Scanner;

/*
Crear un programa que lea por teclado una tabla
de 10 numeros enteros y la desplace una posicion hacia
abajo: El primero pasa a ser el segundo, el segundo pasa a ser el tercero
y asi sucesivamente. El ultimo pasa a ser el primero.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada =  new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[];
        a = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+" .Digite un numero: ");
            a[i] = entrada.nextInt();
            
        }
        
        int ultimo = a[a.length-1];
        for (int i = a.length-2; i >= 0; i--) {
            a[i+1] = a[i];
        }
        a[0] = ultimo;
        
        for (int i:a) {
            System.out.println(i);
            
        }
    }
    
}
