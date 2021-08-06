/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Estudiante extends Persona {
    
    //Atributos
    
    private int codigoEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante,float notaFinal)
    {
        super(nombre,apellido,edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }
    
    
    //Sobre Escritura de miembros

    public void mostrarDatos()
    {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("Codigo Estudiante: "+this.codigoEstudiante);
        System.out.println("Nota final: "+this.notaFinal);
    }
    
    
    
    

    
    
    
}
