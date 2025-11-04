/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej27caraocruz;

import java.util.Scanner; //importo la clase java con el paquete util y la clase scanner
import java.util.Random; //importo la clase java con el paquete util y la clase random para un valor aleatorio
/**
 *
 * @author Ángel
 */
public class caraocruz {

    public static void main(String[] args) { //metodo main
        boolean acierto = false;
        Scanner entrada = new Scanner(System.in); //Captura lo que le pidamos como usuario
        Random opcion = new Random(); // Lo utilizamos para obtener un valor aleatorio
        String eleccionUsuario; //declaramos las variables
        String resultado;

        System.out.println("¡Bienvenido al juego de la moneda!"); //imprimo el enunciado del juego

        
        while (!acierto) { //Bucle para saber si he acertado si es distinto sigue pidiendo valores
            System.out.print("Elige 'cara' o 'cruz': "); //imprimo el resultado
            eleccionUsuario = entrada.nextLine().toLowerCase(); //inicializo la variable con toLoweCase se convierte a minusculas para que no de error

            
            if (eleccionUsuario.equals("cara") || eleccionUsuario.equals("cruz")) { //condicional solo lanzamos la moneda si es valida
                resultado = (opcion.nextInt(2) == 0) ? "cara" : "cruz"; //se lanza la moneda 
                System.out.println("La moneda ha caído en: " + resultado); //imprimo el valor 

                if (eleccionUsuario.equals(resultado)) { //si se cumple la eleccion del usuario al lanzar la moneda con el resultado
                    System.out.println("¡Enhorabuena! Has acertado."); //imprime el resultado
                    acierto = true; // Terminamos el bucle
                } else { //si no se cumple la eleccion del usuario al lanzar la moneda con el resultado
                    System.out.println("Has perdido, inténtalo de nuevo.\n"); //imprime el resultado
                }
            } else { //si no se elige ni cara ni cruz 
                System.out.println("Por favor, elige solo 'cara' o 'cruz'."); //imprimimos este resultado
            }
        }

        }
    }