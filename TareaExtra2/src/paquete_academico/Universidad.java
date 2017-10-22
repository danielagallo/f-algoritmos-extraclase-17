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
public class Universidad {

    //Declaración de Variables
    private String nombre;
    private String siglas;
    private Pais pais;

    public Universidad(String nombre, String siglas, Pais pais) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.pais = pais;
    }

    //Utilizamos los métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    //Para presentar el nombre de la Universidad, las siglas y el tipo de País
    @Override
    public String toString() {
        return "Universidad: " + this.nombre + "(" + this.siglas + ") - " + this.pais;
    }
}
