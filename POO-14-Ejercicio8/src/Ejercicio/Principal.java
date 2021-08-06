/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */

public class Principal {
    
    public static int buscarSucursal(int numero, Sucursal[] sucursales, int n)
    {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            
            if(numero == sucursales[i].getId_sucursal())
            {
                pos = i;
                break;
            }
            
        }
        
        return pos;
    }
    
    public static int buscarPaquete(int numero, Paquete[] paquetes,int n)
    {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if(numero == paquetes[i].getId_paquete())
            {
                pos = i;
                break;
            }
        }
        return pos;
    }
    

    static Scanner entrada = new Scanner(System.in);
    //método main
    public static void main(String[] args)
    {
        
        Sucursal[] sucursales = new Sucursal[50]; //creamos un arreglo de máximo 50 sucursales
        int idSucursal, idPaquete, prioridad,opcion,contadorSucursal = 0,contadorPaquete = 0, indiceSucursal,indicePaquete;
        double peso, precio;
        String dni,ciudad,direccion; //datos de envio a persona, la ciudad y la direccion de la surcusal.
        
        Paquete[] paquetes = new Paquete[50];
        
        do
        {
            entrada.nextLine();
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1.Crear sucursal");
            System.out.println("2.Enviar paquete");
            System.out.println("3.Consultar sucursal");
            System.out.println("4.Consultar paquete");
            System.out.println("5.Mostrar todas las sucursales");
            System.out.println("6.Mostrar todos los paquetes");
            System.out.println("7.Salir");
            System.out.print("Digite la opción que desea realizar: ");
            opcion = entrada.nextInt();
            
            switch(opcion)
            {
                case 1:
                    
                    Sucursal sucursal;
                    System.out.println("\nCREAR SUCURSAL ");
                    System.out.print("Digite la id de la sucursal: ");
                    idSucursal = entrada.nextInt();
                    System.out.print("Digite la ciudad: ");
                    ciudad = entrada.next();
                    System.out.print("Digite la direccion: ");
                    direccion = entrada.next();
                    sucursales[contadorSucursal] = new Sucursal(idSucursal,direccion,ciudad);
                    
                    
                    System.out.println("¡Sucursal Creada con exito!");
                    System.out.println("\nDATOS DE LA SUCURSAL");
                    System.out.println(sucursales[contadorSucursal].mostrarDatos());
                    contadorSucursal++;
                    break;
                    
                case 2:
                    
                    int pos;
                    System.out.println("\nENVIAR PAQUETE");
                    System.out.print("Digite el número de la sucursal: ");
                    idSucursal = entrada.nextInt();
                    pos = buscarSucursal(idSucursal,sucursales,contadorSucursal);
                    if(pos !=-1)
                    {
                         
                        System.out.println("\nDIGITE LOS DATOS DEL PAQUETE");
                        boolean band = false;
                        System.out.print("\nDigite el numero del paquete: ");
                        idPaquete = entrada.nextInt();
                        System.out.print("Digite el documento de indentidad del destinatario: ");
                        dni = entrada.next();
                        System.out.print("Digite el peso del paquete(Kg): ");
                        peso = entrada.nextDouble();
                        System.out.println("\nSeleccione la prioridad del paquete: ");
                        System.out.println("0. Normal  -> 1$ por Kg");
                        System.out.println("1. Alta    -> 1$ por Kg + 10$");
                        System.out.println("2. Express -> 1$ por Kg + 20$");
                        
                        do
                        {
                            if(band)
                            {
                                System.out.println("Por favor, digite un valor entre 0 y 2.");
                            }
                            prioridad = entrada.nextInt();
                            band = true;
                        }while((prioridad < 0) || (prioridad > 2));
                        
                        paquetes[contadorPaquete] = new Paquete(idPaquete,dni,peso,prioridad);
                        
                        System.out.println("Datos de la sucursal");
                        System.out.println(sucursales[pos].mostrarDatos());
                        
                        System.out.println("\nDatos del paquete");
                        System.out.println(paquetes[contadorPaquete].mostrarDatos());
                        
                        
                        System.out.println("\nPRECIO DEL ENVIO: "+sucursales[pos].calcularPrecioPaquete(paquetes[contadorPaquete])+"$ USD");
                        contadorPaquete++;
                    }else
                    {
                        System.out.println("No se encontró la sucursal digitada");
                    }
                
                    break;
                    
                case 3:
                    
                    System.out.println("\nCONSULTAR SUCURSAL");
                    System.out.print("\nDigite el numero de la sucursal que desea consultar: ");
                    idSucursal = entrada.nextInt();
                    indiceSucursal = buscarSucursal(idSucursal, sucursales,contadorSucursal);
                    if(indiceSucursal == -1)
                    {
                        System.out.println("La sucursal con el numero "+idSucursal+" no existe.");
                    }else
                    {
                        System.out.println("DATOS DE LA SUCURSAL "+idSucursal);
                        System.out.println(sucursales[indiceSucursal].mostrarDatos());
                    }
                    
                    
                    break;
                
                    
                case 4:
                    
                    System.out.println("\nCONSULTAR PAQUETE ");
                    System.out.print("Digite el numero del paquete: ");
                    idPaquete = entrada.nextInt();
                    indicePaquete = buscarPaquete(idPaquete,paquetes,contadorPaquete);
                    
                    if(indicePaquete == -1)
                    {
                        System.out.println("El paquete con el numero "+idPaquete+ " no coincide con ningún registro");
                    }else
                    {
                        System.out.println("\nDATOS DEL PAQUETE "+idPaquete);
                        System.out.println(paquetes[indicePaquete].mostrarDatos());
                    }
                    break;
                   
                case 5:
                    System.out.println("LISTA DE TODAS LAS SUCURSALES \n");
                    
                    for (int i = 0; i < contadorSucursal; i++) {
                        System.out.println("\nDatos de la sucursal N°"+(i+1));
                        System.out.println(sucursales[i].mostrarDatos());
                    }
                    
                    break;
                
                case 6:
                    System.out.println("LISTA DE TODOS LOS PAQUETES");
                    for (int i = 0; i < contadorPaquete; i++) {
                        System.out.println("\nDatos del paquete N°"+(i+1));
                        System.out.println(paquetes[i].mostrarDatos());
                    
                    }
 
                    
                    break;
 
                case 7:
                    System.out.println("\n¡ADIOS!");
                    break;
                default:
                    System.out.println("Por favor, digite una opción correcta");
                
                    
            }
        }while(opcion!=7);
        
        
    }
}
