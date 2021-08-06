/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class FiguraCerrada extends Figura {
    
    private int nlados;
    
    public FiguraCerrada(double tamaño,int nlados)
    {
        super(tamaño);
        this.nlados = nlados;
    }
    
    final public void dibujar()
    {
        System.out.println("Dibujando");
    }
    
}
