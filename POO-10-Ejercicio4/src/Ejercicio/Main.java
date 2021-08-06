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
    
    public static double calcularAreaMayor(Triangulo[] triangulos)
    {
        int pos = 0;
        
        for (int i = 0; i < triangulos.length; i++) {
            if(triangulos[i].getArea() > triangulos[pos].getArea())
            {
                pos = i;
            }
        }
    
        return triangulos[pos].getArea();
    }
    public static void main(String[] args)
    {
        Triangulo[] triangulos;
        
        int n;
        double lado1, lado2;
        
        System.out.println("Digite el numero de triangulos: ");
        n = entrada.nextInt();
        
        triangulos = new Triangulo[n];
        
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println();
            System.out.print("\nDigite los datos del triangulo "+(i+1));
            System.out.println(entrada.nextLine());
            System.out.print("Digite el lado ");
            lado1 = entrada.nextDouble();
            System.out.print("Digite el lado de la base: ");
            lado2 = entrada.nextDouble();
            
            triangulos[i] = new Triangulo(lado1,lado2);
            System.out.print("\nEl perimetro del triangulo es: "+triangulos[i].getPerimetro());
            System.out.print("\nEl area del triangulo es: "+triangulos[i].getArea());
        }
        
        double area = calcularAreaMayor(triangulos);
        System.out.println();
        System.out.print("\nEl area del triangulo de mayor area es: "+area);

        
    }
}
