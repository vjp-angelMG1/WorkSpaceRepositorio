/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 * * * *• Ejercicio 5. – Desarrolla un programa en JAVA, orientado a objetos, en
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
* 
 * @author Angel
 */
public class Ornitorrinco extends Mamifero implements Oviparo {
    
    //ATRIBUTOS
    private int numHuevos;
    
    //CONSTRUCTORES
    //Por defecto
    public Ornitorrinco(){
        super();
    }
    
    //Parametrizado
    public Ornitorrinco(String nombre,String sexo,String color,int edad,int numHuevos){
        super(nombre,sexo,color,edad);
        this.numHuevos = numHuevos;
    }

    public int getNumHuevos() {
        return numHuevos;
    }

    public void setNumHuevos(int numHuevos) {
        this.numHuevos = numHuevos;
    }
    
    //metodos abstractos de la interfaz oviparo
    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamifero oviparo";
    }

    @Override
    public void ponerHuevo() {
        System.out.println("Poniendo huevo...");
        numHuevos++;
    }

    @Override
    public void incubarHuevo() {
        System.out.println("Incubando huevo...");
        numHuevos--;
    }
    @Override
    public void mostrarNumHuevos() {
        super.mostrarMafiero();
        System.out.println("El ornitorrinco tiene " + numHuevos + " huevos");
    }
    //metodo mostrar
    public void mostrarOrnitorrinco(){
        mostrarMafiero();
        System.out.println("Numero de Huevos"+this.numHuevos);
    }
    //metodo toString
    @Override
    public String toString() {
        return super.toString()+"Ornitorrinco{" + "numHuevos=" + numHuevos + '}';
    }
    
    
    
  
    
}
