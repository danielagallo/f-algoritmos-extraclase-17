/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1;

public class Asignatura {
    
    //Decalaración de Variables
    private String nombre;
    private int creditos;

    //Declaración del método get
    public String getNombre() {
        return nombre;
    }
    
    //Declaración del método set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }   
}
