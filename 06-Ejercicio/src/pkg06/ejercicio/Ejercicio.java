/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        float nota1, nota2, nota3, definitiva = 0;
        System.out.println("Digite la nota 1: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digite la nota 2: ");
        nota2 = entrada.nextFloat();
        System.out.println("Digite la nota 3: ");
        nota3 = entrada.nextFloat();
        
        definitiva = (float) (nota1*0.3+nota2*0.6+nota3*0.1);
        System.out.println("La nota definitiva es: "+definitiva);
    }
    
}
