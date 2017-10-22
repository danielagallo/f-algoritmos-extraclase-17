/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_general;

/**
 *
 * @author Daniela
 */
public class Pais {

    //Declaración de Variables
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    //Utilizamos los métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Para presentar los nombres del País
    @Override
    public String toString() {
        return this.nombre;
    }
}
