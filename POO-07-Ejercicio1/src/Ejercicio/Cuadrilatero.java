/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 * Construir un programa que calcule el área y el perímetro
 * de un cuadrilátero dada la longitud de sus dos lados.
 * Los valores de la longitud deberán introducirse por línea
 * de ordenes. Si es un cuadrado, solo se proporcionará la longitud
 * de uno de los lados al constructor.
 * @author Pablo
 */
public class Cuadrilatero {
    
    //atributos
    private double lado1;
    private double lado2;
   
    
    
    //Métodos constructor por sobrecarga de constructores.
    public Cuadrilatero(double lado1,double lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public Cuadrilatero(double lado1)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Getters and Setters.
    public double getLado1() {
        return lado1;
    }

 

    public double getLado2() {
        return lado2;
    }

  
    
    public double getArea()
    {
        double area = this.lado1*this.lado2; 
        return area;
    }
    
    public double getPerimetro()
    {
        double perimetro = 2*(lado1+lado2);
        return perimetro;
    }
    
   
    
    
    
}
