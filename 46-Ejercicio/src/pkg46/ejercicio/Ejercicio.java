/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg46.ejercicio;

import java.util.Scanner;

/*
Crear un programa que lea por teclado una tabla de 10
números enteros y desplace N posiciones en el arreglo(N es digitado por
el usuario).
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int[10];
        int n;
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+".Digite un numero: ");
            a[i] = entrada.nextInt();
        }
    
        System.out.println("Digite el numero de desplazamientos: ");
        n = entrada.nextInt();
        
        
        //Desplazamiento de los elementos del vector.
        
        for (int i = 0; i < n; i++) {
            
            int ultimo = a[a.length-1];
            for (int j = a.length-2 ; j >= 0; j--) {
                a[j+1] = a[j];
                
            }
            a[0] = ultimo;
        }
        
        //Mostrar los datos del vector: 
        
        for(int i:a)
        {
            System.out.println(i);
        }
    
    
    }   
    
    
    
}
