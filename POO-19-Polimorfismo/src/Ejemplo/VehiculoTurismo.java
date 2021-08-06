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
public class VehiculoTurismo extends Vehiculo {
    
    private int numeroPuertas;
    
    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas)
    {
        super(matricula,marca,modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    @Override
    public String mostrarDatos()
    {
        //variable que retorna
        String s = "\nMatricula: "+this.matricula;
        s+="\nMarca: "+this.marca;
        s+="\nModelo: "+this.modelo;
        s+="\nNumero de Puertas: "+this.numeroPuertas;
        
        return s;
    }
    
    
    
}
