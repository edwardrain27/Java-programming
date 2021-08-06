/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Cliente {
    
    //atributos
    
    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta[] cuentas;
    
    //Método constructor
    
    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }
    
    
    public double consultarSaldo(int n)
    {
        return cuentas[n].getSaldo();
    }
    
    public void ingresarDinero(int n, double cantidad)
    {
        cuentas[n].ingresarDinero(cantidad);
    }
    
    public void retirarDinero(int n, double cantidad)
    {
        cuentas[n].retirarDinero(cantidad);
    }
    
    
}
