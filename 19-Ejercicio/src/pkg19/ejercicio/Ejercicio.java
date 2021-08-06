/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19.ejercicio;

/**
Realice un programa que calcule y muestre en la salida estándar la suma 
de los cuadrados de los 10 primeros enteros mayores que cero.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            
            suma+=i*i;
        }
        
        System.out.println("La suma de los cuadrados es: "+suma);
        
    }
    
}
