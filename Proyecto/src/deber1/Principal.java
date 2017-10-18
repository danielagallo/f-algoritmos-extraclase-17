/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1;

/**
 *
 * @author Daniela
 */
public class Principal {

    public static void main(String[] args) {
        //Datos del Docente 1
        Docente docente1 = new Docente();
        docente1.setNombre("Luis V.");
        docente1.getNombre();
        docente1.setApellidos("Perez J.");
        docente1.getApellidos();

        //Datos de Asignaturas
        Asignatura asignatura1 = new Asignatura();
        asignatura1.setNombre("Matemáticas");
        asignatura1.getNombre();
        asignatura1.setCreditos(8);
        asignatura1.getCreditos();

        Asignatura asignatura2 = new Asignatura();
        asignatura2.setNombre("Física");
        asignatura2.getNombre();
        asignatura2.setCreditos(6);
        asignatura2.getCreditos();

        //Datos de Títulos
        Titulo titulo1 = new Titulo();
        titulo1.setNombre_universidad("Universidad Politécnica");
        titulo1.getNombre_universidad();
        titulo1.getNombre();
        titulo1.setNombre("Licenciado Físico Matemáticas");

        Titulo titulo2 = new Titulo();
        titulo2.setNombre("Magister en Docencia Matemática");
        titulo2.getNombre();
        titulo2.setNombre_universidad("Universidad Valenciana");
        titulo2.getNombre_universidad();

        //Datos a presentar
        System.out.println("Caso 1 \n");
        System.out.println("Datos del Docente: ");
        System.out.println("Nombres: " + docente1.getNombre());
        System.out.println("Apellidos: " + docente1.getApellidos());
        System.out.println("Tiene a su cargo las Asignaturas: ");
        System.out.println("Asignatura 1: " + asignatura1.getNombre() + " con número de Créditos " + asignatura1.getCreditos());
        System.out.println("Asignatura 2: " + asignatura2.getNombre() + " con número de Créditos " + asignatura2.getCreditos());
        System.out.println("El docente tiene los siguientes títulos académicos: ");
        System.out.println("Título 3er Nivel: " + titulo1.getNombre() + "-" + titulo1.getNombre_universidad());
        System.out.println("Título 4to Nivel: " + titulo2.getNombre() + "-" + titulo2.getNombre_universidad());

        System.out.println("\n");

        //Datos del Docente 2
        Docente docente2 = new Docente();
        docente1.setNombre("Ana M.");
        docente1.getNombre();
        docente1.setApellidos("Velez P.");
        docente1.getApellidos();

        //Datos de Asignaturas
        Asignatura asignaturam1 = new Asignatura();
        asignatura1.setNombre("Sociales");
        asignatura1.getNombre();
        asignatura1.setCreditos(9);
        asignatura1.getCreditos();

        Asignatura asignaturam2 = new Asignatura();
        asignatura2.setNombre("Literatura");
        asignatura2.getNombre();
        asignatura2.setCreditos(10);
        asignatura2.getCreditos();

        //Datos de Títulos
        Titulo titulom1 = new Titulo();
        titulo1.setNombre_universidad("Universidad Salesiana");
        titulo1.getNombre_universidad();
        titulo1.getNombre();
        titulo1.setNombre("Licenciado En Ciencias Sociales");

        Titulo titulom2 = new Titulo();
        titulo2.setNombre("Magister en Docencia Social");
        titulo2.getNombre();
        titulo2.setNombre_universidad("Universidad Cataluña");
        titulo2.getNombre_universidad();

        //Datos a presentar
        System.out.println("Caso 2 \n");
        System.out.println("Datos del Docente: ");
        System.out.println("Nombres: " + docente1.getNombre());
        System.out.println("Apellidos: " + docente1.getApellidos());
        System.out.println("Tiene a su cargo las Asignaturas: ");
        System.out.println("Asignatura 1: " + asignatura1.getNombre() + " con número de Créditos " + asignatura1.getCreditos());
        System.out.println("Asignatura 2: " + asignatura2.getNombre() + " con número de Créditos " + asignatura2.getCreditos());
        System.out.println("El docente tiene los siguientes títulos académicos: ");
        System.out.println("Título 3er Nivel: " + titulo1.getNombre() + "-" + titulo1.getNombre_universidad());
        System.out.println("Título 4to Nivel: " + titulo2.getNombre() + "-" + titulo2.getNombre_universidad());
    }
}
