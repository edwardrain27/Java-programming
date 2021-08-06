/*
Realiza un programa que defina dos vectores de caracteres y después 
almacene el contenido de ambos vectores en un nuevo vector, situando en primer lugar 
los elementos del primer vector seguido por los elementos del segundo vector. Muestre 
el contenido del nuevo vector en la salida estándar.
 */
package pkg28.ejercicio;


public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char []vector1 = {'a','b','c','d','e'};
        char []vector2 = {'f','g','h','i','j'};
        int n = vector1.length+vector2.length+1;
        System.out.println("longitud del vector :"+n);
        char []vector3 = new char[vector1.length+vector2.length];
        
        
        for (int i = 0; i < vector1.length; i++) {
       
            vector3[i] = vector1[i];
        }
        
        for (int j = 0; j < vector2.length; j++) {
            vector3[vector1.length+j] = vector2[j];
        }
        
        for (char i:vector3) {
            System.out.println(i);
            
        }
        
    }
    
}
