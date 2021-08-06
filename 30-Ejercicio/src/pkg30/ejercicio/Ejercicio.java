/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30.ejercicio;

/**
 Realiza un programa que defina una matriz de 3x3 y escriba un ciclo para 
que muestre la diagonal principal de la matriz.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][]matriz = {{1,2,3},{4,5,6},{7,8,9}};
        String espacio="";
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j)
                {
                    System.out.println(espacio+matriz[i][j]);
                    espacio+=" ";
                }
            }
        }
        
        
    }
    
}
