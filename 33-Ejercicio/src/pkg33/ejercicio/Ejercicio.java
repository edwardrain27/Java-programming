/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg33.ejercicio;

import java.util.Arrays;
import java.util.Scanner;

/**
Realice un programa que lea una matriz de 3x3 y cree su matriz traspuesta. 
La matriz traspuesta es aquella en la que la columna i era la fila i de la matriz original.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite el numero de filas: ");
        int m = entrada.nextInt();
        System.out.println("Digite el numero de columnas: ");
        int n = entrada.nextInt();
        int [][]matriz = new int[m][n];
        int [][]matriz_transpuesta = new int[n][m]; //creacion de la matriz transpuesta.
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("digite el elemento de la posicion ("+i+","+j+")");
                matriz[i][j] = entrada.nextInt();
            }
            
        }
        
        //calculo de la matriz transpuesta.
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
                
                matriz_transpuesta[i][j] = matriz[j][i];
                
            }
            
        }
        
        //impresion de la matriz normal
        
        for (int []fila:matriz) {
        
            System.out.println(Arrays.toString(fila));
        }
        
        //impresion de la matriz transpuesta
         for (int []fila:matriz_transpuesta) {
        
            System.out.println(Arrays.toString(fila));
        }
        
    }
    
}
