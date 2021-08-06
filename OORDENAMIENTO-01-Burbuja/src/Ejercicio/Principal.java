/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Principal {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        int a[];
        int aux,n;
      
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        a = new int[n];
        
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+".Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        
        for (int i = 0; i < a.length-1; i++) {
            
            for (int j = i+1; j < 10; j++) {
                if(a[i] > a[j])
                {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
            
        }
        
        
        for (int i:a) {
            System.out.print("| "+i);
            
        }
    }
}
