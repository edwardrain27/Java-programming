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
public class Cuenta {
    
    //Atributos
    
    private int numeroCuenta;
    private double saldo;
    
    
    //Método constructor
    public Cuenta(int numeroCuenta, double saldo)
    {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public int getNumeroCuenta()
    {
        return this.numeroCuenta;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void ingresarDinero(double cantidad)
    {
        saldo+=cantidad;
    }
    
    public void retirarDinero(double cantidad)
    {
        if(cantidad <= saldo)
        {
            saldo-=cantidad;
        }else
        {
            System.out.println("Es imposible hacer este retiro");
        }
    }
    
}
