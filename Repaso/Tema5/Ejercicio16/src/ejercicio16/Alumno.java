/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author Angel
 */
public class Alumno {
    // Atributos 
    private String nombre;
    private int nota;
    
    //Constructor por defecto
    public Alumno(){
        this.nombre= "";
        this.nota= 0;
    }
    // Constructor parametrizado
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String obtenerCalificacion() { //metodo  que devuelve la calificacion en el texto
        if (nota < 0 || nota > 10) { //condicional si la nota es menor que 0 o mayo que 10
            return "Nota incorrecta"; //devuelve el string con el mensaje que la nota es incorrecta
        } else if (nota <= 4) { //si no la nota es menor o igual que menos 4
            return "Suspenso"; //devuelve el suspenso
        } else if (nota <= 6) { //si es menor que 6 
            return "Bien"; //devuelve la nota bien
        } else if (nota <= 8) { //si es menor que 8 
            return "Notable"; //devuelve la nota notable 
        } else { //si no 
            return "Sobresaliente"; //devuelve sobresaliente
        }
    }


    public void mostrar() { //metodo para mostrar por pantalla 
        System.out.println("Alumno: " + nombre + " | Nota: " + nota + " | Calificación: " + obtenerCalificacion()); //muestro por pantalla el nombre la nota y llamo al metodo para mostrar el valor de la nota devolviendome el valor 
    }

    @Override
    public String toString() { //metodo toStringg que me devuelve el valor con la informacion del objeto
        return "Alumno{nombre='" + nombre +
                "', nota=" + nota +
                ", calificacion='" + obtenerCalificacion() + "'}";
    }
    
}
