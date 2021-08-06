/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg37.ejercicio;

import javax.swing.JOptionPane;

/**
datas 6 notas escribir la cantidad de alumnos aprobados, condicionados y suspensos
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        double nota;
        int aprobados=0,condicionados=0,suspensos=0;
        for (int i = 0; i < 6; i++) {
            
            do {
                nota =  Double.parseDouble(JOptionPane.showInputDialog("Digite una nota"));
                
            } while (nota < 0 || nota > 10); //la nota está en el intervalo de 0 a 10.
            
            if(nota == 4)
            {
                condicionados+=1;
            }else if(nota >= 5)
            {
                aprobados+=1;
            }else
            {
                suspensos+=1;
            }
        }
        
        
        System.out.println("Cantidad de aprobados: "+aprobados);
        System.out.println("Cantidad de condicionados: "+condicionados);
        System.out.println("Cantidad de suspensos: "+suspensos);
    }
    
}
