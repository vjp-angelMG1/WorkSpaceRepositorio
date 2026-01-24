/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class Ejercicio16 {
    
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opcion = 0; //Declaro e inicializo variable 
        
        String[] alumnos = {"Pepe","Juan","Ana","Marta","Pedro","Maria"}; //valores de  la matriz con sus filas con los nombres de los alumnos y sus columnas con las asignaturas
        String[] asignaturas = {"Lengua","Mates","Historia","Fisica"};
        
        double[][] notas = new double[alumnos.length][asignaturas.length]; //creo la matriz
        
        //Menu de opciones para elegir opcion
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    notas = rellenarNotas(alumnos, asignaturas, notas);
                    break;
                case 2:
                    mostrarNotas(alumnos, asignaturas, notas);
                    break;
                case 3:
                    mejorMediaAlumno(notas, alumnos);
                    break;
                case 4:
                    alumnoMasSuspensos(notas, alumnos);
                    break;
                case 5:
                    asignaturaMasDificil(notas, asignaturas);
                    break;
                case 6:
                    System.err.println("Exit");
                    break;
                default:
                    System.err.println("Opcion no disponible.");;
            }
        } while (opcion != 6);
    }
       public static void mostrarMenu(){ //metodo para mostrar menu
        System.out.println("MENU");
        System.out.println("1-Rellenar notas.");
        System.out.println("2-Mostrar notas.");
        System.out.println("3-Mejor alumno.");
        System.out.println("4-Alumno con mas suspensos.");
        System.out.println("5-Asignatura mas dificil.");
        System.out.println("6-Salir.");
    }
    
    public static double [][] rellenarNotas(String[] alumnos, String[] asignaturas, double[][] notas){ //metodo para rellenar notas en el que parametrizo los valores de la matriz y la misma matriz
        Scanner entrada = new Scanner(System.in);
        
        double nota = 0;
        
        //Recorremos cada posicion de la combinacion de los arrays alumnos[i] y asignaturas[j]
        for(int i = 0; i < alumnos.length; i++){
            System.out.println("Introduce las notas de " + alumnos[i] + ":"); //Posicion del alumno
            for(int j = 0; j < asignaturas.length; j++){
                do{
                    System.out.println(asignaturas[j] + ":");
                    nota = entrada.nextDouble();    //Introducimos la nota de cada asignatura del alumno[i]
                    if(nota < 0 || nota > 10){
                        System.out.println("Nota invalida.");  //Controlamos el rango de la nota 0-10
                    }
                }while(nota<0 || nota>10);
                notas[i][j]= nota; //Introducimos las notas de cada asignatura de un alumno en el array notas[][]
            }
        }
        return notas;
    }
    
    public static void mostrarNotas(String[] alumnos, String[] asignaturas, double [][] notas){ //metodo para mostrar las notas de cada alumno
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){              
                    System.out.print(" [" + alumnos[i] + " - " + asignaturas[j] + "]-->" + notas[i][j] + "");
            }
            System.out.println("\n");
        }
    }
    
    public static void mejorMediaAlumno(double [][] notas, String[] alumnos){
        double mejorMedia = -1, media = 0;
        String mejorAlumno = alumnos[0];
        
        //Recorremos el array alumnos
        for (int i = 0; i < alumnos.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) { //Recorremos el array notas[][] y sumamos las notas del alumno[i]
                suma += notas[i][j];            
            }
            
            media = suma / notas[i].length; //Obtenemos la media
            
            if (media > mejorMedia) {   //Comparamos para obtener la mejor media
                mejorMedia = media;
                mejorAlumno = alumnos[i];
            }
        }

        System.out.println("El mejor alumno es " + mejorAlumno + " con la media de " + mejorMedia);
    }
    
    public static void alumnoMasSuspensos(double[][] notas, String[] alumnos) {
        int maxSuspensos = -1;
        String alumnoMax = alumnos[0];
        
        //Recorremos el array alumnos
        for (int i = 0; i < alumnos.length; i++) {
            int suspensos = 0;
            for (int j = 0; j < notas[i].length; j++) { //Recorremos el array notas[][] del alumno[i]
                if (notas[i][j] < 5) {  //Si la nota es menos que 5
                    suspensos++;    //+1 al contador de suspensos
                }
            }
            if (suspensos > maxSuspensos) { //Comparamos para obetener el mayor numero de suspensos
                maxSuspensos = suspensos;
                alumnoMax = alumnos[i];
            }
        }

        System.out.println("El alumno con mas suspensos es " + alumnoMax + " con " + maxSuspensos + " suspensos.");
    }
    
    public static void asignaturaMasDificil(double[][] notas, String[] asignaturas) { //metodo para ver cual es la asignatura mas dificil
        double mediaMin = 10, media = 0;
        String asignaturaDificil = asignaturas[0];
        
        //Recorremos el array asignaturas
        for (int j = 0; j < asignaturas.length; j++) {
            double suma = 0;
            for (int i = 0; i < notas[j].length; i++) { //Recorremos el array notas[][] de cada asignatura[i]
                suma += notas[i][j]; //Sumamos las notas de la asignatura
            }
            
            media = suma / notas[j].length; //Calculamos la media
            
            if (media < mediaMin) { //Comparamos para obtener la menor media
                mediaMin = media;
                asignaturaDificil = asignaturas[j];
            }
        }
        System.out.println("La asignatura mas dificil es " + asignaturaDificil + " con una media de " + mediaMin);
    }
    
}
