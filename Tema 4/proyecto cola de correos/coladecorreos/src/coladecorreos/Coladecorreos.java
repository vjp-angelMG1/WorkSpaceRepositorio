/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladecorreos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Coladecorreos {

    /**
     * @param args the command line arguments
     */
    
    public final static char LETRA_INICIAL = 'A';
    public final static char LETRA_FINAL = 'F';

    private static int NumerodeEnvio = 0 ;
    private static int NumerodeRcojida = 0 ;

    public static void main(String[] args) {
        int OpcionCliente;
        char letraMostrador;
        opcion = 0;
       Scanner entrada = new Scanner(System.in);
       OpcionCliente = entrada.nextInt();
       System.out.println("Selecione una opción: ");
       return OpcionCliente;
       do{
           mostrarMenu();
           try{
                switch(OpcionCliente){
                    case 1:{
                        Enviar.generarNumeroDeEnvio();
                     break;
                    }
                    case 2:{
                        Enviar.generarNumeroDeEspera();
                    break;
                    }
                    case 3:{
                        System.out.println("Salir del programa");
                    break;
                    }
                    default:
                        System.out.println("Opcion no valida");
           
            }catch(Excepction e)(Letra.generarLetraAleatoria(LETRA_INICIAL, LETRA_FINAL)){
                    System.out.println("Error: debe ingresar número válido. ");
                    OpcionCliente = 0;
            }
           }while(opcion != 3){}

    
