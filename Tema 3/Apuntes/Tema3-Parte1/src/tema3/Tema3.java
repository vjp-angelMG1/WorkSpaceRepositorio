/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. IF
//        boolean eresPalestino = true;
//        int edad = 10;
//        
//        if (eresPalestino == true) {
//            System.out.println("Netanyahu te lanza un misil");
//        }
//        
//        if (eresPalestino && (edad < 16 || edad > 3)) {
//            System.out.println("Refugiarte en un hospital no te va a salvar");
//        }
//        
//        // 2A. IF-ELSE
//        if (!eresPalestino) {
//            System.out.println("Netanyahu te lanza un misil");
//        } else {
//            System.out.println("Netanyahu todavia no va a por ti");
//        }
//        
//        // 2B. IF-ELSE-IF
//        if (!eresPalestino) {
//            System.out.println("Netanyahu te lanza un misil");
//        } else if(edad <= 10){
//            System.out.println("Tu escuela aún esta en pie");
//        } else {
//            System.out.println("Netanyahu todavia no va a por ti");
//        }
        
        // 3. SWITCH-CASE
        
        // Declaramos las variables
        int opcion;
        Scanner entrada = new Scanner(System.in);
        
        //Mostramos el menu
        System.out.println("Elija una obción");
        System.out.println("1. Mirar a otro lado");
        System.out.println("2. Protestar pacificamente");
        System.out.println("3. Entrar en guerra");
        System.out.println("4. Aportar ayuda humanitaria");
        System.out.println("5. Salir");
        
        //Leemos la opción elegida por el usuario
        //y la guardamos en la variable opcion
        opcion = entrada.nextInt();
        
        // Ejecutamos el switch-case
        switch(opcion){
            case 1:
                System.out.println("Has elegido Mirar a otro lado");
                break;
            case 2:
                System.out.println("Has elegido Protestar pacificamente");
                break;
            case 3:
                System.out.println("Has elegido Entrar en guerra");
                break;
            case 4:
                System.out.println("Has elegido Aportar ayuda humanitaria");
                break;
            case 5:
                System.out.println("Gracias por usar el programa");
                break;
            default:
                System.out.println("Opción no valida, eliga una opción entre el 1 y el 5");
        }
        
        
    }
}
