/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg49.ejercicio;

import java.util.Scanner;

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
        
        int A[][];
        int m,n;
        System.out.print("Digite el numero de filas: ");
        m = entrada.nextInt();
        System.out.print("\nDigite el numero de columnas: ");
        n = entrada.nextInt();
        A = new int[m][n];
        int vector[] = new int[m*n];
        
        //llenar la matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                System.out.println("("+i+","+j+")"+".Digite el elemento:");
                A[i][j] = entrada.nextInt();
            }
        }
        
        
        //sacar los elementos de la matriz y meterla en un vector
        int k=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                vector[k] = A[i][j];
                k++;
            }
        }
        int aux;
        System.out.println("Ordenamiento del vector: ");
        for (int i = 0; i < vector.length-1; i++) {
            for (int j = i+1; j < vector.length; j++) {
                
                if(vector[i] < vector[j])
                {
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        
        k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              A[i][j] = vector[k];
              k++;
            }
        }
        
        System.out.println("\nMATRIZ");
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j]);
                System.out.print("|");
            }
            System.out.println("");
        }
        
        
        
        
        
        
    }
    
}
