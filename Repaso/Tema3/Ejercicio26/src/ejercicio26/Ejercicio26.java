/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
//Ejercicio 26.- Diseña un programa en JAVA que te diga la
//suma total de los números impares existentes entre el 111
//y el 222.
/**
 *
 * @author Ángel
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        int num; //declaro la variable 
        int suma=0; //declaro la variable suma y la inicializo
        for(num=111;num<=222;num++){ //bucle for para buscar entre los dos numeros en cada vuelta se incrementa el valor 
            if(num%2==1){ //Condicion que comprueba si el numero es impar
                System.out.println("numero impares entre 111 y 222 :"+num); //imprime los numeros impares
                suma +=num; //suma el numero impar que se acumula en la variable suma es equivalente suma mas numero guardandose en variable suma
            }
        }
        System.out.println("Suma total de los numeros Numeros totales "+suma);//imprimo por pantalla el resultado total de la suma de los numeros impares
    }
    
}
