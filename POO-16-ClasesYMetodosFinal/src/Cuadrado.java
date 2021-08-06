/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Cuadrado extends FiguraCerrada {

    private double area;
    
    public Cuadrado(double tamaño,int nlados, double area)
    {
        super(tamaño,nlados);
        this.area = area;
    }
    public void dibujar()
    {
        System.out.println("Dibujando cuadrado");
    }
}
