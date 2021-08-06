/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public abstract class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    
    public Persona(String nombre, String apellido, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    //interesante ejercicio
    //Estos métodos son abstractos ya que estas clases hacen lo mismo, pero depende de como lo hace.
    
  

    public void viajar(){
        System.out.println("Viajar");
        
    }
    
    @Override
    public String toString() {
        return "\nnombre=" + nombre + "\napellido=" + apellido + "\nedad=" + edad;
    }
    
    
    
    //Métodos Abstractos
    public abstract void partidoFutbol();
    
    public abstract void entrenamiento();
    
    
    
    
    
}
