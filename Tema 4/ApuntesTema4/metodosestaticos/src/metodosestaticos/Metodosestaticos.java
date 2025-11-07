/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosestaticos;

import utilidades.Utilidades;

/**
 *
 * @author USUARIO
 */
public class Metodosestaticos {
    //Método que imprime un saludo -> tipo void
    public static void saludo() {
        System.out.println("Hola Mundo con Java");
    }
            
    // Método que imprime un mensaje con un dato que recibe por parámetro -> tipo void
    public static void saludoConParametro(int num) {
        saludo();
        System.out.println("Hola mundo" + num);
    }
    // Método que muestra la suma de dos números que recibe por parámetros -> tipo void
    public static void suma(int num1,int num2){
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1 + num2));
    }
    
    //Método que devuelve la suma de dos números que recibe por parámetros -> tipo int
    public static int sumaQueDevuelveElResultado(int num1, int num2) {
       int resultado = num1 + num2;          //return = num1 + num2
       return resultado;
    }
    
    //Método que duelve true si la contraseña
    // que pasamos por parámetro es correcta -> tipo boolean
            
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        double resultado;
        num1=6;
        num2=3;
        char letra = Utilidades.letraAleatoria(); //declaramos la variable char y la inicializamos llamando a la clase letraAleatoria que esta dentro del paquete utilidades
        
        //Llamamos a los métodos para que se ejecuten al lanzar el programa.
//        saludo();
        
//        saludoConParametro(2);
 
//       suma(num1, num2);

//        resultado = sumaQueDevuelveElResultado(num1, num2);
//        System.out.println(resultado);
//        System.out.println(sumaQueDevuelveElResultado(num1, num2));
        
        // Llamamos a métodos estático de otra  clase
        System.out.println(Calculadora.suma(num1,num2));
        System.out.println(Calculadora.resta(num1, num2));
        System.out.println(Calculadora.multiplicacion(num1, num2));
        System.out.println(Calculadora.division(num1, num2));
        
        // Llamamos a un método estático de una clase de otro paquete
        // (debemos importar el paquete)
       // Utilidades.pedirNumero();
        
        //Creamos una calculadora
        //1 Pedimos 2 números
        num1 = Utilidades.pedirNumero();
        num2 = Utilidades.pedirNumero();
        
        System.out.println(num1 + " - " + num2);
       
        //2. Llamamos a los métodos
        //guardamos el resultado en una variable
        // y mostramos dicha variable
        resultado = Calculadora.suma(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + resultado);
       
        resultado = Calculadora.resta(num1, num2);
        System.out.println( num1 + " - " + num2 + " = " + resultado);
        
        resultado = Calculadora.multiplicacion(num1, num2);
        System.out.println( num1 + " * " + num2 + " = " + resultado);
        
        resultado = Calculadora.division(num1, num2);
        System.out.println( num1 + " / " + num2 + " = " + resultado);
        
        resultado = Calculadora.raizCuadrada(num1);
        System.out.println(" La raiz cuadrada de " + num1 + " es " + resultado);

        
        resultado = Calculadora.cuadrado(num1);
        System.out.println("El cuadrado de " + num1 + " es " + resultado);


        resultado = Calculadora.cubo(num1);
        System.out.println("El cubo de " + num1 + " es " + resultado);


        resultado = Calculadora.logaritmo(num1);
        System.out.println("El logaritmo de " + num1 + " es " + resultado);


        resultado = Calculadora.valorMaximo(num1, num2);
        System.out.println("El valor máximo entre " + num1 + " y " + num2 + " es " + resultado);


        resultado = Calculadora.valorMinimo(num1, num2);
        System.out.println("El valor mínimo entre " + num1 + " y " + num2 + " es " + resultado);


        resultado = Calculadora.redondearAlAlza(4.5);
        System.out.println("4.5 redondeado al alza es " + resultado);


        resultado = Calculadora.redondearABaja(4.5);
        System.out.println("4.5 redondeado a la baja es " + resultado);
        
        System.out.println("Letra aleatoria: " + letra);
        
    }
}