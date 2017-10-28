/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

//Importación de paquetes
import paquete_deportes.Equipo;
import paquete_deportes.Jugador;
import paquete_deportes.Tecnico;

/**
 *
 * @author Daniela
 */
public class Principal {

    public static void main(String[] args) {

        //Declaración de Variables Jugadores
        Jugador jug1 = new Jugador("Manuel Alvarez", "Arquero", 20);
        Jugador jug2 = new Jugador("Eduardo Valencia", "Defensa", 21);
        Jugador jug3 = new Jugador("Fabian Cevallos", "Defensa", 30);
        Jugador jug4 = new Jugador("Antonio Lara", "Centrocampista", 32);
        Jugador jug5 = new Jugador("Luis Delgado", "Centrocampista", 17);
        Jugador jug6 = new Jugador("Xavier Lopez", "Delantro", 25);

        //6 Objetos tipo Jugador
        Jugador[] jugadores = new Jugador[6];
        jugadores[0] = jug1;
        jugadores[1] = jug2;
        jugadores[2] = jug3;
        jugadores[3] = jug4;
        jugadores[4] = jug5;
        jugadores[5] = jug6;

        //Declaración de Variables Técnicos
        Tecnico tec1 = new Tecnico("Luis Gomez", "Técnico principal", 45);
        Tecnico tec2 = new Tecnico("Julio Neto", "Asistente Técnico", 46);
        Tecnico tec3 = new Tecnico("Marco Silva", "Preparador Físico", 47);

        //3 Objetos tipo Técnico
        Tecnico[] tecnicos = new Tecnico[3];
        tecnicos[0] = tec1;
        tecnicos[1] = tec2;
        tecnicos[2] = tec3;

        Equipo e = new Equipo("Boca Juniors", "B", 1940, jugadores, tecnicos);
        System.out.println(e);

    }

}
