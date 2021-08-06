/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

/**
 *
 * @author Pablo
 */
public class Vehiculo {
    
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    //si yo defino el constructor
    public Vehiculo(String matricula, String marca, String modelo)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public String mostrarDatos()
    {
        //variable que retorna
        String s = "\nMatricula: "+this.matricula;
        s+="\nMarca: "+this.marca;
        s+="\nModelo: "+this.modelo;
        
        return s;
    }
    
    
    
    
}
