/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static String contraseña = "123";
    
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        float saldo = 1000,cantidad = 0;
      
        System.out.println("BIENVENIDO AL CAJERO AUTOMÁTICO");
        System.out.println("1. Retirar");
        System.out.println("2. Recargar Saldo ");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Salir");
        System.out.println("Digite la opción que desea realizar: ");
        int op = entrada.nextInt();
        
        switch(op)
        {
            
            case 1:
                
                System.out.println("\nDigite la cantidad que desea retirar: ");
                
                cantidad = entrada.nextFloat();
                
                if(cantidad <= saldo)
                {
                    saldo -=cantidad; 
                }else
                {
                    System.out.println("Saldo insuficiente para realizar el retiro");
                }
                
                break;
           
            case 2:
                
                System.out.println("Digite la cantidad que desea ingresar: ");
                cantidad = entrada.nextFloat();
                saldo+=cantidad;
                
                break;
            
            case 3:
                System.out.println("Bienvenido al menú de saldo: ");
                System.out.println("Tu saldo actual es de: "+saldo);
                break;
        
            case 4:
                System.out.println("ADIOS");
                break;
        }
        
        
        
        
    }
    
}
