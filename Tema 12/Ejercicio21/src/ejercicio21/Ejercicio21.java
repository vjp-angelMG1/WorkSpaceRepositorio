/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * • Ejercicio 21.- Realiza un programa en JAVA en el que le pidas al usuario
 * las notas de las 6 asignaturas del Ciclo de DAM y las guarde en un fichero.
 * Posteriormente leerá el fichero y te calculará la nota media del curso. •
 * Cada una de las asignaturas serán un objeto cuyos atributos serán el nombre y
 * la nota. • Con el constructor podrás asignar directamente el nombre de la
 * asignatura al crear el objeto. En cambio, el atributo nota, será el usuario
 * quien lo introduzca mediante un método que controle que la nota tenga un
 * valor numérico (no letras) entre 0 y 10. • Ejemplo de ejecución: 83 Por
 * favor, introduzca la nota de Programación: 6,5 Introduzca la nota de
 * Lenguajes de Marcas: 7,5 Introduzca la nota de Bases de Datos: 7,5 Introduzca
 * la nota de Entornos de Desarrollo: 8 Introduzca la nota de Sistemas
 * Informáticos: 6,5 Por último, introduzca la nota de Formación y Orientación
 * Laboral: 6 ** Notas almacenadas en el fichero *** …Leyendo el fichero y
 * calculando media…. Su nota media del curso es de: 7
 *
 * @author Angel
 */
public class Ejercicio21 {

    public final static String FICHERO = "notas.obj";

    public static String nombreNotas() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static float cantidadNotas() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }

    public static void guardarFichero() throws FileNotFoundException, ClassNotFoundException, IOException {
        String[] notas = new String[]{"Programacion", "LMSGI", "ED", "SSINF", "INGLES", "BBDD"};
        float notaMedia = 0;
        String nombres = nombreNotas();
        float notasAlumnos;
        try (
                FileOutputStream fos = new FileOutputStream(FICHERO); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            for (int i = 0; i < notas.length; i++) {
                notasAlumnos = cantidadNotas();
                
                oos.writeObject(new Asignaturas(nombres, cantidadNotas()));
                
                notaMedia = notaMedia + notasAlumnos;
//                notaMedia += notasAlumnos;
            }
        }
        notaMedia = notaMedia/6;
        System.out.println("La nota media es de");
    }

    public static void leerFichero() throws FileNotFoundException, ClassNotFoundException, IOException{
        try(
                FileInputStream fis = new FileInputStream(FICHERO);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ){
            Asignaturas asignaturas;
            
            while(true){
                asignaturas = (Asignaturas) ois.readObject();
                System.out.println(asignaturas);
                System.out.println("***********");
                
            }
        } catch(EOFException e){
            System.out.println("Fin de la lecturs");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc = -1;
        do{
            try{
                opc = entrada.nextInt();
                switch(opc){
                    case 1:
                        System.out.println("Guardando el fichero");
                        guardarFichero();
                        break;
                    case 2:
                        System.out.println("leeyendo el fichero");
                        leerFichero();
                        break;
                    case 3:
                        System.out.println("Saliendo del menu");
                        break;
                    default:
                        System.out.println("Error has elegido una opcion incorrecta");       
                }while(opc!=3);
            }catch(FileNotFoundException e)
            
        }
    }

}
