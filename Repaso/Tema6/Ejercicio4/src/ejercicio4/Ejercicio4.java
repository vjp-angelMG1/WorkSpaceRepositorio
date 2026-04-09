/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *• Ejercicio 4. – Realiza un programa en JAVA, orientado a objetos,
en el que modeles una jerarquía de animales con las siguientes
características:
• Animal es la clase raíz y contiene los atributos nombre, edad, y peso.
Esta clase debe tener métodos abstractos para mostrar el sonido, la
alimentación, el hábitat y el nombre científico del animal.
• Los cánidos y los felinos son subclases de Animal.
• Los perros son cánidos, su sonido es el ladrido, su alimentación es
carnívora, su hábitat es doméstico y su nombre científico es Canis lupus
familiaris.
• Los lobos son cánidos, su sonido es el aullido, su alimentación
es carnívora, su hábitat es el bosque y su nombre científico es
Canis lupus.
• Los leones son felinos, su sonido es el rugido, su alimentación
es carnívora, su hábitat es la sabana y su nombre científico es
Panthera leo.
• Los gatos son felinos, su sonido es el maullido, se alimenta de
ratones, su hábitat es doméstico y su nombre científico es
Felis silvestris catus.
• Crea una clase Test en la que instancies un objeto de cada
subclase implementada anteriormente y muestres las
características de cada animal.
• Posteriormente, utiliza el polimorfismo para crear cada uno de
los objetos a partir de la superclase Animal y prueba los métodos
implementados nuevamente.

 * @author Angel
 */
public class Ejercicio4 {


    public static void main(String[] args) {
        System.out.println("SUBCLASES"); //creo los 4 objetos desde las subclases con constructor parametrizado
        
        System.out.println("---Gatos---");
        Gatos gatos = new Gatos("Felix",10,20.3);
        System.out.println(gatos);
        gatos.sonido();
        gatos.alimentacion();
        gatos.habitat();
        gatos.nombreCientifico();
        
        System.out.println("---Leones---");
        Leones leones = new Leones("Mufasa",14,60.5);
        System.out.println(leones);
        leones.sonido();
        leones.alimentacion();
        leones.habitat();
        leones.nombreCientifico();
        
        System.out.println("---Lobos---");
        Lobos lobos = new Lobos("Colmillo",11,26.2);
        System.out.println(lobos);
        lobos.sonido();
        lobos.alimentacion();
        lobos.habitat();
        lobos.nombreCientifico();
        
        System.out.println("---Perros---");
        Perros perros = new Perros("Rex",9,21.4);
        System.out.println(perros);
        perros.sonido();
        perros.alimentacion();
        perros.habitat();
        perros.nombreCientifico();
        
        
        System.out.println("POLIMORFISMOS"); //creo los cuatro objetos desde la clase raiz o abuela utilizando el polimorfismo
        
        System.out.println("--Gatos--");
        Animal animalGato = new Gatos("Silver",3,4.5);
        System.out.println(animalGato);
        animalGato.sonido();
        animalGato.alimentacion();
        animalGato.habitat();
        animalGato.nombreCientifico();
        
        System.out.println("--Leon--");
        Animal animalLeon = new Leones("Skar",12,34.3);
        System.out.println(animalLeon);
        animalLeon.sonido();
        animalLeon.alimentacion();
        animalLeon.habitat();
        animalLeon.nombreCientifico();
        
        System.out.println("--Perro--");
        Animal animalPerro = new Perros("Hercules",21,23.2);
        System.out.println(animalPerro);
        animalPerro.sonido();
        animalPerro.alimentacion();
        animalPerro.habitat();
        animalPerro.nombreCientifico();
        
        System.out.println("--Lobo--");
        Animal animalLobo = new Lobos("Atreyu",20,19.2);
        System.out.println(animalLobo);
        animalLobo.sonido();
        animalLobo.alimentacion();
        animalLobo.habitat();
        animalLobo.nombreCientifico();
        
    }
    
}
