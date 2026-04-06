/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 * *• Ejercicio 20.- Se pretende desarrollar una aplicación que simule el
 * funcionamiento de un cajero automático. Primeramente, se debe crear una clase
 * llamada Cuenta, que gestione las operaciones sobre la cuenta. Además de los
 * constructores y campos que se estimen necesarios, la clase contará con los
 * métodos: void ingresar (float c) //Agrega alsaldo de la cuesta la cantidad
 * recibida. void extraer(float c) //Descuenta del saldo la cantidad recibida.
 * Tras la llamada a este método, elsaldo podrá quedar en negativo. float
 * getSaldo() //Devuelve elsaldo actual • Por otro lado, existirá una clase con
 * el método main encargada de la captura y presentación de datos, y de la
 * gestión de la cuenta. Al iniciarse la aplicación se mostrará el siguiente
 * menú: 1.- Crear cuenta vacía. 2.- Crear cuenta con saldo inicial. 3.-
 * Ingresar dinero. 4.- Sacar dinero. 5.-Ver saldo. 6.- Salir. • La opción 1
 * crea un objeto Cuenta con saldo 0, la opción 2 solicita una cantidad y crea
 * un objeto Cuenta con este saldo inicial. En la opción 3 se solicita una
 * cantidad y la ingresa en el objeto creado en las opciones 1 o 2 (debe haber
 * pasado antes por estas opciones), mientras que en la opción 4 se solicita una
 * cantidad y la extrae del objeto creado en las opciones 1 o 2 (también debe
 * haber pasado antes por estas opciones). Finalmente, la opción 5 muestra el
 * saldo, mientras que la 6 finaliza el programa. • El menú vuelve a presentarse
 * en pantalla mientras no se elija la opción de salir.
 *
 * @author Angel
 */
public class Ejercicio20 {

    public static void main(String[] args) { //creo metodo main
        Scanner entrada = new Scanner(System.in); //creo objeto escanner
        int opcion; //declaro variables
        float saldo;
        boolean cuentaExistente = false; //declaro e inicializo la variable con la cuenta que ya existe
        Cuenta cuenta = new Cuenta(); //creo objeto cuenta para cuenta nueva

        do { //creo bucle para pedirle una opcion al menos una vez
            menu(); //llamo al metodo menu
            opcion = entrada.nextInt(); //pido una opcion al usuario
            switch (opcion) { //condicional para eleguir una opcion
                case 1: //opcion uno 
                    cuentaExistente = true; //creo cuenta vacia 
                    break; //para que no salte al siguiente caso
                case 2:
                    saldo = pedirSaldo(); //pido el saldo llamando al metodo y lo guardo en la variable
                    cuenta.setSaldo(saldo); //modifico el saldo de la cuenta con el saldo que le he pedido al metodo
                    cuentaExistente = true; //siendo la cuenta vacia
                    break;
                case 3:
                    if (cuentaExistente) { //condicional si la cuenta existe 
                        saldo = pedirSaldo(); //guardo el saldo que le pido en la variable al llamar al metodo y pedirselo
                        cuenta.ingresar(saldo); //ingreso el saldo a la cuenta llamando al metodo
                    } else { //si no
                        System.out.println("Se tiene que crear una cuenta"); //hay que crear una cuenta
                    }
                    break;
                case 4:
                    if (cuentaExistente) {
                        saldo = pedirSaldo();
                        cuenta.extraer(saldo); //llamo al metodo para sacar dinero
                    } else {
                        System.out.println("Se tiene que crear una cuenta"); //hay que crear una cuenta
                    }
                    break;
                case 5:
                    if (cuentaExistente) {
                        System.out.println("Saldo: " + cuenta.getSaldo()); //muestro el saldo de la cuenta con el metodo get
                    } else {
                        System.out.println("Se tiene que crear una cuenta");//hay que crear una cuenta
                    }
                    break;
                case 6:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Error opcion incorrecta"); //error opcion no valida 
            }
        } while (opcion != 6); //bucle que se repite mientras las opcion sea distinta de 6
    }

    public static float pedirSaldo() { //creo metodo pedirSaldo que duelve el saldo que le pido al usuario
        Scanner entrada = new Scanner(System.in);
        float saldo;
        System.out.print("Introduzca saldo: ");
        saldo = entrada.nextFloat();
        return saldo;
    }
    public static void menu(){ //creo método menu
            System.out.println("1. Crear cuenta vacía"); 
            System.out.println("2. Crear cuenta con saldo inicial");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Ver saldo");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
    }

}
