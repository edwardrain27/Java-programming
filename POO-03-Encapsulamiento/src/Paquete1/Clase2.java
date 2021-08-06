/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */

public class Clase2 {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args)
    {
        Clase1 objeto1 = new Clase1();
        System.out.println("Digite un nombre: ");
        objeto1.setNombre(entrada.next());
        
        System.out.println("Digite la edad: ");
        objeto1.setEdad(entrada.nextInt());
        
        
        System.out.println("El nombre es: "+objeto1.getNombre());
        System.out.println("La edad es: "+objeto1.getEdad());
    
    
    }
    
}
