/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg47.ejercicio;

import java.util.Scanner;

/**
Leer 5 elementos numéricos que se introducirán ordenados
* de forma creciente. éstos los guardaremos en una tabla
* de tamaño 10. Leer un número N, e insertarlo en el lugar
* adecuado para que la tabla continúe ordenada.
* 
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int[10];
        int numero, posicion = 0, j = 0;
        boolean asc = false;
        do
        {
            for (int i = 0; i < 5; i++) {
                System.out.print((i+1)+".Digite un numero: ");
                a[i] = entrada.nextInt();
            }
            
            for (int i = 0; i < 4; i++) {
                
                if(a[i]<a[i+1])
                {
                    asc =  true;
                }
                
                if(a[i] > a[i+1])
                    asc = false;
                    break; //finaliza las iteraciones.
            }
            
            if(asc == false)
            {
                System.out.println("La serie no está ordenada, vuelva a digitar numeros");
            }
        
        }while(!asc);
        
        
        
        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();
        
        //encontrar el número deseado
        while(a[j] < numero && j <5)
        {
            posicion++;
            j++;
        }
        
        //traslado de los números: 
        
        for (int i = a.length-2; i >= posicion; i--) {
            
            a[i+1] = a[i];
            
        }
        
        a[posicion] = numero;
        
        for (int i:a) {
            System.out.println(i);
            
        }
    }
    
}
