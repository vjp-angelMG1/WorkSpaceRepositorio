/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    //Metodo main llama a los objetos y metodos para proceder.
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];
        String[] nombresAlumnos = {"Pepe", "Juan", "Marta"};
        genAlumn(alumnos, nombresAlumnos);
        menu(alumnos);
    }

    //Rellenamos los nombres en el array.
    public static void genAlumn(Alumno[] alumnos, String[] nombresAlumnos) {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
            alumnos[i].setNombreAlumno(nombresAlumnos[i]);

        }

    }

    //Metodo menu que llama a otros metodos.
    public static void menu(Alumno[] alumnos) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n ---- Menu de opciones ----");
            System.out.println("1. Rellenar las notas de los alumnos.");
            System.out.println("2. Mostrar notas introducidas. ");
            System.out.println("3. Mejor alumno de la clase. ");
            System.out.println("4. Alumno con mas suspensos. ");
            System.out.println("5. Asignatura mas dificil. ");
            System.out.println("6. Salir del programa. ");
            System.out.println("\n");
            System.out.print("INTRODUCE UNA OPCION: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n OPCION 1");
                    rellenarNotas(alumnos);
                    break;
                case 2:
                    System.out.println("\n OPCION 2");
                    mostrarNotas(alumnos);
                    break;
                case 3:
                    System.out.println("\n OPCION 3");
                    mejorAlumno(alumnos);
                    break;
                case 4:
                    System.out.println("\n OPCION 4");
                    break;
                case 5:
                    System.out.println("\n OPCION 5");
                    asignaturaMasDificil(alumnos);
                    break;
                case 6:
                    System.out.println("Gracias por usar el programa... HASTA LUEGO!");

                    break;
                default:
                    System.out.println("POR FAVOR USE UNA OPCION CORRECTA!!!!!");
            }

        } while (opcion != 6);

    }

    //Rellenamos las notas de las asignaturas en cada alumno
    public static void rellenarNotas(Alumno[] alumnos) {
        Scanner sc = new Scanner(System.in);
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        for (Alumno al : alumnos) {
            System.out.println("\n Alumno: " + al.getNombreAlumno());
            Asignatura[] notas = new Asignatura[4];

            for (int i = 0; i < asignaturas.length; i++) {
                System.out.print("Nota de " + asignaturas[i] + ": ");
                float nota = sc.nextFloat();

                notas[i] = new Asignatura(asignaturas[i], nota);
            }
            al.setNotas(notas);

        }
    }

    //Mostramos lo que hemos rellenado en el metodo anterior.
    public static void mostrarNotas(Alumno[] alumnos) {
        for (Alumno al : alumnos) {
            System.out.println("\n Alumno:  " + al.getNombreAlumno());
            for (Asignatura a : al.getNotas()) {
                System.out.println(a.getNombreAsignatura() + ": " + a.getNota());
            }

        }

    }

    //Hacemos la media de los alumnos y comprobamos quien es el alumno cuya media sea mas alta.
    public static void mejorAlumno(Alumno[] alumnos) {
        Alumno mejor = alumnos[0];
        float mejorMedia = 0;
        for (Alumno al : alumnos) {
            float suma = 0;
            for (Asignatura a : al.getNotas()) {
                suma = suma + a.getNota();

            }
            float media = suma / al.getNotas().length;

            if (media > mejorMedia) {
                mejorMedia = media;
                mejor = al;
            }
        }
        System.out.println("El mejor alumno " + mejor.getNombreAlumno() + ", con media: " + mejorMedia);
    }

    //Metodo similar al anterior que comprueba cual es el alumno que tiene mas notas suspensas.
    public static void alumnoSuspenso(Alumno[] alumnos) {
        Alumno peor = alumnos[0];
        float maxSuspensos = 0;

        for (Alumno al : alumnos) {
            int suspensos = 0;
            for (Asignatura a : al.getNotas()) {
                if (a.getNota() < 5) {
                    suspensos++;
                }
            }
            if (suspensos > maxSuspensos) {
                maxSuspensos = suspensos;
                peor = al;
            }
        }
        System.out.println("El alumno mas suspenso fue: " + peor.getNombreAlumno() + " con " + maxSuspensos + " Suspensas.");
    }
    //Metodo que observa cual es la asignatura que los alumnos tiene suspensa y vemos cual es la mas suspendida.

    public static void asignaturaMasDificil(Alumno[] alumnos) {
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        float peorMedia = 10;
        String peorAsignatura = "";

        for (int i = 0; i < asignaturas.length; i++) {
            float suma = 0;
            for (Alumno al : alumnos) {
                suma = suma + al.getNotas()[i].getNota();
            }

            float media = suma / alumnos.length;

            if (media < peorMedia) {
                peorMedia = media;
                peorAsignatura = asignaturas[i];
            }
        }

        System.out.println("Asignatura mas dificil: " + peorAsignatura + "(media: " + peorMedia + ")");
    }
}
