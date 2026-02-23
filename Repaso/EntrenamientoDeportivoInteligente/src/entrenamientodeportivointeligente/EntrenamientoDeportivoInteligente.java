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

    public static int METROS = 100; //Creo constante del dato en metros

    public static void main(String[] args) { //Creo método principal main
        
        Scanner entrada = new Scanner(System.in); //Creo objeto Scanner para introducir los datos que me pida el usuario
        int numero; //creo variables
        int series;
        int tiempoEnSegundos;
        int suma;
        suma = 0; //inicializo variable
        int tiempoMedioSerie;
        double peso; //Creo variables
        double altura;
        double IMC;

        do { //Creo bucle do while el cual se utiliza para menús
                   

            System.out.println("Bienvenido al Reloj Deportivo"); //Imprimo el menú por pantalla
            System.out.println("Introduce un numero segun la funcion que quieras introducir");
            System.out.println("1-Series de Velocidad");
            System.out.println("2-Entrenamiento de resistencia");
            System.out.println("3-Calculadora de IMC");
            System.out.println("4-Salir");
            numero = entrada.nextInt(); //guardo en la variable el valor que pido al usuario
            switch (numero) { //hago un condicional switch para elegir los casos del menú y parametrizo el numero que le pido al usuario para que me elija el caso
                case 1: //primer caso en caso de elegir uno por pantalla 
                    System.out.println("Series de Velocidad"); //imprimo por pantalla las ordenes
                    System.out.println("¿Cuantas series de " + METROS + " vas a realizar?");
                    series = entrada.nextInt(); //guardo en la variable el valor que elige el usuario
                    for (int i = 1; i < series; i++) { //creo un bucle for para que se repita el numero de series que el usuario pide 
                        System.out.println("Cuantos segundos por la serie " + (i)); //imprimo por pantalla la cantidad de series que realizo //tambien podria inicializar en 0 la i y añadir en esta linea i+1 en vez de i
                        tiempoEnSegundos = entrada.nextInt(); //guardo en la variable los segundos  que me piden del tiempo de cada serie
                        suma += tiempoEnSegundos; //guardo en la variable y sumo el tiempo de todas las series en segundos
                    }
                    System.out.println("Tiempo total invertido en el entrenamiento" + suma); //Imprimo por pantalla el total de la suma de todas las series

                    tiempoMedioSerie = suma / series; //calculo y guardo en la variable el tiempo medio de la serie con la suma del tiempo de todas las series dividas entre el número de series
                    System.out.println("numero total de series" + tiempoMedioSerie); //Imprimo por pantalla el tiempo medio de la serie
                    break; //se utiliza para no saltar a otros caso cuando se cumple la condicion del anterior 
                case 2: //segundo caso
                    System.out.println("Entrenamiento de resistencia"); //Imprimo por pantalla lo que le pido al usuario
                    System.out.println("Introduce tus pulsaciones");
                    int pulsaciones; //creo variable
                    do{
                        pulsaciones = entrada.nextInt(); //recojo valor del usuario
                        if(pulsaciones>=170){ //condicional se cumple si las pulsaciones son menor o igual que 170
                            System.out.println("¡Límite alcanzado! Fin del entrenamiento"); //imprimo por pantalla el mensaje
                        }
                        else{ //condicional si no se cumple el if 
                            System.out.println("Las pulsaciones son : "+pulsaciones+" Sigue corriendo.."); //Imprimo por pantalla 
                            System.out.println("Introduce nuevamente tus pulsaciones");
                        }
                    }while(pulsaciones< 170); //mientras que las pulsaciones sean menor que 170 el bucle seguira repitiendose
                        System.out.println("Limite alcanzado al Fin de entrenamiento");
                    break;
                case 3: //caso 3
                    System.out.println("Calculadora de IMC"); //Imprimo por pantalla 

                    System.out.println("Cuantos pesas?"); //Imprimo por pantalla 
                    peso = entrada.nextDouble(); //guardo en la variable valor que le pido al usuario  
                    System.out.println("Cuanto mides?"); //Imprimo por pantalla
                    altura = entrada.nextDouble(); //guardo en la variable el valor que le pido al usuario
                    IMC = peso/(altura*altura); //guardo en la variable el calculo
                    System.out.println("Indice de Masa Corporal"+IMC); //Imprimo por pantalla el valor actual del IMC
                    if(IMC<18.5){ //Condicional si el IMC es menor que 18.5
                        System.out.println("Categoria:Bajo peso"); //imprimo por pantalla la categoria
                    }
                    else if(IMC<25){ //Condicional si se cumple esta condicion
                        System.out.println("Categoria:Peso normal"); //imprimo por pantalla la categoria
                    }
                    else if(IMC<30) { //Condicional si se cumple 
                        System.out.println("Categoria:Sobre peso"); //imprimo categoria
                    }
                    else{ //condicional si no se cumple ninguna anterior
                        System.out.println("Categoria:Obesidad"); //imprimo categoria que pertenece
                    }
                    break;
                case 4: //caso 4
                    System.out.println("Saliendo..."); //imprimo por pantalla la salida del menu 
                    System.out.println("Hasta pronto");
                    break;
                default: //caso de error
                    System.out.println("Error numero erroneo"); //Imprimo el erro al introducirse otro numero que no se encuentre entre los casos
            }
        }while  (numero!= 4); //se repite el bucle sea distinto de 4
    }    
}


