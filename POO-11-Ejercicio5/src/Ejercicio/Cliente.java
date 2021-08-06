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
public class Cliente {
    
    //atributos
    
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta[] cuentas;
    
    
    
    //Método constructor
    
    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getDni()
    {
        return this.dni;
    }
    
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    
    public double consultar_Saldo(int n)
    {
        return cuentas[n].getSaldo();
    }
    
    public void ingresar_dinero(int n, double cantidad)
    {
        cuentas[n].ingresarDinero(cantidad);
    }
    
    public void retirar_dinero(int n, double cantidad)
    {
        cuentas[n].retirarDinero(cantidad);
    }
    
    
}
