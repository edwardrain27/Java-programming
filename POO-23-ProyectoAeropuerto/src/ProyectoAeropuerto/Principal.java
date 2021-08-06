/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAeropuerto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Principal {

    static Scanner entrada = new Scanner(System.in);
    static final int numAeropuertos = 4;
    static Aeropuerto[] aeropuertos = new Aeropuerto[numAeropuertos];   
    static String[] empresas = {"Coca cola","Pepsi","Adidas","P&G"};
    //ArrayList<Compañia> compañias = new ArrayList<Compañia>();   
    static Compañia[] compañias = new Compañia[4];
    
    public static void insertarDatosAeropuerto()
    { 

         
        compañias[0] = new Compañia("LATAM");
        compañias[1] = new Compañia("AIR FRANCE");
        compañias[2] = new Compañia("ALITALIA");
        compañias[3] = new Compañia("KLM");
        
        aeropuertos[0] = new AeropuertoPrivado("EL DORADO","BOGOTA","COLOMBIA");
        aeropuertos[1] = new AeropuertoPublico(8000000,"JORGE CHAVEZ","LIMA","PERU");
        aeropuertos[2] = new AeropuertoPrivado("JORGE NEWBERRY","BUENOS AIRES","ARGENTINA",compañias,empresas);
        
        
        //AEROPUERTO PRIVADO DE ARGENTINA
        aeropuertos[2].getCompañia("AIR FRANCE").insertarVuelo(new Vuelo("5226","BUENOS AIRES","PARIS",7501400, 160));
        aeropuertos[2].getCompañia("AIR FRANCE").getVuelo("5226").insertarPasajero(new Pasajero("ALFREDO CHAUX","522KIH","ARGENTINA"));
        
        
        //AEROPUERTO PRIVADO DE BRASIL
        aeropuertos[3] = new AeropuertoPrivado("INTERNACIONAL DE GARULHOS","SAO PAULO","BRASIL");
        aeropuertos[3].insertarCompañia(new Compañia("Aero Brasil"));
        aeropuertos[3].insertarCompañia(new Compañia("LATAM"));
        System.out.println(aeropuertos[3].getCompañia("LATAM").getNombre());
        //esto funciona
        aeropuertos[3].getCompañia("LATAM").insertarVuelo(new Vuelo("12345","SAO PAULO","RIO DE JANEIRO",250000,160));
        //insertarPasajeros
        ((AeropuertoPrivado)aeropuertos[3]).insertarEmpresa("Heinecken");
        ((AeropuertoPrivado)aeropuertos[3]).insertarEmpresa("Guarana");
        
        
       
        aeropuertos[3].getCompañia("LATAM").getVuelo("12345").insertarPasajero(new Pasajero("RONALDINHO","45GBHY","BRASIL"));
        System.out.println(aeropuertos[3].getCompañia("LATAM").getVuelo("12345").getCiudadDestino());
        aeropuertos[3].getCompañia("LATAM").getVuelo("12345").insertarPasajero(new Pasajero("PILIPHE COUTINHO","45GB2S","BRASIL"));
        aeropuertos[3].getCompañia("LATAM").getVuelo("12345").insertarPasajero(new Pasajero("NEYMAR","587HG","BRASIL"));
        
        //AEROPUERTO PRIVADO EL DORADO
        aeropuertos[0].insertarCompañia(new Compañia("AVIANCA"));
        aeropuertos[0].getCompañia("AVIANCA").insertarVuelo(new Vuelo("5678","BOGOTA","PARIS",1250000,160));
        aeropuertos[0].getCompañia("AVIANCA").insertarVuelo(new Vuelo("2468","BOGOTA","BUENOS AIRES",125000,20));
        aeropuertos[0].getCompañia("AVIANCA").insertarVuelo(new Vuelo("3691","BOGOTA","MANCHESTER",4500000,160));
        aeropuertos[0].getCompañia("AVIANCA").getVuelo("5678").insertarPasajero(new Pasajero("JAMES RODRIGUEZ","123TGH","COLOMBIA"));
        aeropuertos[0].getCompañia("AVIANCA").getVuelo("2468").insertarPasajero(new Pasajero("LIONEL MESSI","456YHG","ARGENTINA"));
        aeropuertos[0].getCompañia("AVIANCA").getVuelo("3691").insertarPasajero(new Pasajero("Rahem Sterling","475KIG","BRITANICO"));
        ((AeropuertoPrivado)aeropuertos[0]).insertarEmpresa("Aguila");
        ((AeropuertoPrivado)aeropuertos[0]).insertarEmpresa("Pepsi");
        ((AeropuertoPrivado)aeropuertos[0]).insertarEmpresa("Postobon");
        ((AeropuertoPrivado)aeropuertos[0]).insertarEmpresa("Ecopetrol");
      
        
        //AEROPUERTO PUBLICO 
        
        aeropuertos[1].insertarCompañia(new Compañia("AIR CANADA"));
        aeropuertos[1].getCompañia("AIR CANADA").insertarVuelo(new Vuelo("1589","LIMA","TORONTO",522,100));
        aeropuertos[1].getCompañia("AIR CANADA").insertarVuelo(new Vuelo("1289","LIMA","WASHINGTON",526,120));
        aeropuertos[1].getCompañia("AIR CANADA").getVuelo("1289").insertarPasajero(new Pasajero("FERNANDO BERRIO","123KMN","PERU"));
        aeropuertos[1].getCompañia("AIR CANADA").getVuelo("1289").insertarPasajero(new Pasajero("PAOLOGO GUERRERO","124KMN","PERU"));
        aeropuertos[1].getCompañia("AIR CANADA").getVuelo("1289").insertarPasajero(new Pasajero("CARLOS CARRANZA","147OLK","PERU"));
        
    }
    
    public static void mostrarAeropuertos(Aeropuerto[] aeropuertos)
    {
        for (int i = 0; i < aeropuertos.length; i++) {
            if(aeropuertos[i] instanceof AeropuertoPublico)
            {
                System.out.println("\nAEROPUERTO PUBLICO");
                System.out.println("Nombre: AEROPUERTO "+aeropuertos[i].getNombre());
                System.out.println("Pais: "+aeropuertos[i].getPais());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                
            }
            
            if(aeropuertos[i] instanceof AeropuertoPrivado)
            {
                System.out.println("\nAEROPUERTO PRIVADO");
                System.out.println("Nombre: AEROPUERTO "+aeropuertos[i].getNombre());
                System.out.println("Pais: "+aeropuertos[i].getPais());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                
            }
        }
        
    }

    
    public static void consultarPatrocinio(Aeropuerto[] aeropuertos)
    {
        
        String[] empresas;
        int num_empresas;
        for (int i = 0; i < aeropuertos.length; i++) {
            
            if(aeropuertos[i] instanceof AeropuertoPrivado)
            {
                System.out.println("\nAEROPUERTO "+aeropuertos[i].getNombre());
                System.out.println("Empresas patrocinadoras: ");
                empresas = ((AeropuertoPrivado)aeropuertos[i]).getEmpresas();
                num_empresas = ((AeropuertoPrivado)aeropuertos[i]).getNumEmpresa();
                
                
                
                //downcasting en la jerarquía de clases.
                for (int j = 0; j < num_empresas ; j++) {
                    System.out.println((j+1)+"."+empresas[j]);
                }
                
            }else
            {
                System.out.println("\nAEROPUERTO " +aeropuertos[i].getNombre());
                System.out.println("Subvención: "+((AeropuertoPublico)aeropuertos[i]).getSubvencion());
            }
            
        }
        
    }
    
    //método para encontrar aeropuertos
    public static Aeropuerto buscarAeropuerto(Aeropuerto[] aeropuertos, String aeropuerto)
    {
        //busqueda secuencial del aeropuerto seleccionado 
        Aeropuerto aero = null;
        for (int i = 0; i < aeropuertos.length; i++) {
            if(aeropuerto.equals(aeropuertos[i].getNombre()))
            {
                aero = aeropuertos[i];
                break;
            }
        }
        return aero;
    }
    public static void mostrarCompañias(Aeropuerto aeropuerto)
    {
        System.out.println("COMPAÑIAS DEL AEROPUERTO "+aeropuerto.getNombre());
        Compañia[] compañias = aeropuerto.getCompañias();;
        for (int i = 0; i < aeropuerto.getNumCompañia(); i++) {
            System.out.println((i+1)+"."+compañias[i].getNombre());
            
        }
    }
    
    //método que lista los vuelos posibles de una compañia
    public static void mostrarVuelos(Compañia compañia)
    {
        for (int i = 0; i < compañia.getNumVuelo(); i++) {
            
            System.out.println("\n"+(i+1)+". Vuelo");
            System.out.println("Identificacion: "+compañia.getVuelo(i).getIdentificador());
            System.out.println("Ciudad origen: "+compañia.getVuelo(i).getCiudadOrigen());
            System.out.println("Ciudad destino: "+compañia.getVuelo(i).getCiudadDestino());
            System.out.println("Precio: "+compañia.getVuelo(i).getPrecio());
        }
    }
    
    
    
    
    public static void menu()
    {
        int opcion;
        String nombre_aeropuerto;
        String nombreCompañia;
        Aeropuerto aeropuerto;
        Compañia compañia;
        String origen;
        String destino;
        
        do
        {
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1. Ver aeropuertos gestionados(Publicos o privados) ");
            System.out.println("2. Consultar empresas patrocinadoras(Aeropuerto privado) o subvencion gubernamental(Aeropuerto publico)");
            System.out.println("3. Lista compañias de un aeropuerto ");
            System.out.println("4. Lista Vuelos de una compañia");
            System.out.println("5. Mostrar vuelos");
            System.out.println("6. Salir");
            System.out.print("Digite la opcion que desea realizar: ");
            opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1:
                   //Mostrar Aeropuertos
                    mostrarAeropuertos(aeropuertos);
                    break;
                case 2:
                    consultarPatrocinio(aeropuertos);
                    break;
                    
                case 3:
                    
                    System.out.println("Digite el nombre del aeropuerto: ");
                    entrada.nextLine();
                    nombre_aeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(aeropuertos,nombre_aeropuerto);
                    if(aeropuerto==null)
                    {
                        
                        System.out.println("\nNo se encontraron resultados del aeropuerto");
                    }
                    else
                    {
                        System.out.println("");
                        mostrarCompañias(aeropuerto);
                    }

                    break;
                    
                case 4:
                    entrada.nextLine();
                    System.out.println("\nDigite el nombre del aeropuerto: ");
                    nombre_aeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(aeropuertos,nombre_aeropuerto);
                    
                    if(aeropuerto == null)
                    {
                        System.out.println("No se encontraron resultados del aeropuerto "+nombre_aeropuerto);
                    }else
                    {
                        System.out.print("\nDigite el nombre de la compañia: ");
                        nombreCompañia = entrada.next();
                        //esta linea realiza una busqueda secuencial
                        compañia = aeropuerto.getCompañia(nombreCompañia);
                        if(compañia == null)
                        {
                            System.out.println("\nLa compañia "+nombreCompañia+" no existe");
                        }else
                        {
                            mostrarVuelos(compañia);
                        }
                    }
                    

                    
                    
                    break;
                case 5:
                    //mostrar todos los vuelos
                    
                    entrada.nextLine();
                    System.out.print("\nDigite la ciudad de origen: ");
                    origen = entrada.next();
                    System.out.print("\nDigite la ciudad de destino: ");
                    destino = entrada.next();
                    
                    
                    break;
                case 6:
                    System.out.println("\n¡ADIOS!");
                    break;
                default:
                    
                         
                
            }
            
        }while(opcion!=6);
    }
    
    public static void main(String[] args)
    {
        insertarDatosAeropuerto();
        menu();
        
    }
}
