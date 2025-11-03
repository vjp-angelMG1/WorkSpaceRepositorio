package metodosestaticos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Calculadora {
    /**
     * Método que devuelve la suma de dos números
     * pasados por parámetro.
     * @param num1
     * @param num2
     * @return la suma de los dos números
     */
    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
    
    /**
     * Método que resta dos números pasados por parámetro     
     * @param num1
     * @param num2     
     * @return la resta de los dos números
     */
    public static int resta(int num1, int num2) {
        return num1 - num2;
    }
    /**
     * Método que multiplica dos números pasados por parámetro
     * @param num1
     * @param num2
     * @return la muriplicación de los dos numeros
     */
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }
    /**
     * Método que divide dos números pasados por parámetro
     * @param num1
     * @param num2
     * @return la división de los dos numeros
     */
    public static int division(int num1, int num2) {
        return num1 / num2;         
    }
    /**
     * Método que calcula la raiz cuadrada
     * del número pasado por parámetro
     * @param num1
     * @return la raíz cuadrada
     */
    public static double raizCuadrada(int num1) {
        return Math.sqrt(num1);
    }
    /**
     * Método que devuelve el cuadrado del número
     * pasado por parámetro.
     * @param num1
     * @return el cuadrado de num1
     */
    public static double cuadrado(int num1) {
        return Math.pow(num1, 2); //devuelve el valor de la clase Math.pow que es la que sirve para los exponentes de un numero como es al cuadrado pones un 2 (al cuadrado) despues del numero
    }
    /**
     * Método que devuelve el cubo del número
     * pasado por parámetro.
     * @param num1
     * @return el cubo de num1
     */
    public static double cubo(int num1) {
        return Math.pow(num1, 3); //devolver el valor en la clase Math.pow para el valor del cubo
    }
    /**
     * Método que devuelve el logaritmo natural del número
     * pasado por parámetro.
     * @param num1
     * @return el logaritmo de num1
     */
    public static double logaritmo(double num1) {
        return Math.log(num1); //devolver el valor en la clase Math.log para el valor del logarítmo
    }
    /**
     * Método que devuelve el valor máximo entre dos números
     * @param num1
     * @param num2
     * @return el valor máximo
     */
    public static double valorMaximo(double num1, double num2) {
        return Math.max(num1, num2); //devolver el valor en la clase Math.max para el valor máximo
    }
    /**
     * Método que devuelve el valor mínimo entre dos números
     * @param num1
     * @param num2
     * @return el valor mínimo
     */
    public static double valorMinimo(double num1, double num2) {
        return Math.min(num1, num2); //devolver el valor en la clase Math.min para el valor minimo
    }
    /**
     * Método que devuelve el redondeo al alza del número
     * pasado por parámetro.
     * @param num1
     * @return el número redondeado al alza
     */
    public static double redondearAlAlza(double num1) {
        return Math.ceil(num1); //devolver el valor en la clase Math.cell para redodear al alza
    }
    /**
     * Método que devuelve el redondeo a la baja del número
     * pasado por parámetro.
     * @param num1
     * @return el número redondeado a la baja
     */
    public static double redondearABaja(double num1) {
        return Math.floor(num1);//devolver el valor en la clase Math.floor para redondear a la baja
        
  
    }
}
