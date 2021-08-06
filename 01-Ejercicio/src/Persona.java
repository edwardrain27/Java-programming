/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Persona {
    
    String nombre;
    int edad;
    String dni;
    //Métodos
    
    //Sobrecarga de constructores
    /**
     * se pueden sobrecargar siempre y cuando los parámetros sean diferentes
     * se puede tener más de un constructor
    
    */
    
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        
    }
    
    public Persona(String dni){
        this.dni = dni;
    }
    
    //sobrecarga de métodos
    public void correr()
    {
        System.out.println("Soy "+this.nombre+ ",tengo " + edad + "años, y estoy corriendo una maraton");
    }
    
    public void correr(int km)
    {
        System.out.println("He corrido: "+km+" kilometros");
    }
    
}
