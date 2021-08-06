/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Main {
    
    static Scanner entrada = new Scanner(System.in);
    //al ser estático, está en todo el programa
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>(); //arreglo dinámico.
    
    
    //creo un método Estático
    
    public static void mostrarPoligonos()
    {
        for (Poligono poligono:poligonos) {
            System.out.println(poligono.toString());
            System.out.println("El area es: "+poligono.calcularArea());
            System.out.println("El perimetro es: "+poligono.calcularPerimetro());
            
        }
    }
    public static void crearTriangulo()
    {
        double lado1, lado2, lado3;
        System.out.println("\f");
        System.out.println("\nCREAR TRIANGULO");
        System.out.print("Digite el lado1: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado3: ");
        lado3 = entrada.nextDouble();
        poligonos.add(new Triangulo(lado1,lado2,lado3));
    }
    
    
    public static void crearRectangulo()
    {
        double lado1,lado2;
        System.out.println("\nCREACION DE RECTANGULO");
        System.out.print("Digite el lado1: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2: ");
        lado2 = entrada.nextDouble();
        poligonos.add(new Rectangulo(lado1,lado2));
    }
    
    public static void llenarPoligono()
    {
        int opcion;
        char s;
        do
        {
            do
            {   
                System.out.println("\nMENU DE OPCIONES");
                System.out.println("1.Crear Triangulo");
                System.out.println("2.Crear Rectangulo");
                System.out.println("3.Mostrar Poligonos");
                System.out.println("Digite la opción que desea realizar: ");
                opcion = entrada.nextInt();
                
            }while(opcion <1 || opcion >3);
            switch(opcion)
            {
                case 1:
                    //crear Triangulo
                    crearTriangulo();
                    break;
                case 2:
                    //crear Rectangulo
                    crearRectangulo();
                    break;
                case 3:
                    //mostrarPoligonos
                    mostrarPoligonos();
                    break;
                    
                default:
                    System.out.println("\n¡ADIOS!");
                    
            }
            
            System.out.println("¿Desea crear otro polígono? (s/n)");
            s = entrada.next().charAt(0);
        }while(s == 's' || s =='S');
        
    }
    
    
    public static void main(String[] args)
    {
        
        
        llenarPoligono();
        
        
        
    }
    
}
