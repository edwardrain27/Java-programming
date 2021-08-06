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
public class Atleta {
    
    
    //ATRIBUTOS
    private int number;
    private String name;
    private float time;
    
    //MÉTODO CONSTRUCTOR
    public Atleta(int number, String name, float time)
    {
        this.number = number;
        this.name = name;
        this.time = time;
    }

    //GETTERS AND SETTERS.
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
    
    public String mostrarDatos()
    {
        
        String s="nombre: "+ this.name;
        s+="\nnumero:"+ this.number;
        s+="\ntiempo: " + this.time;
        
        return s;
    }
    
    
    
    
    
}
