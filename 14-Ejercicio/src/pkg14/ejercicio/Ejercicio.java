/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
Cambiar un número entero con el mismo valor pero en romanos.
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Digite un número: ");
        int numero = entrada.nextInt();
        int unidades, decenas, centenas, millares;
        String numero_romano = "";
        
        millares = (int) numero/1000; //obtengo las unidades de millares.
        centenas = (int) (numero%1000)/100; //obtengo las centenas.
        decenas = (int) ((numero%1000)%100)/10; //obtengo las decenas.
        unidades = (int) ((numero%1000)%100)%10; //obtengo las unidades.
        
        System.out.println(millares);
        System.out.println(centenas);
        System.out.println(decenas);
        System.out.println(unidades);
        
        switch(millares)
        {
            case 1:
                numero_romano+="M";
                break;
            case 2:
                numero_romano+="MM";
                break;
            case 3:
                numero_romano+="MMM";
                break;
            case 4:
                numero_romano+="MV";
                break;
            case 5:
                numero_romano+="V";   
            
        }
        
        switch(centenas)
        {
            case 1:
                numero_romano+="C";
                break;
            case 2:
                numero_romano+="CC";
                break;
            case 3:
                numero_romano+="CCC";
                break;
            case 4:
                numero_romano+="CD";
                break;
            case 5:
                numero_romano+="D";
                break;
            case 6:
                numero_romano+="DC";
                break;
            case 7:
                numero_romano = "DCC";
                break;
            case 8:
                numero_romano = "DCCC";
                break;
            case 9:
                numero_romano = "DM";
                 
        }
        
        switch(decenas)
        {
            case 1:
                numero_romano+="X";
                break;
            case 2:
                numero_romano+="XX";
                break;
            case 3:
                numero_romano+="XXX";
                break;
            case 4:
                numero_romano+="XL";
                break;
            case 5:
                numero_romano+="L";
                break;
            case 6:
                numero_romano+="LX";
                break;
            case 7:
                numero_romano+="LXX";
                break;
            case 8:
                numero_romano+="LXXX";
                break;
            case 9:
                numero_romano+="LC";
                break;         
        }
        
        switch(unidades)
        {
            case 1:
                numero_romano+="I";
                break;
            case 2:
                numero_romano+="II";
                break;
            case 3:
                numero_romano+="III";
                break;
            case 4:
                numero_romano+="IV";
                break;
            case 5:
                numero_romano+="V";
                break;
            case 6:
                numero_romano+="VI";
                break;
            case 7:
                numero_romano+="VII";
                break;
            case 8:
                numero_romano+="VIII";
                break;
            case 9:
                numero_romano+="IX";
                break;
        }

         System.out.println("El número es: "+numero_romano);
        
        
    }
    
}
