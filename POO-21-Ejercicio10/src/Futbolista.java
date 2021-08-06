/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Futbolista extends Persona {
    
    private int dorsal;
    private String posicion;
    
    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion)
    {
        super(nombre,apellido,edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "\nFutbolista:"+super.toString() + "\ndorsal=" + dorsal + "\nposicion=" + posicion;
    }
    
    @Override
    public void partidoFutbol()
    {
        System.out.println("Juega el partido de futbol");
    }
    
    @Override
    public void entrenamiento()
    {
        System.out.println("Entrena");
    }
    
    public void entrevista()
    {
        System.out.println("Da una entrevista");
    }
    
}
