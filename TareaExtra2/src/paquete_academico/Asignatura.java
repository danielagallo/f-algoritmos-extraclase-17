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
public class Asignatura {
    
    //Declaración de Variables
    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;

    public Asignatura(String nombre, int creditos, Carrera carrera, Docente docente) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.carrera = carrera;
        this.docente = docente;
    }

    //Utilizamos los métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    
    //Para presentar el nombre de la asignatura, los créditos, la carrera, y el tipo de Docente
    @Override
    public String toString(){
        return this.nombre + " (" +this.creditos+" créditos) de la carrera " + this.carrera + this.docente;
    }
    
}
