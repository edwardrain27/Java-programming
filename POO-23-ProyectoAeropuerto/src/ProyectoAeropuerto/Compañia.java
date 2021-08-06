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
public class Compañia {
    
    //atributos
    private String nombre;
    private Vuelo[] listaVuelos;
    private int numVuelo = 0;

    //método constructor con sobrecarga de métodos
    public Compañia(String nombre) {
        this.nombre = nombre;
        this.listaVuelos = new Vuelo[10];
    }
    
    public Compañia(String nombre, Vuelo[] listaVuelos) {
        //inicialización de los atributos
        this.nombre = nombre;
        this.listaVuelos = listaVuelos;
        numVuelo = listaVuelos.length;
    }
       
    public void insertarVuelo(Vuelo v)
    {
        listaVuelos[numVuelo] = v;
        numVuelo++;
        
    }
    
    public Vuelo getVuelo(int i)
    {
        return listaVuelos[i];
    }
    
    public Vuelo getVuelo(String identificacion)
    {
        Vuelo v = null;
        for (int i = 0; i < numVuelo; i++) {
            if(identificacion.equals(listaVuelos[i].getIdentificador()))
            {
                v = this.listaVuelos[i];
                break;
            }
        }
        return v;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }
    
    
    
    
}
