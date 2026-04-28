/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21;

/**
 * *• Ejercicio 21.- Realiza un programa en JAVA en el que le
pidas al usuario las notas de las 6 asignaturas del Ciclo de
DAM y las guarde en un fichero. Posteriormente leerá el
fichero y te calculará la nota media del curso.
• Cada una de las asignaturas serán un objeto cuyos
atributos serán el nombre y la nota.
• Con el constructor podrás asignar directamente el
nombre de la asignatura al crear el objeto. En
cambio, el atributo nota, será el usuario quien lo
introduzca mediante un método que controle que la
nota tenga un valor numérico (no letras) entre 0 y 10.
• Ejemplo de ejecución:
83
Por favor, introduzca la nota de
Programación: 6,5
Introduzca la nota de Lenguajes de
Marcas: 7,5
Introduzca la nota de Bases de Datos: 7,5
Introduzca la nota de Entornos de
Desarrollo: 8
Introduzca la nota de Sistemas
Informáticos: 6,5
Por último, introduzca la nota de
Formación y Orientación Laboral: 6
*** Notas almacenadas en el fichero ***
…Leyendo el fichero y calculando
media….
Su nota media del curso es de: 7
* 
 * @author Angel
 */
public class Asignaturas{
    //ATRIBUTOS
    private String nombre;
    private float nota;
    //por defecto
    public Asignaturas() {
        this.nombre = nombre;
        this.nota = nota;
    }
    //parametrizado
    public Asignaturas(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    public void mostrarAsignaturas(){
        System.out.println(" Nombre "+nombre);
        System.out.println(" Nota "+nota);
    }
    //metodo ToString
    @Override
    public String toString() {
        return "Asignaturas{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
