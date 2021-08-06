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
public class Main {


    public static void main(String[] args)
    {
        Planta planta = new Planta();
        AnimalCarnivoro tigre = new AnimalCarnivoro();
        AnimalHerbivoro vaca = new AnimalHerbivoro();
        
        tigre.alimentarse();
        planta.alimentarse();
        vaca.alimentarse();
    }
    
}
