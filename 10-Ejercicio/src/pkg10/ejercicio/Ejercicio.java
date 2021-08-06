/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 * 
 * 
  
 */


public class Ejercicio {

    /**
      Escriba un programa que lea de la entrada estándar un carácter e indique 
      en la salida estándar si el carácter es una vocal minúscula o no.
     */
    
    public static boolean esMinuscula(String letra)
    {
        //comprobamos si es mayuscula o es minuscula
        return letra.equals(letra.toLowerCase());
    }
    
    public static boolean esMayuscula(String letra)
    {
        return letra.equals(letra.toUpperCase());
    }
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        char a;
        
        System.out.println("Digite un caracter: ");
        a = entrada.next().charAt(0);
        
        if(esMinuscula(Character.toString(a)))
        {
            System.out.println("Es minuscula");
        }else if(esMayuscula(Character.toString(a)))
        {
            System.out.println("Es mayuscula");
        }else
        {
            System.out.println("Ninguna de los 2");
        }
        
        
    }
    
}
