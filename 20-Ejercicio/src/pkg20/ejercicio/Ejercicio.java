/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /**
Escriba un programa que tome cada 4 horas la temperatura exterior, 
leyéndola durante un período de 24 horas. Es decir, debe leer 6 temperaturas. Calcule 
la temperatura media del día, la temperatura más alta y la más baja
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        float temp_media, temp_alta = 0, temp_baja = 999999, temperatura, sum = 0;
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Digite una temperatura: ");
            temperatura = entrada.nextFloat();
            sum+=temperatura;
            if(temperatura > temp_alta)
            {
                temp_alta = temperatura;
            }
            
            if(temperatura < temp_baja)
            {
                temp_baja = temperatura;
            }
        }
        
        temp_media = sum/6;
        
        System.out.println("La temperatura máxima es: "+temp_alta);
        System.out.println("La temperatura media es: "+temp_media);
        System.out.println("La temperatura baja es: "+temp_baja);
        
        
        
    }
    
}
