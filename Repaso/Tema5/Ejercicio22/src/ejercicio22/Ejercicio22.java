/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;

/**
 * • Ejercicio 22.- Desarrolle a un programa en JAVA en el que se creen 3
 * objetos. Cada objeto contiene como atributos el nombre de un producto de una
 * tienda de mascotas, su precio y su stock. • Utiliza un constructor para
 * establecer el nombre de cada producto, su precio y su stock. Establécelos tú
 * al crear el objeto, no hace falta que se los pidas al usuario. • Realiza un
 * método en el que le muestre al usuario un menú para que elija que producto
 * comprar y luego le pregunte cuantas unidades desea de él. Luego se le
 * preguntará si desea comprar otro producto o salir. Por último se le mostrará
 * el importe total de la compra. • Actualiza el valor del stock de un producto
 * cuando el usuario lo compre. En caso de que el usuario pida más unidades de
 * las que quedan se le avisará por pantalla del error, se le comunicarán las
 * unidades restantes y le volverá a mostrar el menú para que elija un producto.
 * Para ello, necesitarás un método para comprobar el stock, que devolverá true
 * o false en función de si hay o no hay stock suficiente.
 *
 * -- Bienvenido a mi Tienda de Mascotas – Pulse 1 para comprar Peces cuyo
 * precio es de 10 euros y el stock es de 40 unidades. Pulse 2 para comprar
 * Tortugas cuyo precio es de 4 euros y el stock es de 8 unidades. Pulse 3 para
 * comprar Canarios cuyo precio es de 15 euros y el stock es de 4 unidades. 1 Ha
 * elegido comprar Peces. ¿Cuántas unidades desea? 6 Venta Realizada con éxito.
 * ¿Desea comprar otro producto? si Pulse 1 para comprar Peces cuyo precio es de
 * 10 euros y el stock es de 34 unidades. Pulse 2 para comprar Tortugas cuyo
 * precio es de 4 euros y el stock es de 8 unidades. Pulse 3 para comprar
 * Canarios cuyo precio es de 15 euros y el stock es de 4 unidades. 2 Ha elegido
 * comprar Tortugas. ¿Cuántas unidades desea? 50 Lo sentimos, solo tenemos
 * disponibles 8 unidades. ¿Desea comprar otro producto? si Pulse 1 para comprar
 * Peces cuyo precio es de 10 euros y el stock es de 34 unidades. Pulse 2 para
 * comprar Tortugas cuyo precio es de 4 euros y el stock es de 8 unidades. Pulse
 * 3 para comprar Canarios cuyo precio es de 15 euros y el stock es de 4
 * unidades. 3 Ha elegido comprar Tortugas. ¿Cuántas unidades desea? 8 Venta
 * Realizada con éxito. ¿Desea comprar otro producto? no El total de su compra
 * asciende a 92 Euros. Muchas gracias. Vuelva cuando quiera
 *
 * @author Angel
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        boolean seguirComprando; //declaro variables boolean
        boolean stockCorrecto;
        Producto producto1 = new Producto("Peces", 10, 40); //creo objetos con constructor parametrizado del nombre el precio y el stock
        Producto producto2 = new Producto("Tortugas", 4, 8);
        Producto producto3 = new Producto("Canarios", 5, 4);
        int opcion; //declaro variables int
        int unidades;
        float precioTotal = 0; //declaro e incializo el precio total en 0 
        do { //creo bucle para eleguir una opcion al menos una vez
            opcion = menu(producto1, producto2, producto3); //guardo uno de los tres objetos en una variable
            unidades = pedirUnidades(); //llamo al metodo y guardo en una variable
            stockCorrecto = comprobarStock(producto1, producto2, producto3, opcion, unidades);
            if (stockCorrecto) {  //Si el stock es el correcto que tengo el constructor parametrizado
                precioTotal = precioTotal + formalizarCompra(producto1, producto2, producto3, opcion, unidades); //guardo en la variable el precio total y la compra de los productos con sus caracteristicas
            }
            seguirComprando = seguirComprando(); //si no es correcto llamo al metodo para que me pregunte si quiero seguir comprando
        } while (seguirComprando); //se repite el bucle mientras quiera seguir comprando
        System.out.println("El total de la compra es de " + precioTotal + " Euros."); //imprimo el total de la compra y mensaje para que vuelva
        System.out.println("Muchas gracias. Vuelva cuando quiera comprar otra mascota.");
    }

    public static int menu(Producto producto1, Producto producto2, Producto producto3) { //metodo que muestra el menu y devuelve la opcion que elige el usuario
        Scanner teclado = new Scanner(System.in); //creo objeto escaner
        int opcion; //declaro variable
        System.out.println(" Tienda de las Mascotas ");
        System.out.println("Pulsa 1 para comprar " + producto1.getNombre() + " el precio es de " + producto1.getPrecio() + " y el stock es de " + producto1.getStock() + " unidades"); //imprimo por pantalla el nombre el precio y el stock de cada producto
        System.out.println("Pulsa 2 para comprar " + producto2.getNombre() + " el precio es de " + producto2.getPrecio() + " y el stock es de " + producto2.getStock() + " unidades");
        System.out.println("Pulsa 3 para comprar " + producto3.getNombre() + " el precio es de " + producto3.getPrecio() + " y el stock es de " + producto3.getStock() + " unidades");
        System.out.print("Opción: ");
        opcion = teclado.nextInt(); //guardo en la variable la opcion eleguida
        switch (opcion) {
            case 1: //cada caso me muestra una opcion del menu a eleguir mostrandome su nombre
                System.out.println("Ha elegido comprar " + producto1.getNombre());
                break;
            case 2:
                System.out.println("Ha elegido comprar " + producto2.getNombre());
                break;
            case 3:
                System.out.println("Ha elegido comprar " + producto3.getNombre());
                break;
            default:
                System.out.println("El ejercicio supone que el usuario NUNCA se va a confundir");
        }
        return opcion; //devuelvo la opcion eleguida 
    }

    public static int pedirUnidades() { //metodo para pedir las unidades del producto y devolverla 
        Scanner teclado = new Scanner(System.in);
        int unidades;
        System.out.println("¿Cuántas unidades desea?");
        unidades = teclado.nextInt();
        return unidades;
    }

    public static boolean seguirComprando() { //metodo para pedir las unidades del producto y devolverla
        Scanner teclado = new Scanner(System.in);
        String resp;
        System.out.println("¿Desea comprar otro producto?");
        resp = teclado.nextLine();
        return resp.equalsIgnoreCase("SI");

    }

    public static boolean comprobarStock(Producto producto1, Producto producto2, Producto producto3, int opcion, int unidades) { //metodo para ver el stock con los objetos parametrizados las opciones y las unidades
        boolean stockCorrecto = true;
        switch (opcion) {
            case 1:
                if (producto1.getStock() < unidades) {
                    System.out.println("Lo sentimos, sólo tenemos " + producto1.getStock() + " unidades disponibles.");
                    stockCorrecto = false;
                }
                break;
            case 2:
                if (producto2.getStock() < unidades) {
                    System.out.println("Lo sentimos, sólo tenemos " + producto2.getStock() + " unidades disponibles.");
                    stockCorrecto = false;
                }
                break;
            case 3:
                if (producto3.getStock() < unidades) {
                    System.out.println("Lo sentimos, sólo tenemos " + producto3.getStock() + " unidades disponibles.");
                    stockCorrecto = false;
                }
                break;
            default:
                stockCorrecto = false;
        }
        return stockCorrecto;
    }

    //
    public static float formalizarCompra(Producto producto1, Producto producto2, Producto producto3, int opcion, int unidades) { //metodo que muestra el precio total de la compra en cada caso
        float precioCompra;
        switch (opcion) {
            case 1:
                precioCompra = producto1.getPrecio() * unidades;
                producto1.setStock(producto1.getStock() - unidades);
                break;
            case 2:
                precioCompra = producto2.getPrecio() * unidades;
                producto2.setStock(producto2.getStock() - unidades);
                break;
            case 3:
                precioCompra = producto3.getPrecio() * unidades;
                producto3.setStock(producto3.getStock() - unidades);
                break;
            default:
                precioCompra = 0;
        }
        System.out.println("Venta correcta.");
        return precioCompra;
    }

}
