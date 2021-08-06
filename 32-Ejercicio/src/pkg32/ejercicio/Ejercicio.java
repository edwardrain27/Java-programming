/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg32.ejercicio;

import java.util.Scanner;
import java.util.Arrays;
/**
Hacer una matriz preguntando al usuario el número de filas y columnas,
llenarla de números aleatorios, copiar el contenido a otra matriz y por último mostrarla 
en pantalla.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int m,n;
        System.out.println("Digite el numero de filas: ");
        m = entrada.nextInt();
        System.out.println("Digite el numero de columnas: ");
        n = entrada.nextInt();
        int [][]matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int)(1+Math.random()*100) ;
            }
        }
        
        for (int []fila:matriz) {
            
            System.out.println(Arrays.toString(fila));
        }
    }
    
}
