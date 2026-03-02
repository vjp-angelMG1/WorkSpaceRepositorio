/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *• Ejercicio 03.- Realiza un programa que lea tantos números
enteros como desee el usuario (le irás preguntando si desea
introducir más números) y los introduzca en una lista.
• A continuación, muestras la lista, luego intercambias los
números que se encuentren en la 2ª y 4ª posición, y por
último muestras de nuevo la lista por pantalla.
• Utiliza al menos 3 métodos: uno para introducir los datos,
otro para mostrar los datos y otro para intercambiar los
datos.
 * @author Ángel
 */
public class Ejercicio3 {

   
    public static void main(String[] args) { //cfreo metodo principal main
        //Lista donde se guardan los numeros introducidos por el usuario
        ArrayList<Integer> numeros = new ArrayList<>(); //creo lista donde guardo los numeros
      
        rellenarDatos(numeros); //llamo a los metodos para mostrar,intercambiar y que se vuelva a mostrar el intercambio
        System.out.println("Lista original");
        mostrarLista(numeros);
        intercambiarPosicionesLista(numeros);
        System.out.println("Lista tras intercambiar la 2 y 4 posicion");
        mostrarLista(numeros);
    }
    

    public static void rellenarDatos(ArrayList<Integer> lista){ //metodo para rellenar datos de la lista parametrizando la lista del array como caja donde guardar los numeros
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        String respuesta; //declaro variables
        int num;
        do{ //bucle do while 
            System.out.print("Introducir un numero entero: "); //imprimo por pantalla
            num = entrada.nextInt(); //guardo en la variable num
            lista.add(num);//añado a la lista el numero
            entrada.nextLine();//Limpio buffer para que rellene el siguiente valor 
            System.out.print("Introducir otro numero - (SI o NO): "); //imprimo por pantalla
            respuesta = entrada.nextLine(); //guardo en variable el valor 
        }while(respuesta.equalsIgnoreCase("si")); //se repite mientras al comparar la respuesta sea si
    }
    

    public static void mostrarLista(ArrayList<Integer> lista){ // metodo que muestra la lista parametrizando la lista del array
        System.out.println("  La Lista  "); //imprimo por pantalla la lista 
        for(int i = 0; i < lista.size(); i++){ //creo bucle for recorriendo la lista
            System.out.print(lista.get(i) + " "); //imprimo por pantalla la lista con sus elementos
        }
        System.out.print("\n"); //creo salto de linea
    }
    

    public static void intercambiarPosicionesLista(ArrayList<Integer> lista){ //metodo para intercambiar la posicion segunda por la cuarta siendo el indice del array el 1 y el 3
        int aux; //declaro la variable
        if(lista.size() > 3){ //condicional para comprobar si existe el indice 1 y el 3
            
            aux = lista.get(1); //guardo el valor de la posicion 2 atraves de la caja auxilar
            lista.set(1, lista.get(3)); //intercambio los demas valores
            lista.set(3, aux);
        }else{ //si no tengo los numeros suficientes no realizo el intercambio
            System.out.println("No hay suficientes numeros para el intercambio la segunda y cuarta posicion"); //imprimo por pantalla
        }
    
    }
    
}
