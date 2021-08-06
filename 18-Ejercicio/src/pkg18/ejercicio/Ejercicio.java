/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
Realice un programa que lea de la entrada estándar números hasta que se 
introduzca un cero. En ese momento el programa debe terminar y mostrar en la salida 
estándar el número de valores mayores que cero leídos
     */
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero, cont = 0;
        do
        {
            System.out.println("Digite un número: ");
            numero = entrada.nextInt();
            if(numero > 0)
            {
                cont+=1;
            }
        
        }while(numero!=0);
        
        System.out.println("numero de valores mayores que cero: "+cont);
    }
    
}
