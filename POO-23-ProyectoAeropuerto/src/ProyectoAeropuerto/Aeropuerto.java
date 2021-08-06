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
public class Aeropuerto {
    
    //Atributos
    //Suponiendo que solo tenemos 10 compañias trabajando en cada aeropuerto
    protected String nombre;
    protected String ciudad;
    protected String pais;
    protected int numCompañia;
    protected Compañia[] compañias = new Compañia[10];
 
    public Aeropuerto(String nombre, String ciudad, String pais)
    {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompañia = 0;
        
    }
    
    
    
    public Aeropuerto(String nombre, String ciudad, String pais,Compañia[] compañias)
    {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.compañias = compañias;
        this.numCompañia = compañias.length;
        
    }  

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public int getNumCompañia() {
        return numCompañia;
    }

    public Compañia[] getCompañias() {
        return compañias;
    }
    
    public void insertarCompañia(Compañia compañia)
    {
        this.compañias[numCompañia] = compañia;
        numCompañia++;
        
    }
    
    public Compañia getCompañia(int i)
    {
        return this.compañias[i];
    }
    
    public Compañia getCompañia(String nombre)
    {
        Compañia c = null;
        for (int i = 0; i < numCompañia; i++) {
            if(nombre.equals(compañias[i].getNombre()))
            {
                c = compañias[i];
                break;
            }
        }
        return c;
    }
    
    
    
    
}
