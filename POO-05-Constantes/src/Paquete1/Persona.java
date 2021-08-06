/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author Pablo
 * CONSTANTES
 * es un espacio de memoria en el cual se va a almacenar un valor
 * y ese valor no va a cambiar a lo largo de todo el programa.
 * 
 */
public class Persona {
    //¿Cómo se declara una constante?
    private final String nombre;
    private int edad;
    
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public void mostrarDatos()
    {
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    
}
