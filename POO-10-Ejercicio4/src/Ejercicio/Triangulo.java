/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Pablo
 */
public class Triangulo {
    
    
    //Atributos
    private double lado1;
    private double lado2;
    
    //Metodo constructor
    
    public Triangulo(double lado1, double lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
       
    } 
    
    //Métodos 
    
    public double getArea()
    {
        return (lado2*Math.sqrt(Math.pow(lado1,2)-(Math.pow(lado2,2)/4)))/2;
    }
    
    public double getPerimetro()
    {
        return 2*lado1+lado2;
    }
    
    public String mostrarDatos()
    {
        String s = "Area: "+getArea();
        s+="\nPerimetro: "+getPerimetro();
        
        return s;
    }
    
    
    
    
}
