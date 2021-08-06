/*
Modificadores de acceso

 */
package Paquete1;

/**
 * 
 * @author Pablo
 * Modificador de acceso es esa palabrita especial antes de poner
 * el atributo. Nos servirá para saber cuál es la visibilidad.
 * solo puede ser accedado por las clases del mismo paquete.
 */
public class Clase1 {
    
    //public: modificador de acceso publico no restringe el acceso de otros paquetes.
    //private: solo se permite acceder a los atributos desde la propia clase.
    //Restringe para que solo puedan ser utilizados por métodos de la misma clase.
    private int edad;
    private String nombre;
    
    
    
    //Encapsulamiento y métodos accesores (Getters y Setters)

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
   
}
