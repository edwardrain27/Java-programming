/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAeropuerto;

/**
 El vuelo por si solo es una entidad
 */
public class Vuelo {


    //Atributos
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private Pasajero[] listaPasajeros;
    private int numMaximoPasajeros;
    private int numActual;
    
    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino,double precio,int numMaximoPasajeros)
    {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaximoPasajeros = numMaximoPasajeros;
        listaPasajeros = new Pasajero[numMaximoPasajeros];
        numActual = 0;
    }
    
    //método que me permite insertar un pasajero
    public void insertarPasajero(Pasajero p)
    {
        listaPasajeros[numActual] = p;
        numActual++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaximoPasajeros() {
        return numMaximoPasajeros;
    }

    public int getNumActual() {
        return numActual;
    }
    
    //sobreEscritura de métodos
    public Pasajero getPasajero(String pasaporte)
    {
        
        Pasajero pasajero = null;
        for (int i = 0; i < this.numActual; i++) {
            if(listaPasajeros[i].getPasaporte() == pasaporte)
            {
                pasajero = listaPasajeros[i];
                break;
                
            }
        }
        
        return pasajero;
        
    }
    
    public Pasajero getPasajero(int i)
    {
        return listaPasajeros[i];
    }
    
    
    
    
}
