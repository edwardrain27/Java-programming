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

//Por herencia
public class AeropuertoPrivado extends Aeropuerto {
    
    private String[] empresas = new String[10];
    private int numEmpresa;

    //métodos constructor
    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.numEmpresa = 0;
    }
    

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] compañias, String[] empresas) {
        super(nombre, ciudad, pais, compañias);
        this.empresas = empresas;
        this.numEmpresa = empresas.length;
    }
    
    //Métodos
    
    public void insertarEmpresa(String empresa)
    {
        this.empresas[numEmpresa] = empresa;
        this.numEmpresa++;
    }
    
    public void insertarEmpresas(String[] empresas)
    {
        this.empresas = empresas;
        this.numEmpresa = empresas.length;
        
    }

    public String[] getEmpresas() {
        return empresas;
    }
    
    public int getNumEmpresa() {
        return numEmpresa;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
}
