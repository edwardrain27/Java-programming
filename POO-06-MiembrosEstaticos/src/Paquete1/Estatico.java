/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author Pablo
 * cada objeto que se crea es una copia distinta.
 * el static le pertenece a la clase. Si se modifica
 * se modifica en todos los objetos.
 * si lo cambio en un objeto, cambiará para todos los objetos.
 * no se necesita instanciar un objeto para poder utilizarlo
 */
public class Estatico {
    
    private static String frase ="Primera frase";
    
    
    public static int sumar(int n1, int n2)
    {
        return n1+n2;
    }
    
    public static void main(String[] args)
    {
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "Segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        
        System.out.println("frase: "+Estatico.frase);
        System.out.println("suma: "+Estatico.sumar(3, 4));
        
    }
    
}
