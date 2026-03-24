/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 * • Ejercicio 17.- Realiza un programa, orientado a objetos, que le haga un
 * examen al usuario, haciéndole 4 preguntas (por ejemplo: ¿cuál es la capital
 * de España?, ¿quién descubrió América?…) Le dirá si ha respondido
 * correctamente o no, cual sería la respuesta correcta, y por último le dirá su
 * nota (Cada pregunta acertada vale 2,5). • La clase Enunciado tendrá dos
 * atributos de tipo String, pregunta y respuesta. • Tendrás una clase Test
 * donde crearás 4 objetos e implementarás los métodos necesarios para preguntar
 * al usuario, y para darle la nota del examen.
 *
 * @author Angel
 */
public class Test {

    public static void main(String[] args) { //creo metodo principal main ejecutable

        Scanner entrada = new Scanner(System.in); //creo objeto escaner

        Enunciado enunciado1 = new Enunciado("Cual es la capital de España", "Madrid"); //creo tres objetos con los  enunciados de las preguntas y respuestas con constructor parametrizado
        Enunciado enunciado2 = new Enunciado("Quien descubrio America", "Colon");
        Enunciado enunciado3 = new Enunciado("Cual es la capital de Argentina", "Buenos Aires");
        Enunciado enunciado4 = new Enunciado("Cual es la capital de Francia", "Paris");

        double nota = 0.0; //creo variable para ir guardando la nota que me da de si acierto o no

        System.out.println(enunciado1.getPregunta()); //muestro las preguntas
        System.out.print("Escribe tu respuesta: "); //pido al usuario una respuesta
        String respuestaUsuario1 = entrada.nextLine(); //guardo en la variable la respuesta

        System.out.println(enunciado2.getPregunta());
        System.out.print("Escribe tu respuesta: ");
        String respuestaUsuario2 = entrada.nextLine();

        System.out.println(enunciado3.getPregunta());
        System.out.print("Escribe tu respuesta: ");
        String respuestaUsuario3 = entrada.nextLine();

        System.out.println(enunciado4.getPregunta());
        System.out.print("Escribe tu respuesta: ");
        String respuestaUsuario4 = entrada.nextLine();

        if (enunciado1.esCorrecta(respuestaUsuario1)) { //condicionales para ver si es correcta le incremento el valor o no
            System.out.println("¡Correcto!");
            nota += 2.5;
        } else { //condicional si no 
            System.out.println("Incorrecto. La respuesta correcta era: " + enunciado1.getRespuesta()); //muestro la correcta 
        }
        if (enunciado2.esCorrecta(respuestaUsuario2)) {
            System.out.println("¡Correcto!");
            nota += 2.5;
        } else {
            System.out.println("Incorrecto. La respuesta correcta era: " + enunciado2.getRespuesta());
        }
        if (enunciado3.esCorrecta(respuestaUsuario3)) {
            System.out.println("¡Correcto!");
            nota += 2.5;
        } else {
            System.out.println("Incorrecto. La respuesta correcta era: " + enunciado3.getRespuesta());
        }
        if (enunciado4.esCorrecta(respuestaUsuario4)) {
            System.out.println("¡Correcto!");
            nota += 2.5;
        } else {
            System.out.println("Incorrecto. La respuesta correcta era: " + enunciado4.getRespuesta());
        }
        System.out.println("Puntuacion total" + nota); //imprimo el total guardado en la variable nota
    }

}
