/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;

import paquete_academico.Asignatura;
import paquete_academico.Universidad;

/**
 *
 * @author Daniela
 */
public class Estudiante {

    //Declaración de Variables
    private String nombre;
    private String apellido;
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Universidad universidad;

    public Estudiante(String nombre, String apellido, Asignatura asignatura1, Asignatura asignatura2, Universidad universidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.universidad = universidad;
    }

    //Utilizamos los métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    //Para presentar por pantalla
    @Override
    public String toString() {
        return "Datos del estudiate:"
                + "\nNombres: " + this.nombre
                + "\nApellidos: " + this.apellido
                + "\n" + this.universidad
                + "\nTiene las siguientes asignaturas:"
                + "\nAsignatura 1: " + asignatura1
                + "\nAsignatura 2: " + asignatura2;

    }
}
