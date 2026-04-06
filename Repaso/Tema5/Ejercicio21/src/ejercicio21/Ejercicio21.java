/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *• Ejercicio 21.- Añade al ejercicio anterior una nueva clase llamada
CuentaClave. Esta clase será una subclase de Cuenta y tendrá las
siguientes características:
• Incluirá un nuevo dato miembro llamado clave.
• Sobrescribirá el método extraer(), de modo que sólo permita la extracción si
hay saldo suficiente, sino no hará nada.
• En cuanto al funcionamiento del programa será igual que en el caso
anterior, sólo que al elegir las opciones 1 y 2 para la creación de la
cuenta, se pedirá también al usuario la clave que se le quiere asociar.
• No se enviará ningún tipo de aviso al usuario si se intenta sacar más
dinero del que se dispone.

 * @author Angel
 */
public class Ejercicio21 {

public static void main(String[] args) { //creo metodo main
        Scanner entrada = new Scanner(System.in); //creo objeto escanner
        int opcion; //declaro variables
        float saldo;
        int clave;
        boolean cuentaExistente = false; //declaro e inicializo la variable con la cuenta que ya existe
        CuentaClave cuenta = null; //creo objeto cuenta para cuenta nueva

        do { //creo bucle para pedirle una opcion al menos una vez
            menu(); //llamo al metodo menu
            opcion = entrada.nextInt(); //pido una opcion al usuario
            switch (opcion) { //condicional para eleguir una opcion
                case 1: //opcion uno 
                    clave = pedirClave(entrada); //pido la clave llamando al metodo
                    cuenta = new CuentaClave(0, clave); //creo la cuenta vacia con clave
                    cuentaExistente = true; //creo cuenta vacia 
                    break; //para que no salte al siguiente caso
                case 2:
                    clave = pedirClave(entrada); //pido la clave llamando al metodo y lo guardo en la variable
                    saldo = pedirCantidad(entrada);//pido la cantidad y la guardo en la cuenta
                    cuenta = new CuentaClave(saldo, clave); //creo la cuenta con saldo inicial y clave
                    cuentaExistente = true; //siendo la cuenta vacia
                    break;
                case 3:
                    if (cuentaExistente) { //condicional si la cuenta existe 
                        saldo = pedirCantidad(entrada); //guardo la cantidad que le pido en la variable al llamar al metodo y pedirselo
                        cuenta.ingresar(saldo); //ingreso el saldo a la cuenta llamando al metodo
                    } else { //si no
                        System.out.println("Se tiene que crear una cuenta"); //hay que crear una cuenta
                    }
                    break;
                case 4:
                    if (cuentaExistente) {
                        saldo = pedirCantidad(entrada);//pido la cantidad y la guardo en la variable
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

    public static void menu(){ //creo método menu
            System.out.println("1. Crear cuenta vacía"); 
            System.out.println("2. Crear cuenta con saldo inicial");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Ver saldo");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
    }
    
    public static float pedirCantidad(Scanner entrada){ //creo metodo pedirCantidad 
        float saldo; //declaro variable 
        System.out.print("Introduzca cantidad: "); //imprimo por pantalla
        saldo = entrada.nextFloat();
        return saldo;
    }
    
    public static int pedirClave(Scanner entrada){ //creo metodo pedir clave
        int clave;
        System.out.print("Introduzca clave: ");
        clave = entrada.nextInt();
        return clave;
    }
}


