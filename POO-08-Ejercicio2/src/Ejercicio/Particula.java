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
public class Particula {
    
    //ATRIBUTOS.
    private int posX;
    private int posY;
    
    
    //MÉTODO CONTRUCTOR
    public Particula(int Posx, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }
    
    
    //MOVIMIENTOS DE LA PARTÍCULA.
    public void moverArriba(int incremento )
    {
        this.posY+=incremento;
    }
    
    public void moverAbajo(int incremento)
    {
        this.posY-=incremento;
    }
    
    public void moverDerecha(int incremento)
    {
        this.posX+=incremento;
    }
    
    public void moverIzquierda(int incremento)
    {
        this.posX-=incremento;
    }
    
    
    public int getPosX()
    {
        return this.posX;
    }
    
    public int getPosY()
    {
        return this.posY;
    }
    
    
    public String mostrarPosicion()
    {
        return "la posición actual es :"+ "(" + this.posX + ", " + this.posY + ")";
    }
    
    
    
}
