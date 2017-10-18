/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1;

public class Docente {
    
    //Declaración de Variables
    private String nombre;
    private String apellidos;
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    private String asignatura_1;
    private String asignatura_2;
    //Declaración del método get
    public String getNombre() {
        return nombre;
    }

    //Declaración del método set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTitulo_tercer_nivel() {
        return titulo_tercer_nivel;
    }

    public void setTitulo_tercer_nivel(String titulo_tercer_nivel) {
        this.titulo_tercer_nivel = titulo_tercer_nivel;
    }

    public String getTitulo_cuarto_nivel() {
        return titulo_cuarto_nivel;
    }

    public void setTitulo_cuarto_nivel(String titulo_cuarto_nivel) {
        this.titulo_cuarto_nivel = titulo_cuarto_nivel;
    }

    public String getAsignatura_1() {
        return asignatura_1;
    }

    public void setAsignatura_1(String asignatura_1) {
        this.asignatura_1 = asignatura_1;
    }

    public String getAsignatura_2() {
        return asignatura_2;
    }

    public void setAsignatura_2(String asignatura_2) {
        this.asignatura_2 = asignatura_2;
    }
}
