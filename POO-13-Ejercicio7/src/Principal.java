
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Principal {
    
    static Scanner entrada = new Scanner(System.in);
    public static int buscarNumeroCuenta(int numero, Cuenta[] cuentas)
    {
        int posicion = -1;
        //busqueda secuencial.
        for (int i = 0; i < cuentas.length; i++) {
            
            if(cuentas[i].getNumeroCuenta() == numero)
            {
                posicion = i;
                break;
            }
            
        }
        
        return posicion;
    }
    
    public static void menu()
    {
        System.out.println("._______________________________");
        System.out.println("\n|--------MENU DE OPCIONES-------|");
        System.out.println("|1.Consultar saldo--------------|");
        System.out.println("|2.Ingresar dinero--------------|");
        System.out.println("|3.Retirar dinero---------------|");
        System.out.println("|4.salir------------------------|");
        System.out.println("|_______________________________|");
        System.out.println("Digite la opción que desea realizar: ");
    }
    
    
    public static void main(String[] args)
    {
        int numeroCuenta,posicion,n,opcion,pos;
        double saldo;
        Cuenta[] cuentas;
        String nombre,apellido,dni;
        
        Cliente cliente;
        
        System.out.println("\nCREACIÓN DE CLIENTE");
        System.out.print("Digite sus nombres: ");
        nombre = entrada.next();
        System.out.print("Digite sus apellido:");
        apellido = entrada.next();
        System.out.print("Digite su documento de identidad: ");
        dni = entrada.next();
        
        System.out.print("Digite el numero de cuentas: ");
        n = entrada.nextInt();
        cuentas = new Cuenta[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("\n"+(i+1)+".Cuenta");
            System.out.print("\nDigite el numero de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo = entrada.nextFloat();
            cuentas[i] = new Cuenta(numeroCuenta,saldo);
            
        }
        
        cliente = new Cliente(nombre,apellido,dni,cuentas);
        
        
        
        do {
            
            menu();
            opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("\f");
                    System.out.println("\nConsultar Saldo");
                    System.out.println("Digite el numero de cuenta que desea consultar: ");
                    
                    numeroCuenta = entrada.nextInt();
                    pos = buscarNumeroCuenta(numeroCuenta, cuentas);
                    if(pos!=-1)
                    {
                        System.out.println("Saldo disponible: "+cliente.consultarSaldo(pos));
                        System.out.println("");
                    }else
                    {
                        System.out.println("El numero de cuenta ingresado no coincide con ningún registro");
                        System.out.println("");
                    }
                    
                    
                    break;
                case 2:
                   
                    System.out.println("\f");
                    System.out.println("\nIngresar dinero");
                    System.out.print("Digite el numero de la cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    pos = buscarNumeroCuenta(numeroCuenta,cuentas);
                    if(pos!=-1)
                    {
                        System.out.println("\nDigite la cantidad de dinero que desea ingresar: ");
                        double cantidad = entrada.nextDouble();
                        cliente.ingresarDinero(pos, cantidad);
                        System.out.println("\nSALDO TOTAL: "+cliente.consultarSaldo(pos));
                        System.out.println("");
                    }else
                    {
                        System.out.println("El numero de cuenta ingresado no coincide con ningún registro a su nombre");
                    }
                    break;
                case 3:
                    System.out.println("\f");
                    System.out.println("\nRetirar dinero");
                    System.out.print("Digite el numero de la cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    pos = buscarNumeroCuenta(numeroCuenta,cuentas);
                    if(pos!=-1)
                    {
                        double cantidad;
                        boolean band = false;
                        do
                        {
                            if(band)
                            {
                                System.out.println("\nSaldo insuficiente");
                                System.out.println("Saldo total: "+cuentas[pos].getSaldo());
                            }
                            System.out.println("\nDigite la cantidad de dinero que desea retirar: ");
                            cantidad = entrada.nextDouble();
                            if(cantidad > cuentas[pos].getSaldo())
                            {
                                band = true;
                            }else
                            {
                                band = false;
                            }
                            
                            
                        }while(cantidad > cuentas[pos].getSaldo());
                        cuentas[pos].retirarDinero(cantidad);
                        System.out.println("\nSALDO TOTAL: "+cliente.consultarSaldo(pos));
                        System.out.println("");
                    }else
                    {
                        System.out.println("La cuenta ingresada no existe");
                        System.out.println("\n");
                    }
                    
                    break;
                case 4:
                    System.out.println("ADIOS");
                    break;
                default:
                    System.out.println("Por favor, digite una opción correcta");
            }
            System.out.println("");
            
        } while (opcion!=4);
        
        
        
        
        
        
        
    }
    
}
