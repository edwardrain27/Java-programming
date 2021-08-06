
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */


public class ejercicio {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        float n1, n2;
        System.out.println("Digite el número 1: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite el número 2: ");
        n2 = entrada.nextFloat();
        
        System.out.println("La suma es: "+(n1+n2));
        System.out.println("La resta es: "+(n1-n2));
        System.out.println("La multiplicacion es: "+(n1*n2));
        System.out.println("La division es: "+(n1/n2));
        
        
        
        
        
    }
    
}
