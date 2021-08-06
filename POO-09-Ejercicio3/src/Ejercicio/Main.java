/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Main {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Atleta> atletas = new ArrayList<Atleta>();
    
    
    public static int calcularGanador(Atleta[] atletas)
    {
        int pos = 0;
        float menor = 99999;
        for(int i = 0; i < atletas.length; i++)
        {
            if(atletas[i].getTime()< menor)
            {
                menor = atletas[i].getTime();
                pos = i;
            }
        }
        
        return pos;
    }
    
    public static void main(String[] args)
    {
        String nombre;
        int numeroAtleta,nAtletas;
        float tiempoCarrera;
        Atleta atletas[];
        
        System.out.println("Digite el numero de atletas que van a participar: ");
        nAtletas = entrada.nextInt();
        
        
        atletas = new Atleta[nAtletas];
        
        for (int i = 0; i < nAtletas; i++) {
            
            System.out.print("Digite el nombre del atleta: ");
            nombre = entrada.next();
            
            System.out.print("Digite el numero del atleta: ");
            numeroAtleta = entrada.nextInt();
            
            System.out.print("Digite el tiempo de carrera: ");
            tiempoCarrera = entrada.nextFloat();
            
            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);        
        }
        
        
        int ganador = calcularGanador(atletas);
        
        System.out.println("Atleta ganador");
        
        System.out.println(atletas[ganador].mostrarDatos());
        
        
        
    }
    
}
