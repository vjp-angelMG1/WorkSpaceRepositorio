/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4animal; //indica que la clase pertenece al paquete "ejercicio4animal"

/**
 * Clase abstracta Animal: clase raíz de la jerarquía
 * Contiene atributos comunes, constructores, métodos abstractos y métodos concretos
 * 
 * @author Ángel
 * @since 29/11/2025
 */
public abstract class Animal {

    /**
     * @param args the command line arguments
     */
    //ATRIBUTOS
       private String nombre; //Atributo privado solo accesible desde esta clase Nombre del animal
       private int edad; // Atributo privado solo accesible desde esta clae de la edad del animal en años
       private double peso; // Atributo privado solo accesible desde esta clase del peso del animal en kilogramos
    //CONSTRUCTORES
    //Por defecto // crea un Animal sin datos, con valores inciales por defecto
    public Animal(){
    this.nombre= ""; //Inicializa el constructor por defecto con el nombre como vacío
    this.edad=0; // Inicializa el constructor por defecto con la edad en 0
    this.peso=0; // Inicializa el constructor por defdecto con el peso en 0
    }
    // Parametrizado // permite crear un animal con datos específicos
    public Animal (String nombre,int edad,double peso){
        this.edad = edad; // Inicializo el constructor parametrizado con la edad recibido del atributo de la clase
        this.nombre = nombre;//Inicializo el constructor parametrizado con el nombre recibido del atributo de la clase
        this.peso = peso; //Inicializo el constructor parametrizado con el peso recibido del atributo de la clase
    }
    //GETERS Y SETTERS 
    public String getNombre(){ // getter devuelven el valor del nombre de la clase de un atributo privado
        return this.nombre;
    }
    public void setNombre(String nombre){ // setter cambia o asigna un valor del atributo nombre de la clase de un atributo privado
        this.nombre = nombre;  
    }
    
    public int getEdad(){ // getter devuelve el valor de la edad de la edad de la clase de un atributo privado
        return this.edad;
    }
    public void setEdad(int edad){ //setter cambia o asigna un valor del atributo edad de la clase de un atributo privado
        this.edad = edad;    
    }
    public  double getPeso(){ //getter devuelve el valor del peso de la clase de un atributo privado
        return this.peso;
    }
    public void setPeso(double peso){ //setter cambia o asigna un valor del atributo peso de la clase de un atributo privado
        this.peso = peso;
    }
    //MÉTODOS
    public abstract void sonido(); //Metodo abstracto para mostrar el sonido del animal
    public abstract void alimentacion();//Método abstracto para mostrar la alimentación del animal
    public abstract void habitat(); //Método abstracto para mostrar el hábitat del animal
    public abstract void nombreCientifico(); //Método abstracto para mostrar el nombre científico del animal
    
    //MÉTODO NO ABSTRACTO // Muestra toda la información del animal de forma mas organizada
    public void mostrarTodo() {
    System.out.println("Nombre: " + getNombre()); //Muestra el nombre usando el getter
    System.out.println("Edad: " + getEdad() + " años"); //Muestra la edad usando el getter
    System.out.println("Peso: " + getPeso() + " Kg"); //Muestra el peso usando el getter
    System.out.print("Sonido: "); sonido();           //Llama al método sonido de la subclase
    System.out.print("Alimentación: "); alimentacion(); //Llama al método alimentacion de la subclase
    System.out.print("Hábitat: "); habitat(); //Llama al método habitat de la subclase
    System.out.print("Nombre científico: "); nombreCientifico(); //Llama al método nombreCientifico de la subclase
    System.out.println("--------------------------------------"); //Muestra de manera separada cada animal
    }
 
    @Override //Permite mostrar datos básicos del animal
    public String toString(){
       return this.nombre + "tiene" + this.edad + "años y pesa" + this.peso + "Kg";
    }
}
