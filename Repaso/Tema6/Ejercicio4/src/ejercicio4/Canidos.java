/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 * *• Ejercicio 4. – Realiza un programa en JAVA, orientado a objetos,
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
* 
 * @author Angel
 */
public abstract class Canidos extends Animal{
     //no tiene atributos
    //CONSTRUCTORES
    //por defecto
    public Canidos(){
        super();
    }

    //parametrizado
    public Canidos(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String toString() {
        return super.toString()+"Canidos{" + '}';
    }
    
}
