/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrenamientodeportivointeligente;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class EntrenamientoDeportivoInteligente {

    public static int METROS = 100;

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        int series;
        series = 0;
        int tiempoEnSegundos;
        tiempoEnSegundos = 0;
        int contador;
        contador = 0;
        int totalEnRealizarlo;
        int suma;
        suma = 0;
        int tiempoMedioSerie;
        
        System.out.println("Bienvenido al Reloj Deportivo");
        System.out.println("Introduce un numero segun la funcion que quieras introducir");
        System.out.println("1-Series de Velocidad");
        System.out.println("2-Entrenamiento de resistencia");
        System.out.println("3-Calculadora de IMC");
        System.out.println("4-Salir");

        do {
            numero = entrada.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("Series de Velocidad");
                    System.out.println("¿Cuantas series de " + METROS + " vas a realizar?");
                    series = entrada.nextInt();
                    for (int i = 1; i < series; i++) {
                        System.out.println("Cuantos segundos por la serie " + (i));
                        tiempoEnSegundos = entrada.nextInt();
                        suma += tiempoEnSegundos;
                    }
                        System.out.println("Tiempo total invertido en el entrenamiento"+suma);
                        
                        tiempoMedioSerie = suma/series;
                        System.out.println("numero total de series"+tiempoMedioSerie);
                    break;
                case 2:
                    System.out.println("Entrenamiento de resistencia");
                    break;
                case 3:
                    System.out.println("Calculadora de IMC");
                    break;
                case 4:
                    System.out.println("Salir");
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Error numero erroneo");
            }
        } while (numero != 4);

    }
}
