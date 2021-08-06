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
public class Triangulo extends Poligono{
    
    //atributos
    private double lado1;
    private double lado2;
    private double lado3;
    
    
    public Triangulo(double lado1, double lado2, double lado3)
    {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
    //por la fórmula de Herón
    @Override
    public double calcularArea()
    {
        double s = (1/2)*(lado1+lado2+lado3);
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    
    @Override
    public double calcularPerimetro()
    {
        return lado1+lado2+lado3;
    }

    @Override
    public String toString() {
        return "\nTriangulo: " +super.toString()+ "\nlado1=" + lado1 + "\nlado2=" + lado2 + "\nlado3=" + lado3;
    }
    
    
    
    
    
}
