
import java.util.ArrayList;
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
public class Main {
    
    static Scanner entrada = new Scanner(System.in);
    
    //creo un array list de Persona
    static ArrayList<Persona> equipo = new ArrayList<Persona>();
    
    
    //proceso de upcasting
    //convierte los objetos de las clases hijas en objetos de la superclase.
    static Persona futbolista1 = new Futbolista("Lionel","Messi",34,10,"ED");
    static Persona futbolista2 = new Futbolista("Sergio","Aguero",33,11,"DC");
    static Persona futbolista3 = new Futbolista("Lautaro","Martinez",22,9,"DC");
    static Persona futbolista4 = new Futbolista("Leandro","Paredes",25,5,"MDC");
    static Persona entrenador = new Entrenador("Lionel","Scaloni",45,"4-2-3-1 ofensivo");
    static Persona medico = new Doctor("Gonzalo","Bernachi",55,"Fisioterapeuta",30);
    
    
    public static void viajarEquipo()
    {
        for (Persona persona:equipo) {
            System.out.println(persona.toString());
            persona.viajar();
        }
                
    }
    
    public static void entrenamientoEquipo()
    {
        for (Persona persona:equipo) {
            System.out.println(persona.toString());
            persona.entrenamiento();
        }
        
    }
    
    public static void partidoFutbolEquipo()
    {
        for(Persona persona:equipo)
        {
            System.out.println(persona.toString());
            persona.partidoFutbol();
        }
    }
    
    public static void planificarPartido()
    {
        System.out.println(entrenador.toString());
        ((Entrenador)entrenador).planificarEntrenamiento();
    }
    
    public static void darEntrevista()
    {
        System.out.println(futbolista1.toString());
        ((Futbolista)futbolista1).entrevista();
    }
    
    public static void curarLesion()
    {
        System.out.println(medico.toString());
        ((Doctor)medico).curarLesion();
    }
    public static void menu()
    {
        
        
        int opcion;
        
        
        do{
            
            System.out.println("\nMenu de Opciones");
            System.out.println("1.Viaje de equipo");
            System.out.println("2.Entrenamiento");
            System.out.println("3.Partido de futbol");
            System.out.println("4.Planificar Entrenamiento");
            System.out.println("5.Entrevista");
            System.out.println("6.Curar lesion");
            System.out.println("7.Salir");
            System.out.println("Digite la opcion que desea realizar: ");
            opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1:
                    //viaje de equipo
                    viajarEquipo();
                    break;
                
                case 2:
                    //entrenamiento de equipo
                    entrenamientoEquipo();
                    break;
                    
                case 3:
                    //partido de futbol
                    partidoFutbolEquipo();
                    break;
                    
                case 4:
                    //Planificar entrenamiento
                    planificarPartido();
                    break;
                case 5:
                    //Entrevista
                    darEntrevista();
                    break;
                case 6:
                    //curar lesion
                    curarLesion();
                    break;
                case 7:
                    System.out.println("\nADIOS");
                    break;
                default:
                    System.out.println("Error, se equivoco de opcion de menu");
                    break;
            }   
        }while(opcion!=7);
    }
    public static void main(String[] args)
    {
        equipo.add(futbolista1);
        equipo.add(futbolista2);
        equipo.add(futbolista3);
        equipo.add(futbolista4);
        equipo.add(entrenador);
        equipo.add(medico);
        //menu
        
        menu();
        
        
    }
}
