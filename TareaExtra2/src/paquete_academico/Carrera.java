/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author Daniela
 */
public class Carrera {
    
    //Declaración de Variables
    private String nombre;
    private String modalidad;

    public Carrera(String nombre, String modalidad) {
        this.nombre = nombre;
        this.modalidad = modalidad;
    }
    
    //Utilizamos los métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    //Para presentar el nombre de la carrera y el tipo de modalidad
    public String toString(){
        return this.nombre + " modalidad ("+ this.modalidad +").";
    }
    
}
