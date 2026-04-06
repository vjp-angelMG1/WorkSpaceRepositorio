/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20;

/**
 *• Ejercicio 20.- Se pretende desarrollar una aplicación que simule el funcionamiento
de un cajero automático. Primeramente, se debe crear una clase llamada Cuenta,
que gestione las operaciones sobre la cuenta. Además de los constructores y
campos que se estimen necesarios, la clase contará con los métodos:
void ingresar (float c) //Agrega alsaldo de la cuesta la cantidad recibida.
void extraer(float c) //Descuenta del saldo la cantidad recibida. Tras la llamada a este método,
elsaldo podrá quedar en negativo.
float getSaldo() //Devuelve elsaldo actual
• Por otro lado, existirá una clase con el método main encargada de la captura y
presentación de datos, y de la gestión de la cuenta. Al iniciarse la aplicación se
mostrará el siguiente menú:
1.- Crear cuenta vacía.
2.- Crear cuenta con saldo inicial.
3.- Ingresar dinero.
4.- Sacar dinero.
5.-Ver saldo.
6.- Salir.
• La opción 1 crea un objeto Cuenta con saldo 0, la opción 2 solicita una cantidad y crea un objeto
Cuenta con este saldo inicial. En la opción 3 se solicita una cantidad y la ingresa en el objeto creado
en las opciones 1 o 2 (debe haber pasado antes por estas opciones), mientras que en la opción 4 se
solicita una cantidad y la extrae del objeto creado en las opciones 1 o 2 (también debe haber pasado
antes por estas opciones). Finalmente, la opción 5 muestra el saldo, mientras que la 6 finaliza el
programa.
• El menú vuelve a presentarse en pantalla mientras no se elija la opción de salir.

 * @author Angel
 */
public class Cuenta {
    //ATRIBUTOS
    private float saldo;
    //CONSTRUCTORES
    //por defecto
    public Cuenta(){
        this.saldo = 0;
    }
    //parametrizado
    public Cuenta(float saldo) {
        this.saldo = saldo;
    }
    //Getters y Setters
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    //metodos 
    public void ingresar(float dinero){
        this.saldo += dinero;
    }
    
    public void extraer(float dinero){
        this.saldo -= dinero;    
    }
    public void mostrar(){
        System.out.println("dinero"+this.saldo);
    }
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
}

    

