/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg41.ejercicio;

import java.util.Scanner;

/**
Leer los datos correspondientes a dos tablas
* de 12 elementos numéricos, y mezclarlos en una tercera
* forma: 3 de la tabla A, 3 de la B, otros 3 de la A, otros 3 de la B, etc.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //int a[],b[],c[];
        int []a = {1,2,3,7,8,9,13,14,15,19,20,21};
        int []b = {4,5,6,10,11,12,16,17,18,22,23,24};
        int []c = new int[a.length+b.length];
        /*
        a = new int[12];
        b = new int[12];
        c = new int[a.length+b.length];
        
        
        for (int i = 0; i < 12; i++) {
            System.out.println((i+1)+" Digite el elemento: ");
            a[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < 12; i++) {
            System.out.println((i+1)+" Digite el elemento: ");
            b[i] = entrada.nextInt();
            
        }
*/
        int aux1 = 0;
        int aux2 = 3;
        int aux3 = 6;
        for (int i = 0; i < 12; i++) {
            
            c[aux1] = a[i];
            aux1++;
            c[aux2] = b[i];
            aux2++;
            
            if(aux2 == aux3)
            {
                aux1 = aux3;
                aux2+=3;
                aux3 +=6;
            }
           
        }
        
        for (int i:c) {
            System.out.println(i);
            
        }
        
    }
    
}
