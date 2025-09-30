/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1clasetema2;

/**
 *
 * @author alumno
 */
public class Main {
    //Atributos
    int vida = 100;
    int niveles = 100;
    String genero = "RPG";
    public static void iniciar() {
        System.out.println("Iniciando juego...");
    }
    public static void mostrarMenu() {
        System.out.println("- Menu -");
        System.out.println("Inicia");
        System.out.println("Selecionar nivel");
        System.out.println("Opciones");
        System.out.println("Salir");
    }
    
    //Método principal
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int tiempoEspera =3;
        
        float media = 3.5f;
        
        //1. Declarar una variable
        char letraDNI;
        
        //2. Inicializar la variable
        letraDNI = 'A';
        
        //Declarar e inicializar una variable
        boolean encontrado = false;
        
        //Declarar varias variables en una linea
        int edad =20, niveles, vida;
        
        System.out.println(letraDNI);
       // Llamar metodos
       iniciar();
       
    }
    
}
