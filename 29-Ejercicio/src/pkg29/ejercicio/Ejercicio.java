/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29.ejercicio;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Pablo
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
        
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                System.out.println("Digite el elemento de la posicion: ("+i+","+j+")");
                matriz[i][j] = entrada.nextInt();
                           
            }
            
        }
        
       for(int []filas:matriz)
       {
           System.out.println(Arrays.toString(filas));
       }
    }
    
}
