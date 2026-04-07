/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 * *• Ejercicio 08.- Una importante empresa multinacional nos ha 
solicitado un programa para gestionar las distintas sedes que tiene 
repartidas a lo largo del mundo. Para ello, dispondremos de un 
arrayList de ciudades. De cada ciudad, almacenaremos su nombre y 
un conjunto de sedes (elige el tipo de conjunto que prefieras). 
• De cada sede almacenaremos el nombre de la sede y sus ingresos 
anuales.
* • Implementa las siguientes opciones para el software: 
• Añadir una ciudad (al menos pediremos los datos de una sede. Después de 
añadir cada sede, preguntaremos al usuario si desea seguir añadiendo sedes). 
• Mostrar todas las ciudades junto con sus sedes. 
• Método que muestre el nombre de las sedes cuyos ingresos anuales son 
superiores a la media. 
• Buscar por nombre de sede. (El método retornará un booleano). 
• Añadir sede (pediremos el nombre de la ciudad y, si ésta existe en el arrayList, 
pediremos los datos de la nueva sede y los insertaremos). 
• Mostrar todas las sedes ordenadas de mayor a menor número de ingresos 
anuales (PISTA: Utiliza una estructura de datos donde ir añadiendo todas las 
sedes de manera ordenada).
* 
 * @author Angel
 */
public class Sede {
    //ATRIBUTOS
    private String nombreSede;
    private double ingresos;
    
    //CONSTRUCTORES
    //por defecto
    public Sede() {
        nombreSede = "";
        ingresos = 0;
    }
    //parametrizado
    public Sede(String nombreSede, double ingresos) {
        this.nombreSede = nombreSede;
        this.ingresos = ingresos;
    }
    
    //Getters/Setters
    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    //Metodo mostrar
    public void mostrar(){
        System.out.println("nombre de la sede"+this.nombreSede);
        System.out.println("ingresos "+this.ingresos);
    
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Nombre de la sede: " + nombreSede + "\nIngresos: " + ingresos;
    }
}
