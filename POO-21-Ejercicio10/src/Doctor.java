/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Doctor extends Persona {

    private String titulacion;
    private int aniosExp;
    
    
    public Doctor(String nombre, String apellido, int edad, String titulacion, int aniosExp)
    {
        super(nombre,apellido,edad);
        this.titulacion = titulacion;
        this.aniosExp = aniosExp;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    @Override
    public String toString() {
        return "\nDoctor:" +super.toString()+ "\ntitulacion=" + titulacion + "\naniososExp=" + aniosExp;
    }
    
    
    
    
    @Override
    public void partidoFutbol()
    {
        System.out.println("Da asistencia medica");
    }
    
    @Override
    public void entrenamiento()
    {
        System.out.println("Da asistencia medica en un entrenamiento");
    }
    
    public void curarLesion()
    {
        System.out.println("cura la lesion");
    }
}
