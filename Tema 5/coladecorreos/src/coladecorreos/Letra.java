/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coladecorreos;

/**
 *
 * @author alumno
 */
public class Letra {
 public static char generarLetraAleatoria(char letraInicial, char letraFinal){
 int rango = letraFinal - letraInicial + 1;
 return (char) (letraInicial + (int)(Math.random()* rango));
 
 }
 
}