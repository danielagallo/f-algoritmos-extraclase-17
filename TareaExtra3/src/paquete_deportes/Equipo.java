/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author Daniela
 */
public class Equipo {

    //Declaración de variables
    private String nombre;
    private String siglas;
    private int anio_fundacion;
    //Arreglo de Jugadores
    private Jugador[] jugadores;
    //Arreglo de Técnicos
    private Tecnico[] tecnicos;

    //Método Constructor
    public Equipo(String n, String s, int anio_f, Jugador[] jug, Tecnico[] tec) {

        nombre = n;
        siglas = s;
        anio_fundacion = anio_f;
        jugadores = jug;
        tecnicos = tec;
    }

    //Utilizamos los métodos establecer y obtener 
    public void establecer_judagores(Jugador[] jug) {
        jugadores = jug;

    }

    public Jugador[] obtener_jugadores() {
        return jugadores;
    }

    public void establecer_tecnicos(Tecnico[] tec) {
        tecnicos = tec;

    }

    public Tecnico[] obtener_tecnicos() {
        return tecnicos;
    }

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_siglas(String s) {
        siglas = s;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_anio_fundacion(int anio_f) {
        anio_fundacion = anio_f;
    }

    public int obtener_anio_fundacion() {
        return anio_fundacion;
    }

    ///Método promedio de edad de los técnicos
    public double obtener_promedio_edad_tecnicos() {
        double prom_edades = 0;
        Tecnico[] arreglotecnicos = obtener_tecnicos();
        for (int i = 0; i < arreglotecnicos.length; i++) {
            prom_edades += arreglotecnicos[i].obtener_edad();

        }

        return prom_edades / arreglotecnicos.length;
    }

    //Método promedio edad de los jugadores
    public double obtener_promedio_edad_jugadores() {
        double prom_edades_jug = 0;
        Jugador[] arreglosjugadores = obtener_jugadores();
        for (int i = 0; i < arreglosjugadores.length; i++) {
            prom_edades_jug += arreglosjugadores[i].obtener_edad();

        }

        return prom_edades_jug / arreglosjugadores.length;
    }

    public String convertir_array_jugadores() {
        String cadena_jug = "";
        Jugador[] arrayJugadores = obtener_jugadores();
        for (int i = 0; i < jugadores.length; i++) {
            cadena_jug += String.format("\t%s - %s - %d años\n",
                    arrayJugadores[i].obtener_nombre(),
                    arrayJugadores[i].obtener_posicion(),
                    arrayJugadores[i].obtener_edad());

        }

        return cadena_jug;
    }

    public String convertir_array_tecnicos() {
        String cadena_tec = "";
        Tecnico[] arrayTecnicos = obtener_tecnicos();
        for (int i = 0; i < tecnicos.length; i++) {
            cadena_tec += String.format("\t%s - %s - %d años\n",
                    arrayTecnicos[i].obtener_nombre(),
                    arrayTecnicos[i].obtener_funcion(),
                    arrayTecnicos[i].obtener_edad());

        }

        return cadena_tec;
    }

    //Para presentar los resultados por pantalla
    @Override
    public String toString() {
        String cadena = String.format("Equipo \"%s\"\n"
                + "Sus técnicos son: \n"
                + "%s"
                + "Sus jugadores son: \n"
                + "%s"
                + "Promedio de edad de:\n"
                + "\tTécnicos: %.2f años\n"
                + "\tJugadores: %.2f años", obtener_nombre(), convertir_array_tecnicos(), convertir_array_jugadores(), obtener_promedio_edad_tecnicos(), obtener_promedio_edad_jugadores()
        );
        return cadena;
    }

}
