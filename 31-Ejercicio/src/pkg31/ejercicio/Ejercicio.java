/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31.ejercicio;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Pablo
 */
public class Ejercicio {

    /**
Hacer una matriz de tipo entera de 2 * 2, llenarla de números y luego copiar 
todo su contenido hacia otra matriz.

     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][]matriz = new int[2][2];
        int [][]copia = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("digite el elemento de la posición ("+i+","+j+")");
                matriz[i][j] = entrada.nextInt();
                               
            }
        }
        
        //realizar copia de la matriz:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                copia[i][j] = matriz[i][j];
            }
        }
        
        for (int []fila:copia) {
            
            System.out.println(Arrays.toString(fila));
            
        }
    }
    
}
