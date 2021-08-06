/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */

public class Main {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        int incremento;
        int opcion;
        Particula particula = new Particula(0,0);
        
        do
        {
            System.out.println("MENÚ DE OPCIONES: ");
            System.out.println("1. Mover Arriba");
            System.out.println("2. Mover Abajo");
            System.out.println("3. Mover Derecha");
            System.out.println("4. Mover Izquierda");
            System.out.println("5. salir");
            System.out.println("Digite una opción: ");
            opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Digite la cantidad de pasos: ");
                    incremento = entrada.nextInt();
                    particula.moverArriba(incremento);
                    break;
                case 2:
                    System.out.println("Digite la cantidad de pasos");
                    incremento = entrada.nextInt();
                    particula.moverAbajo(incremento);
                    break;
                case 3:
                    System.out.println("Digite la cantidad de pasos");
                    incremento = entrada.nextInt();
                    particula.moverDerecha(incremento);
                    break;
                case 4:
                    System.out.println("Digite la cantidad de pasos");
                    incremento = entrada.nextInt();
                    particula.moverIzquierda(incremento);
                    break;
                    
                case 5:
                    System.out.println("ADIOS");
                    break;
                    
                default:
                    System.out.println("Esa opción no está disponible.");
            
            }
            
            System.out.println(particula.mostrarPosicion());
            
            
        }while(opcion!=5);
        
        
        
    }
    
    
}
