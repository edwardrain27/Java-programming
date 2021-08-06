/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.ejercicio;

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
        
        int n1, n2;
        
        System.out.println("Digite el primer número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite el segundo número: ");
        n2 = entrada.nextInt();
        
        if(n1 == n2)
        {
            System.out.println("son iguales");
        }else if(n1 > n2)
        {
            System.out.println(n1+" es mayor");
        }else
        {
            System.out.println(n2+" es mayor");
        }
        
        
        
    }
    
}
