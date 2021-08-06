/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg34.ejercicio;

import java.util.Arrays;
import java.util.Scanner;

/**
Realice un programa que calcule la suma de dos matrices cuadradas de 
3x3.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here

        int [][]A = {{1,2,3},{4,5,6},{7,8,9}};
        int [][]B = {{10,11,12},{13,14,15},{16,17,18}};
        int [][]resultante = new int[3][3];
        //suma de matricez
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultante[i][j] = A[i][j]+B[i][j];
            }    
        }
        
        //matriz resultante
        for (int []fila:resultante) {
            
            System.out.println(Arrays.toString(fila));
            
        }
        
    }
    
}
