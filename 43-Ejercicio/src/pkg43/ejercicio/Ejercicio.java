/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43.ejercicio;

import java.util.Scanner;

/* @author Pablo
  Leer por teclado una serie de 10 números enteros. la aplicación debe indicarnos si los
   números están ordenados de forma creciente, decreciente, o si están desordenados
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[];
        a = new int[10];
        boolean asc = false, desc = true;
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+" .Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        for (int i = 1; i < 10; i++) {
            
            if(a[i] > a[i-1])
            {
                asc = true;
            }
            
            if(a[i] < a[i-1]){
                desc = true;
            }
        }
        
        if(asc == true && desc == true)
        {
            System.out.println("La serie está desordenada");
        }else if(asc == true && desc == false)
        {
            System.out.println("La serie está ordenada en orden ascendente");
        }else if(asc == false && desc == true)
        {
            System.out.println("La serie está ordenada en orden descendente");
        }else if(asc == false && desc == false)
        {
            System.out.println("Todos los numeros son iguales ");
        }
        
    }
    
}
