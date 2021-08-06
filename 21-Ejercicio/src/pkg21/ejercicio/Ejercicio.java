/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /**
Escriba un programa que lea valores enteros hasta que se introduzca un 
valor en el rango [20-30] o se introduzca el valor 0. El programa debe entregar la suma 
de los valores mayores a 0 introducidos.
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, sum = 0;
        do
        {
            System.out.println("Digite un número: ");
            numero = entrada.nextInt();
            if(numero > 0)
            {
                sum+=numero;
            }
            
        }while((numero!= 0) && ((numero < 20) || (numero > 30)));
        
        System.out.println("la suma de valores mayores que cero es: "+sum);
        
    }
    
}
