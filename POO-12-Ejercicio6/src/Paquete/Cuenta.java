/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

/**
 *
 * @author Pablo
 */
public class Cuenta {
    
    private int numeroCuenta;
    private double saldo;
    
    public Cuenta(int numeroCuenta, double saldo)
    {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    
    public int consultarCuenta()
    {
        return this.numeroCuenta;
    }
    
    public double consultarSaldo()
    {
        return this.saldo;
    }
    
    public void ingresarDinero(double saldo)
    {
        this.saldo+=saldo;
        
    }
    
    public void retirarDinero(double cantidad)
    {
        if(cantidad > this.saldo )
        {
            System.out.println("No se puede retirar más del saldo disponible");
        }else
        {
            this.saldo-=saldo;
        }
        
    }
    
    
    
    
}
