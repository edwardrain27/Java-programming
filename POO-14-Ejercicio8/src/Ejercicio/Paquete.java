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
public class Paquete {
    
    
    //Atributos
    private String dni;
    private int id_paquete;
    private double peso;
    private int prioridad;
    
    //método constructor
    public Paquete(int id_paquete, String dni, double peso, int prioridad)
    {
        this.id_paquete = id_paquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public String getDni() {
        return dni;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }
    //método para mostrar los datos del paquete.
    public String mostrarDatos()
    {
        String s = "Numero de referencia: "+this.id_paquete;
        s+="\nNumero de identificación persona: "+this.dni;
        s+="\nPeso paquete: "+this.peso;
        s+="\nPrioridad: "+this.prioridad;
        
        return s;
    }
    
    
    
    
    
    
    
    
    
}
