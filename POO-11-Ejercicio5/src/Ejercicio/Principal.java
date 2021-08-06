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
    
    public static int buscarCuenta(int numeroCuenta, Cuenta[] cuentas)
    {
        int pos = 0;
        boolean encontrado = false;
        
        for (int i = 0; i < cuentas.length; i++) {
            if(cuentas[i].getNumeroCuenta() == numeroCuenta)
            {
                pos = i;
                encontrado = true;
                break;
            }
        }
        if (encontrado == false)
        {
            pos = -1;
        }
        
        return pos;
    }
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        //valores necesarios.
        double saldo, cantidad;
        String nombre, dni, apellido;
        int n, numeroCuenta,opcion, indiceCuenta;
        Cliente cliente;
        Cuenta cuentas[];
        
        System.out.print("Digite el nombre del cliente: ");
        nombre = entrada.next();
        System.out.print("Digite el apellido del cliente: ");
        apellido = entrada.next();
        System.out.print("Digite el documento de identidad: ");
        dni = entrada.next();
        System.out.print("Digite el numero de cuentas: ");
        n = entrada.nextInt();
        
        cuentas = new Cuenta[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("\nDigite los datos de la cuenta "+(i+1));
            System.out.print("\nDigite el numero de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();
            
            cuentas[i] = new Cuenta(numeroCuenta,saldo);
            
        }
        
        cliente = new Cliente(nombre, apellido,dni,cuentas);
        
        
        
        do
        {
            System.out.println("\nMenu de Opciones");
            System.out.println("1. Consultar Saldo de la cuenta");
            System.out.println("2. Ingresar dinero de la cuenta");
            System.out.println("3. Retirar dinero de la cuenta");
            System.out.println("4. Salir");
            
            System.out.println("Digite la opcion que desea realizar: ");
            opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Digite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarCuenta(numeroCuenta,cuentas);
                    if(indiceCuenta == -1)
                    {
                        System.out.println("La cuenta que digitó no existe.");
                    }else
                    {
                        System.out.println("El saldo de la cuenta con numero: " + numeroCuenta);
                        System.out.println(cliente.consultar_Saldo(indiceCuenta));
                        
                    }
                    break;
                case 2:
                    
                    System.out.println("Digite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarCuenta(numeroCuenta,cuentas);
                    if(indiceCuenta == -1)
                    {
                        System.out.println("La cuenta que digitó no existe.");
                    }else
                    {
                        System.out.print("Digite la cantidad de dinero que desea ingresar: ");
                        cantidad = entrada.nextFloat();
                        
                        cliente.ingresar_dinero(indiceCuenta, cantidad);
                        System.out.println("Transaccion Exitosa");
                        System.out.println("Saldo disponible: "+cliente.consultar_Saldo(indiceCuenta));
                      
                    }
                    
                    break;
                case 3:
                    
                    System.out.println("Digite el numero de la cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarCuenta(numeroCuenta, cuentas);
                    
                    if(indiceCuenta == -1)
                    {
                        System.out.println("El numero de cuenta que acaba de ingresar no existe ");
                    }else
                    {
                        System.out.print("Digite la cantidad que desea retirar: ");
                        cantidad = entrada.nextFloat();
                        cliente.retirar_dinero(indiceCuenta, cantidad);
                        System.out.println("Transaccion Exitosa");
                        System.out.println("Saldo disponible: "+cliente.consultar_Saldo(indiceCuenta));
                        
                    }
                    
                    
                    break;
                case 4:
                    System.out.println("\nADIOS");
                    break;
                default:
                    System.out.println("La opción que acaba de digitar no existe.");
                    
            }
            
            
        }while(opcion!=4);
        
    }
    
}
