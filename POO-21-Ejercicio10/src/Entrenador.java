/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Entrenador extends Persona{
    
    private String estrategia;
    
    public Entrenador(String nombre, String apellido, int edad, String estrategia)
    {
        super(nombre,apellido,edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }
    
    @Override
    public String toString() {
        return "\nEntrenador"+super.toString() + "\nestrategia=" + estrategia;
    }
    
   
    
    @Override
    public void partidoFutbol()
    {
        System.out.println("Digire el partido");
    }
    
    @Override
    public void entrenamiento()
    {
        System.out.println("Dirige entrenamiento");
    }
    
    public void planificarEntrenamiento()
    {
        System.out.println("Planifica estrategia");
    }
    
}
