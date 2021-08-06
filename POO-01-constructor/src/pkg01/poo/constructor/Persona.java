/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.poo.constructor;

/**
 *
 * @author Pablo
 */
public class Persona {

    //atributos
    String nombre;
    int edad;
    
    //Métodos
    //Constructor
    
    public Persona(String nombre, int edad)
    {
        //inicializo los atributos de la clase
        this.nombre = nombre;
        this.edad = edad;
        
      
    }
    
    public void mostrarDatos()
       {
          System.out.println("El nombre es: "+nombre);
          System.out.println("la edad es: "+edad);
       }    
}
