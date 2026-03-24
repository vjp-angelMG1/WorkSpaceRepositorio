/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Angel
 */
public class Campanea {
    //ATRIBUTOS

    private Set<Donacion> donaciones;
    private String nombre;

    //CONSTRUCTOR POR DEFECTO 
    public Campanea() {
        donaciones = new HashSet<>();
        nombre = "";
    }
    //CONSTRUCTOR PARAMETRIZADO

    public Campanea(Set<Donacion> donaciones, String nombre) {
        this.donaciones = donaciones;
        this.nombre = nombre;
    }

    //GETTERS Y SETTERS
    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //METODOS
    public void aniadirDonacion() { //Metodo para añadir donacion en el conjunto
        System.out.println();
        String nombre = pedirNombre(); //guardo en la variable la cantidad que calculo en el metodo en que la llamo
        float cantidad = pedirCantidad(); //guardo en la variable la cantidad que calculo en el metodo en la que la llamo
        donaciones.add(new Donacion(nombre, cantidad)); //añado a la lista la donacion con su nombre y la cantidad
    }

    public void mostrarDonaciones() { //Metodo para mostrar las donaciones que se han registrado
        System.out.println();
        if (donaciones.isEmpty()) { //condicional para comprobar si no hay registros de las donaciones
            System.out.println("No hay donaciones");
        } else { //si no 
            for (Donacion donacion : donaciones) { //recorro bucle for
                System.out.println(donacion.toString()); //muestro por pantalla las donaciones
            }
        }
    }

    public void buscarPorNombre() { //metodo que busca una donacion por el nombre
        System.out.println();
        String nombreBuscado = nombreABuscar();

        boolean encontrado = false;

        for (Donacion dona : donaciones) { //bucle for para recorrer las donaciones
            if (dona.getNombrePersona().equalsIgnoreCase(nombreBuscado)) { //condicional si coincide el nombre que se busca con la donacion de la persona
                System.out.println("La cantidad es de " + dona.getCantidad()); //muestro la cantidad
                encontrado = true; //devuelvo un valor positivo
            }
        }
        if (!encontrado) { //condicional si no lo encuentro
            System.out.println("No existe una donacion con el nombre que se busca");
        }
    }

    public int numeroDonaciones() { //metodo que el devuelve el total
        return donaciones.size();
    }

    public float totalRecaudado() { //metodo para calcular el total de las donaciones
        float total = 0;
        for (Donacion donacion : donaciones) { //recorro con bucle for las donaciones
            total += donacion.getCantidad(); //guardo en la variable el total de las donaciones
        }
        return total;
    }

    public void ordenarDonaciones() { //metodo para ordenar las donaciones de mayor a menor

        if (donaciones.isEmpty()) { //condiconal para ver que no hay doanciones 
            System.out.println("No hay donaciones ");
        } else {

            Donacion[] vectorDonacion = new Donacion[donaciones.size()]; //hago un array apartir del conjunto para que me permita ordenarlo

            donaciones.toArray(vectorDonacion); //voy llenando el array con los elementos de la colecion

            for (int i = 1; i < vectorDonacion.length; i++) { //utilizo bucle for para recorrer el array
                Donacion actual = vectorDonacion[i]; //muestro el orden y lo guardo en la variable ordenandolo de mayor a menor
                int j = i - 1;

                while (j >= 0 && vectorDonacion[j].getCantidad() < actual.getCantidad()) { //bucle para recorrer el vector y mover los elementos que son menores a la derecha
                    vectorDonacion[j + 1] = vectorDonacion[j];
                    j--;
                }
                vectorDonacion[j + 1] = actual; //inserto la donacion en la posicion que pertenece
            }
            System.out.print("Donaciones en orden");
            for (int i = 0; i < vectorDonacion.length; i++) { //recorro el array 
                System.out.println(vectorDonacion[i].toString()); //muestro la ordenacion 
            }
        }
    }

    public String pedirNombre() { //metodo para pedir nombre que me devuelve un nombre
        Scanner entrada = new Scanner(System.in); //creo scanner
        System.out.print("Nombre donante: ");
        String nombre = entrada.nextLine();
        return nombre;
    }

    public float pedirCantidad() { //metodo para pedir cantidad que me devuelve una cantidad 
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad que va a donar: ");
        float cantidad = entrada.nextFloat();
        return cantidad;
    }

    public String nombreABuscar() { //metodo para pedir nombre que me devuelve un nombre
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre que voy a buscar: ");
        String nombre = entrada.nextLine();
        return nombre;
    }

    //Metodo to String
    @Override
    public String toString() {
        return "Donaciones: " + donaciones + "Nombre: " + nombre;
    }
}
