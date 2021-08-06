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
public class Persona {
    
    
    //atributos
    String nombre;
    int edad;
    String dni;
    
    //sobrecarga de métodos constructor
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(String dni)
    {
        this.dni = dni;
    }
    
    
    //sobrecarga de métodos
    
    public void correr()
    {
        System.out.println("Me llamo "+this.nombre + "tengo "+this.edad+" años y estoy corriendo una maraton");
    }
    
    public void correr(double km)
    {
        System.out.println("He corrido "+km+" kilometros");
    }
    

    
}
