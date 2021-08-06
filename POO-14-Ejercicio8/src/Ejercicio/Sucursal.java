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
public class Sucursal {
    
    //atributos
    private int id_sucursal;
    private String direccion;
    private String ciudad;

    
    
    //método constructor
    
    public Sucursal(int id_sucursal, String direccion, String ciudad)
    {
        this.id_sucursal = id_sucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    //método toString para mostrar los datos.
    public String mostrarDatos()
    {
        String s = "\nNumero sucursal: "+this.id_sucursal;
        s+="\nCiudad: "+this.ciudad;
        s+="\nDireccion: "+this.direccion;
        return s;
    }
    
    public double calcularPrecioPaquete(Paquete paquete)
    {
        double precio = paquete.getPeso();
        
        if(paquete.getPrioridad() == 1)
        {   
            System.out.println("Prioridad Alta");
            precio+=10;
        }else if(paquete.getPrioridad() == 2);
        {
            System.out.println("Prioridad Express");
            precio+=20;
        }
        
        return precio;
    }
}
