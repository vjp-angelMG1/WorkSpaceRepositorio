/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
public class Ciudad {

    //ATRIBUTOS
    private String nombre;
    private Set<Sede> sedes;

    //CONSTRUCTORES
    //por defecto
    public Ciudad() {
        nombre = "";
        sedes = new HashSet<>();
    }
    //parametrizado
    public Ciudad(String nombre, Set<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }
    //auxiliar
    public Ciudad(String nombre) {
        this.nombre = nombre;
        sedes = new HashSet<>();
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }

    //Metodos
    
    public void mostrar(){
        System.out.println("nombre"+this.nombre);
        System.out.println("sedes"+this.sedes);
    }
    public void aniadirSede() { //Metodo para añadir una sede
        String nombreSede = pedirNombreSede(); //llamo a los metodos guardo en las variables 
        Double ingresos = pedirIngresosSede();
        sedes.add(new Sede(nombreSede, ingresos)); //añado a la lista la sede
    }

    //Metodo que muestra todas las sedes de la ciudad
    public void mostrarSedes() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            for (Sede sede : sedes) {
                System.out.println(sede.toString());
            }
        }
    }

    //Metodo que calcula la media de ingresos de todas las sedes de la ciudad
    public double ingresosMedios() {
        double total = 0;
        for (Sede sede : sedes) {
            total += sede.getIngresos();
        }
        return total / sedes.size();
    }

    //Metodo que muestra las sedes cuyos ingresos superan la media de la ciudad
    public void mostrarSedeSuperioresMedia() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            double media = ingresosMedios();
            System.out.println("La media de los ingresos es: " + media);

            boolean alguna = false;

            for (Sede sede : sedes) {
                if (sede.getIngresos() > media) {
                    System.out.println(" -" + sede.getNombreSede() + "\n -" + sede.getIngresos());
                    alguna = true;
                }
            }
            if (!alguna) {
                System.out.println("Ninguna sede supera la media");
            }
        }
    }

    
    public boolean buscarSede(String nombreSede) { //Metodo para buscar si existe una sede con ese nombre
        boolean encontrado = false;

        for (Sede sede : sedes) { //bucle para recorer las sedes 
            if (sede.getNombreSede().equalsIgnoreCase(nombreSede)) { //condicional para ver si coincide el nombre de la sede con el nombre que buscamos ignorando mayusculas y minusculas
                encontrado = true;
            }
        }
        return encontrado; //devuelve si la la sede se ha encotrado
    }

    
    public String pedirNombreSede() {  //Metodos para pedir al usuario el nombre de la sede
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre de la sede: ");
        String nombreSede = entrada.nextLine(); //guardo en la variable el nombre que le pido al usuario
        return nombreSede; //devuelvo el nombre
    }

    public Double pedirIngresosSede() { //Metodos para pedir el ingreso de la sede
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresos anuales: ");
        Double ingresos = entrada.nextDouble(); //guardo en la variable el nombre del ingreso
        return ingresos; //devuelvo el ingreso
    }

    //Metodo muestra las caracteristicas
    @Override
    public String toString() {
        return "Nombre de la ciudad: " + nombre + "Sedes: " + sedes;
    }
}