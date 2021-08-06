/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
Escriba un programa que lea de la entrada estándar un carácter e indique 
en la salida estándar si el carácter es una vocal minúscula, es una vocal mayúscula o 
no es una vocal.

 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    
    
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
    
        char a;
        a = entrada.next().charAt(0);
        
        switch(a)
        {
            case 'a':
                System.out.println("Es minuscula");
                break;
            case 'e':
                System.out.println("Es minuscula");

                break;
            case 'i':
                System.out.println("Es minuscula");

                break;
            case 'o':
                System.out.println("Es minuscula");
                
                break;
            case 'u':
                System.out.println("Es minuscula");

                break;
            
            case 'A':
                System.out.println("Es Mayuscula");

                break;
            case 'E':
                System.out.println("Es Mayuscula");

                break;
            case 'I':
                System.out.println("Es Mayuscula");
                
                break;
            case 'O':
                System.out.println("Es Mayuscula");

                break;
            case 'U':
                System.out.println("Es Mayuscula");

                break;
            default:
                System.out.println("No es ninguna");
                break;
                            
        }
        
        
    
    }
    
}
