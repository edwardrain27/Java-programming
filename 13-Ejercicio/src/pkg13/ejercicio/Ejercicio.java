/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.ejercicio;

import java.util.Scanner;

/**
Escribe un programa que lea de la entrada estándar tres números. Después 
debe leer un cuarto número e indicar si el número coincide con alguno de los 
introducidos con anterioridad.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1 = (int) (Math.random()*10);
        int n2 = (int) (Math.random()*10);
        int n3 = (int) (Math.random()*10);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("Digite un número: ");
        int n4 = entrada.nextInt();
        
        if(n4 == n1)
        {
            System.out.println("Coincide con "+n1);
        }else if(n4 == n2)
        {
            System.out.println("Coincide con "+n2);
        }else if(n4 == n3)
        {
            System.out.println("Coincide con "+n3);
        }else
        {
            System.out.println("No coincide con niguno.");
        }
        
        
    }
    
}
