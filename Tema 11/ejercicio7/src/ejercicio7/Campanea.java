/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Angel
 */
public class Campanea {
    //ATRIBUTOS
    private Set<Donacion> donaciones; //Conjunto de donaciones
    private String nombre;            //Nombre de la campaña

    //CONSTRUCTOR POR DEFECTO
    public Campanea() {
        donaciones = new HashSet<>();
        nombre = "";
    }

    //CONSTRUCTOR PARAMETRIZADO CON NOMBRE
    public Campanea(String nombre) {
        this.nombre = nombre;
        donaciones = new HashSet<>();
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
    public void aniadirDonacion(Scanner entrada) { //Metodo para añadir donacion en el conjunto
        System.out.println();
        System.out.print("Nombre donante: "); //Pido el nombre del donante
        String nombreDonante = entrada.nextLine();

        System.out.print("Cantidad que va a donar: "); //Pido la cantidad
        float cantidad = entrada.nextFloat();
        entrada.nextLine(); //Limpiar buffer

        donaciones.add(new Donacion(nombreDonante, cantidad)); //Añado al conjunto
        System.out.println("Donación agregada correctamente.");
    }

    public void mostrarDonaciones() { //Metodo para mostrar las donaciones registradas
        System.out.println();
        if (donaciones.isEmpty()) { //Condicional para comprobar si no hay donaciones
            System.out.println("No hay donaciones");
        } else { //Si hay donaciones
            for (Donacion donacion : donaciones) { //Recorro el conjunto
                System.out.println(donacion.toString()); //Muestro cada donacion
            }
        }
    }

    public void buscarPorNombre(String nombreBuscado) { //Metodo que busca una donacion por nombre
        System.out.println();
        boolean encontrado = false;

        for (Donacion dona : donaciones) { //Recorro el conjunto de donaciones
            if (dona.getNombrePersona().equalsIgnoreCase(nombreBuscado)) { //Si coincide el nombre
                System.out.println("La cantidad es de " + dona.getCantidad()); //Muestro cantidad
                encontrado = true; //Se encontro la donacion
            }
        }

        if (!encontrado) { //Si no se encontro
            System.out.println("No existe una donacion con el nombre que se busca");
        }
    }

    public int numeroDonaciones() { //Metodo que devuelve el total de donaciones
        return donaciones.size();
    }

    public float totalRecaudado() { //Metodo para calcular el total de las donaciones
        float total = 0;
        for (Donacion donacion : donaciones) { //Recorro el conjunto
            total += donacion.getCantidad(); //Sumo cada cantidad
        }
        return total;
    }

    public float mayorDonacion() { //Metodo que devuelve la mayor donacion de la campaña
        float mayor = 0;
        for (Donacion d : donaciones) { //Recorro el conjunto
            if (d.getCantidad() > mayor) { //Si es mayor que la actual
                mayor = d.getCantidad();
            }
        }
        return mayor;
    }

    public void ordenarDonaciones() { //Metodo para ordenar las donaciones de mayor a menor
        if (donaciones.isEmpty()) { //Si no hay donaciones
            System.out.println("No hay donaciones");
            return;
        }
       
        Donacion[] vectorDonacion = donaciones.toArray(new Donacion[0]); //Convierto el conjunto en un array para poder ordenarlo

        for (int i = 1; i < vectorDonacion.length; i++) { //recorro el bucle for para ordenarlo por insercion
            Donacion actual = vectorDonacion[i];
            int j = i - 1;
            while (j >= 0 && vectorDonacion[j].getCantidad() < actual.getCantidad()) {
                vectorDonacion[j + 1] = vectorDonacion[j];
                j--;
            }
            vectorDonacion[j + 1] = actual;
        }

        System.out.println("Donaciones en orden de mayor a menor:");
        for (int i = 0; i < vectorDonacion.length; i++) { //Recorro el array
            System.out.println(vectorDonacion[i].toString()); //Muestro cada donacion
        }
    }
}
