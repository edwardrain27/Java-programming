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
public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta[] cuentas;
    
    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    
    
    
    public double consultarSaldo(int numeroCuenta)
    {
        double saldo = 0;
        for (int i = 0; i < this.cuentas.length; i++) {
            
            if(cuentas[i].consultarCuenta() == numeroCuenta)
            {
                saldo = cuentas[i].consultarSaldo();
                break;
            }
        }
    
        return saldo;
        
    }
    public void ingresarDinero(int n, double cantidad)
    {
        boolean band = false;
        for (int i = 0; i < this.cuentas.length; i++) {
            
            if(cuentas[i].consultarCuenta() == n)
            {
                cuentas[i].ingresarDinero(cantidad);
                band = true;
            }
        }
        
        if(band == true)
        {
            System.out.println("Transaccion Exitosa");
        }else
        {
            System.out.println("No se encontró la cuenta");
        }
    }
    
    public void retirarDinero(int n, double cantidad)
    {
        boolean band = false;
        for (int i = 0; i < this.cuentas.length; i++) {
            if(cuentas[i].consultarCuenta() == n)
            {
                cuentas[i].retirarDinero(cantidad);
                band = true;
            }
            
            if(band == false)
            {
                System.out.println("No se encontro la cuenta");
            }
            
        }
    }
    
}
