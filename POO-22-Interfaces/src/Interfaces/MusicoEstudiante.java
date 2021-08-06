/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Pablo
 */
public class MusicoEstudiante implements Musico,Estudiante {

    @Override
    public void tocarMusica() {
        System.out.println("Estoy tocando la guitarra");
    }

    @Override
    public void hablar() {
        System.out.println("Estoy hablando español");
    }

    @Override
    public void estudiar() {
        System.out.println("Estoy estudiante teoría musical");
    }

    
    
}
