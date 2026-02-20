/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 * * Realiza un programa en JAVA que le pida al usuario un usuario y una
 * contraseña. El programa debe verificar la corrección de esa contraseña, que
 * deberá satisfacer las condiciones siguientes:
 *
 * • La contraseña no puede tener menos de seis caracteres. • Al menos dos de
 * esos caracteres deben ser dígitos. • El nombre del usuario no puede formar
 * parte de la contraseña.
 *
 * @author Ángel
 */
public class Ejercicio9 {

    public static void main(String[] args) { //creo clase principal main

        Scanner entrada = new Scanner(System.in); //creo objeto escaner para pedir valor al usuario

        System.out.print("Introducir nombre de usuario : ");//Imprimo por pantalla nombre de usuario
        String usuario = entrada.nextLine(); //creo el objeto usuario para guardar el valor que me de el usuario

        System.out.print("Introduce password: "); //imprimo por pantalla la contraseña
        String password = entrada.nextLine(); //creo el objeto password para guardar el valor que de el usuario

        if (passwordCorrecto(usuario, password)) { //condicional al introducir los parametros del usuario y la contraseña al método
            System.out.println("password correcto"); //imprimo por pantalla 
        } else { //condicional si no se cumple el if
            System.out.println("password no correcto"); //Imprimo por pantalla
        }
    }

    public static boolean passwordCorrecto(String usuario, String password) { //método que comprueba si la contraseña es correcta
        boolean valido = true; //declaro e inicializo variable 
        int l; //declaro variable
        if (password.length() < 8) { //codicional para comprobar su longuitud minima
            System.out.println("el password tiene que tener minimo 8 caracteres"); //imprimo por pantalla 
            valido = false; //marco contraseña como no valida
        }
        int contadorDigitos = 0;
        for (l = 0; l < password.length(); l++) { //bucle para comprobar que tiene 2 digitos como minimo
           
            char u = password.charAt(l); //guardo en la variable el caracter de la posición l
            
            if (u >= '0' && u <= '8') { //condicional en el que se tiene que cumplir que el caracter es un digito del 0 al 8
                contadorDigitos++; //incremento el contador de dígitos
            }
        }

        if (contadorDigitos < 2) { // condicional si hay al menos de 2 dígitos
            System.out.println("el password tiene que tener mínimo dos digitos"); //imprimo por pantalla 
            valido = false; //marco contraseña como no valida
        }

        //3. Comprobar que el nombre de usuario no está dentro de la contraseña
        if (password.toLowerCase().contains(usuario.toLowerCase())) { //condicional en el que convierto a ambos en minúsculas en que comparo sin distinguir mayusculas con contains que no coinciden ambas
            System.out.println("El password no es el nombre del usuario"); //imprimo por pantalla que no pueden coincidir ambos nombres
            valido = false; //marco la contraseña con no valida
        }

        return valido; //devuelvo el valor solo si cumple todas las condiciones
    }

}
