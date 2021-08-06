/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */

/*
    Realice un programa que lea de la entrada estándar
    los siguientes datos de una persona:
    - eadad: dato de tipo entero
    - sexo:dato de tipo carácter.
    - altura en metros: dato de tipo real.

    Tras leer los datos, el programa debe mostrarlos en la
    salida estándar.
*/  
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad;
        char sexo;
        float altura;
        
        System.out.println("Digite la edad: ");
        edad = entrada.nextInt();
        System.out.println("Digite el sexo: ");
        sexo = entrada.next().charAt(0); //solo toma el primer caracter de la cadena
        System.out.println("Digite la altura: ");
        altura = entrada.nextFloat();
        
        System.out.println("Altura: "+altura);
        System.out.println("Sexo: "+sexo);
        System.out.println("Edad: "+edad);
        
    }
    
}
