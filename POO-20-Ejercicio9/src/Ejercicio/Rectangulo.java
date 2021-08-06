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
public class Rectangulo extends Poligono {
    
    
    private double lado1;
    private double lado2;
    
    public Rectangulo(double lado1,double lado2)
    {
        //el rectangulo tiene 4 lados
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public double calcularArea()
    {
        return lado1*lado2;
    }
    
    @Override
    public double calcularPerimetro()
    {
        return 2*(lado1+lado2);
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
    
    

    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString()+ "\nlado1=" + lado1 + "\nlado2=" + lado2;
    }
    
    
    
    
    
    
}
