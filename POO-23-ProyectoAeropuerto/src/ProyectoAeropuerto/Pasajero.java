/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAeropuerto;

/**
 *
 * @author Pablo
 */
public class Pasajero {

    //atributos
    private String nombre;
    private String pasaporte;
    private String nacionalidad;
    
    
    //Método constructor del proyecto aeropuerto
    public Pasajero(String nombre, String pasaporte, String nacionalidad){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
    
}
