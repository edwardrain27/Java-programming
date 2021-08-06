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
        Vehiculo[] vehiculos = new Vehiculo[4];
        
        vehiculos[0] = new VehiculoDeportivo("12GBZ","FERRARI","A9",500);
        vehiculos[1] = new VehiculoFurgoneta("12GBS","MUSTANG","A2",300);
        vehiculos[2] = new VehiculoTurismo("123GS","RENAULT","9",5);
        vehiculos[3] = new Vehiculo("12FG","CHEVROLET","CAMARO SS");
        
        for(Vehiculo i:vehiculos)
        {
            System.out.println(i.mostrarDatos());
            System.out.println("");
        }
        
        
    }
    
}
