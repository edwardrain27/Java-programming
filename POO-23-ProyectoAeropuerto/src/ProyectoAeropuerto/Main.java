/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAeropuerto;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Main {
    
    public static Pasajero p1 = new Pasajero("Eduardo","12345","Colombiana");
    public static Pasajero p2 = new Pasajero("Armando","6789","Colombiana");

    static Scanner entrada = new Scanner(System.in);
    //método de busqueda secuencial
    static Pasajero[] lista = new Pasajero[10];
    //método que sirve para encontrar un Pasajero.
    public static Pasajero encontrarPasajero(String pasaporte)
    {
        boolean encontrado = false;
        int i = 0;
        Pasajero pas = null;
        while((!encontrado) && (i<lista.length))
        {
            if(pasaporte == lista[i].getPasaporte())
            {
                encontrado = true;
                pas = lista[i];
                System.out.println(pasaporte);
                System.out.println(i);
            }
            i++;
        }
        return pas;
    }
    
    /*
    public static void main(String[] args)
    {
        
        
        lista[0] = p1;
        lista[1] = p2;
        System.out.println(lista.length);
        System.out.println(lista[0].getPasaporte());
        System.out.println("Digite el pasajero que desea encontrar");
        String pasaporte = entrada.next();
       
        if(encontrarPasajero(pasaporte)!=null)
        {
            System.out.println("Encontrado");
        }else
        {
            System.out.println("No encontrado");
        }
        
        
    }
*/
}
