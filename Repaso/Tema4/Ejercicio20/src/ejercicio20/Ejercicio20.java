/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *Ejercicio 20.- Realiza un programa que le haga un examen al usuario, preguntándole cuál
es la capital de España y quién descubrió América.
• Le dirá si ha respondido correctamente o no, cual sería la respuesta correcta, y por último
le dirá su nota (Un 0, un 5 o un 10)
• Ejemplo de ejecución:
EXAMEN DE CULTURA GENERAL
1ª PREGUNTA: ¿Cuál es la capital de España?: Madrid
Muy bien, respuesta correcta.
2ª PREGUNTA: ¿Quién descubrió América?: Napoleón Bonaparte
No es correcto. La respuesta correcta sería Colón
NOTA DEL EXAMEN: 5
• Nota: Las 2 soluciones (Madrid y Colón) guárdalas como constantes. Además,
procura hacer cada pregunta en un método distinto.
* 
 * @author Angel
 */

public class Ejercicio20 {

    private static final String CAPITAL = "Madrid";  //creo las constantes
    private static final String DESCUBRIDOR_DE_AMERICA = "Cristobal Colon";

    public static void main(String[] args) { //creo metodo principal main

        Scanner entrada = new Scanner(System.in); //creo objeto escanner

        System.out.println("EXAMEN DE CULTURA GENERAL"); //imprimo por pantalla

        int nota = 0; //declaro e inicializo variables

        if (preguntaCapitalEspana(entrada)) { //condicional con parametros 
            nota += 5; //sumo a 5 si se cumple 
        }

        if (preguntaDescubridorAmerica(entrada)) { //condicional con parametros
            nota += 5; //sumo a 5 si se cumple
        }

        System.out.println("NOTA DEL EXAMEN: " + nota); //imprimo la nota total
    }

    private static boolean preguntaCapitalEspana(Scanner entrada) { //metodo para preguntar cual es la capital con parametros y devolver un boolean

        System.out.print("1ª PREGUNTA: ¿Cuál es la capital de España?: "); //imprimo por pantalla
        String respuesta = entrada.nextLine(); //guardo en la variable la respuesta

        if (respuesta.equalsIgnoreCase(CAPITAL)) { //condicional si se cumple la respuesta ignoro mayusculas y minusculas con la respuesta
            System.out.println("La respuesta correcta."); //imprimo por pantalla 
            return true; //devuelvo valor verdadero
        } else { //condicional si no devuelvo el valor falso 
            System.out.println("No es correcto. La respuesta correcta sería " + CAPITAL); //imprimo la respuesta correcta
            return false; //devuelvo un false
        }
    }

  
    private static boolean preguntaDescubridorAmerica(Scanner entrada) { //metodo para preguntar por el descubridor de america

        System.out.print("2ª PREGUNTA: ¿Quién descubrió América?: "); //imprimo por pantalla 
        String respuesta = entrada.nextLine(); //guardo en la variable la respuesta

        if (respuesta.equalsIgnoreCase(DESCUBRIDOR_DE_AMERICA) || //condicional si la respuesta es correcta ignoro mayusculas y minusculas
            respuesta.equalsIgnoreCase("Cristobal Colon") ||
            respuesta.equalsIgnoreCase("Cristóbal Colón")) {

            System.out.println("La respuesta correcta."); // //imprimo por pantalla la respuesta
            return true; //devuelvo un verdadero

        } else { //condicional si no 

            System.out.println("No es correcto. La respuesta correcta sería Colón"); //imprimo por pantalla
            return false; //devuelvo un false 
        }
    }
}