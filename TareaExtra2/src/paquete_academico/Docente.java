/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

import paquete_general.Pais;

/**
 *
 * @author Daniela
 */
public class Docente {
    
    //Declaración de Variables
    private String nombres;
    private String apellidos;
    private Pais pais;

    public Docente(String nombres, String apellidos, Pais pais) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.pais = pais;
    }
    
    //Utilizamos los métodos get y set
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    //Para presentar el nombre, el apellido y el País del Docente
    @Override
    public String toString(){
        return "Docente: " +  this.nombres + " "+this.apellidos + " - " + this.pais;
    }
}
