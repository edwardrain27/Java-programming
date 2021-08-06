/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada  = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        float precio, iva = (float) 0.19, precioTotal = 0;
        
        System.out.println("Digite el precio del producto: ");
        precio = entrada.nextFloat();
        
        
        //Operación con el precio del producto
        precioTotal = precio+iva*precio; 
        
        System.out.println("El precio del producto con IVA es: "+precioTotal);
        
        
    }
    
}
