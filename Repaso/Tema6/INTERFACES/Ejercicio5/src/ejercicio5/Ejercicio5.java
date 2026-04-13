/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *• Ejercicio 5. – Desarrolla un programa en JAVA, orientado a objetos, en
el que crees una clase llamada Mamifero con los atributos nombre,
sexo, color y edad. Crea también las clases Ornitorrinco (hereda de
Mamifero y tiene como atributo el número de huevos del ornitorrinco)
y Murcielago (hereda de Mamifero y tiene como atributo la altura de
vuelo del murciélago en metros).
• Posteriormente, crea dos interfaces para definir el comportamiento de
los siguientes tipos de mamíferos:
• Oviparo, con los métodos obtenerMensajeOviparo, ponerHuevo,
incubarHuevo y mostrarNumHuevos.
• Volador, con los métodos obtenerMensajeVolador,
aumentarAlturaVuelo, bajarAlturaVuelo y mostrarAlturaVuelo.
* • El Ornitorrinco implementa el siguiente comportamiento:
• obtenerMensajeOviparo. Devuelve el mensaje “El ornitorrinco es un mamífero
ovíparo”.
• ponerHuevo. Aumenta el número de huevos del ornitorrinco en una unidad.
• incubarHuevo. Disminuye el número de huevos del ornitorrinco en una unidad.
• mostrarNumHuevos. Muestra el número de huevos del ornitorrinco.
• El murciélago implementa el siguiente comportamiento:
• obtenerMensajeVolador: Devuelve el mensaje “El murciélago es un animal volador”.
• aumentarAlturaVuelo.Aumenta la altura de vuelo del murciélago en 5 metros.
• bajarAlturaVuelo. Disminuye la altura de vuelo del murciélago en 5 metros.
• mostrarAlturaVuelo. Muestra los metros de altura a los que está volando el
murciélago
* • Crea una clase Test en la que instancies un objeto de cada
subclase implementada anteriormente y pruebes los métodos de
cada objeto.
• Posteriormente, utiliza el polimorfismo para crear cada uno de
los objetos a partir de la interfaz correspondiente y prueba los
métodos implementados nuevamente.
** 

 * @author Angel 
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("OBJETOS DE LAS SUBCLASES");
        
        System.out.println("--MURCIELAGO--"); //creo los 2 objetos de las subclases murcielagos y ornintorrinco con constructor parametrizado y muestro por pantalla sus caracteriscas y comportamientos
        Murcielago murcielago = new Murcielago("Tepes","macho","negro",9,7);
        System.out.println(murcielago.obtenerMensajeVolador());
        murcielago.mostrarAlturaVuelo();
        murcielago.aumentarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        murcielago.bajarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        
        System.out.println("--ORNITORRINCO--");
        Ornitorrinco ornitorrinco = new Ornitorrinco("Jasin","hembra","Ocre",25,6); 
        System.out.println(ornitorrinco.obtenerMensajeOviparo());
        ornitorrinco.mostrarNumHuevos();
        ornitorrinco.ponerHuevo();
        ornitorrinco.mostrarNumHuevos();
        ornitorrinco.incubarHuevo();
        ornitorrinco.mostrarNumHuevos();
        
        System.out.println("--POLIFORMISMO--"); //creo dos objetos atraves de la interfaz o clase prima con las clases de murcielago y ornitorrinco con sus caracteristicas y comportamientos
        
        System.out.println("--MURCIELAGO--"); 
        Volador murVol = new Murcielago("Tepes","macho","negro",9,7);
        System.out.println(murVol.obtenerMensajeVolador());
        murVol.mostrarAlturaVuelo();
        murVol.aumentarAlturaVuelo();
        murVol.mostrarAlturaVuelo();
        murVol.mostrarAlturaVuelo();
        murVol.bajarAlturaVuelo();
        murVol.mostrarAlturaVuelo();
        
        System.out.println("--ORNITORRINCO--");
        Oviparo ornOvi = new Ornitorrinco("Jasin","hembra","Ocre",25,6);
        System.out.println(ornOvi.obtenerMensajeOviparo());
        ornOvi.mostrarNumHuevos();
        ornOvi.ponerHuevo();
        ornOvi.mostrarNumHuevos();
        ornOvi.incubarHuevo();
        ornOvi.mostrarNumHuevos();
        
        
        
    }
    
}
