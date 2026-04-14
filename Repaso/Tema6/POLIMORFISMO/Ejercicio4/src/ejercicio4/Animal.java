/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 * • Ejercicio 4. – Realiza un programa en JAVA, orientado a objetos, en el que
 * modeles una jerarquía de animales con las siguientes características: •
 * Animal es la clase raíz y contiene los atributos nombre, edad, y peso. Esta
 * clase debe tener métodos abstractos para mostrar el sonido, la alimentación,
 * el hábitat y el nombre científico del animal. • Los cánidos y los felinos son
 * subclases de Animal. • Los perros son cánidos, su sonido es el ladrido, su
 * alimentación es carnívora, su hábitat es doméstico y su nombre científico es
 * Canis lupus familiaris. • Los lobos son cánidos, su sonido es el aullido, su
 * alimentación es carnívora, su hábitat es el bosque y su nombre científico es
 * Canis lupus. • Los leones son felinos, su sonido es el rugido, su
 * alimentación es carnívora, su hábitat es la sabana y su nombre científico es
 * Panthera leo. • Los gatos son felinos, su sonido es el maullido, se alimenta
 * de ratones, su hábitat es doméstico y su nombre científico es Felis
 * silvestris catus. • Crea una clase Test en la que instancies un objeto de
 * cada subclase implementada anteriormente y muestres las características de
 * cada animal. • Posteriormente, utiliza el polimorfismo para crear cada uno de
 * los objetos a partir de la superclase Animal y prueba los métodos
 * implementados nuevamente.
 *
 * @author Angel
 */
public abstract class Animal {

    //ATRIBUTOS
    private String nombre;
    private int edad;
    private double peso;

    //CONSTRUCTORES
    //por defecto
    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0.0;
    }

    //parametrizado
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //metodo abstractos
    public abstract void sonido();

    public abstract void alimentacion();

    public abstract void habitat();

    public abstract void nombreCientifico();
    
    //metodo mostrar
    public void mostrarAnimal(){
        System.out.println("Nombre :"+this.nombre);
        System.out.println("Edad :"+this.edad);
        System.out.println("Peso :"+this.peso);
    }
    
    //metodo ToString
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
}
