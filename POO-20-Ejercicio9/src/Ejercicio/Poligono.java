/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Pablo
 */
public abstract class Poligono {
    
    protected int numeroLados;
    
    public Poligono(int numeroLados)
    {
        this.numeroLados = numeroLados;
    }
    
    //Métodos
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();

    //Método getNumeroLados()
    public int getNumeroLados() {
        return numeroLados;
    }
    
    
    //El overrride se genera porque estamos sobreescribiendo un elemento de object.
    @Override
    public String toString() {
        return "\nnumeroLados=" + numeroLados;
    }
    
    

    
    
}
