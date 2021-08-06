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
public class AeropuertoPublico extends Aeropuerto {
    
    private double subvencion;

    //Sobrecarga de 3 constructores

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais, Compañia[] compañias) {
        super(nombre, ciudad, pais, compañias);
        this.subvencion = subvencion;
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }
    

    public double getSubvencion() {
        return subvencion;
    }
    
    
    
    

    
    
    
    
}
