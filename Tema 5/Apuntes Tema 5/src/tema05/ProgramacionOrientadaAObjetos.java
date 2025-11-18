/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class ProgramacionOrientadaAObjetos {
    
    public static void main(String[] args) {
        // -------------------------------------------------------//
        // CREACIÓN DE OBJETOS A PARTIR DE CLASES PERSONALIZADAS  //
        // ------------------------------------------------------//
        //1. Instancio un objeto del tipo que he creado
        //1.1. Con consstructor parametrizado y estableciendo valores con setters
   //     Scanner entrada = new Scanner(System.in);
   //     Coche miCoche = new Coche();
   //     System.out.println(miCoche.toString());
        
   //     miCoche.setEspejos(5);
   //     System.out.println(miCoche.toString());
        
   //     System.out.println(miCoche.getEspejos());
        
   //     miCoche.acelerar();
        
        // 1.2. Con constructor parametrizado, inicializando los atributos
        //con los valores pasados por parámetro
        Coche tuCoche = new Coche("Michelin", "Baja", 3 );
        System.out.println(tuCoche.toString());
        
        //Esto hace lo mismo que la línea anterior, porque detecta el toString() automáticamente
        System.out.println(tuCoche);
        
        System.out.println(tuCoche.getRuedas());
        
      
       // ------------------------------------------------------//
       // 1. MODIFICADORES DE ACCESO,                           //
       // 2. MODIFICADOR STATIC Y                               //
       // 3. PASO DE PARÁMETROS POR VALOR Y REFERENCIA          //
       // ------------------------------------------------------//
       
       // 1 / 1.1. MODIFICADORES DE ACCESO
//       Bicicleta bicicleta = new Bicicleta();
//       System.out.println("bicicleta.ruedas");
//       System.out.println(bicicleta.getEstaPedaleando());
//        bicicleta.acelerar();
        
      
//        Bicicleta bicicleta2 = new Bicicleta();
//        System.out.println("¿Cuántas bicis hemos creado?");
//        System.out.println(bicicleta.getNumBicicletas());
        
        
        
        //2 / 1.2. MODIFICADOR STATIC
        // Al ser un método estático, se le llama desde la clase,
        // no desde el objeto: Bicicleta.getNumBicicletas()
   //      System.outprintln(Bicicleta.getNumBicicletas());
   
        //3 / PASO DE PARÁMETROS POR VALOR O POR REFERENCIA
   //    int num1 = 4;
   //    System.out.println(suma(num1));
   
   //    Bicicleta bici = new Bicicleta(2, "recto", "MIB", "de disco", true);
   //    empezarAPedalear(bici);
   //    System.out.println(bici);
   
   
         
         // 4 / COMPOSICIÓN DE CLASES
         // 4.1 / Creo un ciclista
         Ciclista pogacar = new Ciclista("Pogacar", 1, "Lider");
         
         // 4.2 / Creo una bici
         Bicicleta biciPogacar = new Bicicleta(
                 2,
                 "recto",
                 "de carretera",
                 "de disco",
                 true,
                 pogacar
         );
         
         //4.3 / Imprimo por pantalla la bici con el ciclista
         System.out.println(biciPogacar);
         
         //4.4 / Accedo al nombre del ciclista de la bici
         System.out.println(biciPogacar.getCiclista().getNombre());
    
    
    }
    
    
    
    
    
    
    
    // Todos los métodos de la clase principal deben ser estáticos,
    // porque el main() es estático y, por tanto, estamos en un contexto estático.
    public static int suma(int num1) {
        
        int num2 = 3;
        return num1 + num2;
    }
    
    /**
     * Método que pone a true el valor del atributo
     * estaPedaleando de la bici recibida por parámetro.
     * 
     * @param bici
     */
    public static void empezarApedalear(Bicicleta bici) {
        bici.setEstaPedaleando(true);
    }
}
