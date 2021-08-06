/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     : Realice un programa que solicite de la entrada estándar un entero del 1 al 
    10 y muestre en la salida estándar su tabla de multiplicar.
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        boolean band = false;
        
        
        do
        {
            if(band)
            {
                System.out.println("Por favor, digite un número entre [1,10]");
            }else
            {
                System.out.println("Digite un número: ");
            }
            
            numero = entrada.nextInt();
            if((numero < 1) || (numero > 10))
            {
                band = true;
            }else
            {
                band = false;
            }
        
        }while(band);
        
        for (int i = 1; i < 10; i++) {
            System.out.println(numero+"x"+i+" = "+(numero*i));
        }
    }
    
    
    
}
