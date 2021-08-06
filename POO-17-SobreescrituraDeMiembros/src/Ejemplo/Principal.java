/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

/**
 *
 * Heredas un método de la clase padre pero lo modifico.
 * 
 */
public class Principal {
    
    public static void main(String[] args)
    {
        Persona p1 = new Persona();
        Perro perrito1 = new Perro();
        
        p1.comer();
        perrito1.comer();
        
    }
}
