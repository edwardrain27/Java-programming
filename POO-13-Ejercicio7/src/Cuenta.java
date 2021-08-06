/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Cuenta {
    
    //Atributos
    private double saldo;
    private int numeroCuenta;
    
    //Métodeo constructor
    
    public Cuenta(int numeroCuenta, double saldo)
    {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    //getters and setters
    
   
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public int getNumeroCuenta()
    {
        return this.numeroCuenta;
    }
    
    public void ingresarDinero(double cantidad)
    {
        saldo+=cantidad;
    }
    
    public void retirarDinero(double cantidad)
    {
        saldo = saldo-cantidad;
    }
    
    
}
