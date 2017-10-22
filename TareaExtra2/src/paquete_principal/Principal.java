/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

//Importación de paquetes
import paquete_academico.Asignatura;
import paquete_academico.Carrera;
import paquete_academico.Docente;
import paquete_academico.Universidad;
import paquete_estudiante.Estudiante;
import paquete_general.Pais;

/**
 *
 * @author Daniela
 */
public class Principal {

    public static void main(String[] args) {
        //Declaracion de objetos
        Pais paisObj1;
        Pais paisObj2;
        Pais paisObj3;
        Pais paisObj4;

        Docente docenteObj1;
        Docente docenteObj2;
        Docente docenteObj3;

        Universidad universidadObj1;
        Universidad universidadObj2;

        Carrera carreraObj1;
        Carrera carreraObj2;

        Asignatura asignaturaObj1;
        Asignatura asignaturaObj2;
        Asignatura asignaturaObj3;
        Asignatura asignaturaObj4;

        Estudiante estudianteObj1;
        Estudiante estudianteObj2;

        // Creacion de objetos
        paisObj1 = new Pais("Perú");
        paisObj2 = new Pais("Colombia");
        paisObj3 = new Pais("Venezuela");
        paisObj4 = new Pais("Ecuador");

        carreraObj1 = new Carrera("Sistemas", "presencial");
        carreraObj2 = new Carrera("Ingeniería Química", "presencial");

        docenteObj1 = new Docente("Mario", "Alcivar", paisObj2);
        docenteObj2 = new Docente("Maria", "Ruiz", paisObj1);
        docenteObj3 = new Docente("Luis", "Armijos ", paisObj3);

        universidadObj1 = new Universidad("Universidad Técnica Particular de Loja", "UTPL", paisObj4);
        universidadObj2 = new Universidad("Universidad Técnica Equinoccial", "UTE", paisObj4);

        asignaturaObj1 = new Asignatura("Matemáticas", 10, carreraObj1, docenteObj1);
        asignaturaObj2 = new Asignatura("Física", 8, carreraObj1, docenteObj2);
        asignaturaObj3 = new Asignatura("Biología", 9, carreraObj2, docenteObj3);
        asignaturaObj4 = new Asignatura("Física", 7, carreraObj2, docenteObj2);

        estudianteObj1 = new Estudiante("Luis V.", "Perez J.", asignaturaObj1, asignaturaObj2, universidadObj1);
        estudianteObj2 = new Estudiante("Ana.", "Lima J.", asignaturaObj3, asignaturaObj4, universidadObj1);

        //Imprimir Objetos
        System.out.println("Caso 1:\n" + estudianteObj1);
        System.out.println("\nCaso 2:\n" + estudianteObj1);
    }
}
