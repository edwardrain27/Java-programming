/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.Scanner;

/**
 //Construir un programa que calcule el área y el perímetro
 * de un cuadrilátero dada la longitud de sus dos lados.
 * Los valores de la longitud deberán introducirse por línea
 * de ordenes. Si es un cuadrado, solo se proporcionará la longitud
 * de uno de los lados al constructor.
 * @author Pablo
 */
public class Main {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args)
    {   
        double lado1, lado2;
        Cuadrilatero c1;
        
        System.out.println("Digite el lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite el lado 2: ");
        lado2 = entrada.nextDouble();
        
        if(lado1 == lado2)
        {
            c1 = new Cuadrilatero(lado1);
        }else
        {
            c1 = new Cuadrilatero(lado1,lado2);
        }
        
        
        System.out.println("El area es: "+c1.getArea());
        System.out.println("El perimetro es: "+c1.getPerimetro());
        
        
        
        
    }
    
}
