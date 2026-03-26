/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 * • Ejercicio 25.- Realiza un programa en JAVA que constará de las siguientes
 * clases: Ordenador, Servidor (hereda de Ordenador), Portátil (hereda de
 * Ordenador) y Test contiene el metodo main y otros métodos estáticos. • La
 * superclase Ordenador contiene los siguientes atributos: cantidad de memoria
 * RAM, capacidad del disco duro, modelo de procesador, modelo de tarjeta
 * gráfica y precio. A la hora de que el usuario cree un objeto, en la clase
 * Test, deberemos controlar que la capacidad del disco duro sea múltiplo de 5,
 * el modelo de procesador lo permitirá elegir entre una lista, y el precio
 * siempre sea mayor que 0. • La subclase Servidor contiene los siguientes
 * atributos: tamaño del monitor, modelo de teclado y modelo de ratón. A la hora
 * de que el usuario cree un objeto, en la clase Test, deberemos controlar que
 * el tamaño del monitor sea mayor que 14. (en caso de que el usuario no lo
 * cumpla deberemos volvérselo a pedir, tantas veces como sea necesario.) * • La
 * subclase Portátil contiene los siguientes atributos: marca, tamaño de
 * pantalla y peso. • La clase Test contendrá los métodos estáticos necesarios
 * para controlar que el usuario introduzca los datos correctos. Además,
 * contiene el método main donde se crearán 2 objetos de la clase Servidor y 2
 * de la clase Portátil mediante un constructor que reciba los parámetros.
 * También se crearán 1 objetos de la clase Servidor y 1 de la clase Portátil
 * mediante el constructor por defecto, por lo que necesitarás llamar
 * posteriormente a los métodos “establecer…” para asignar los valores que te
 * indique el usuario a los atributos del objeto. • Por último, muestra los
 * datos de los 6 objetos creados.
 *
 *
 * @author Angel
 */
public class Ejercicio25 {

    static Scanner entrada = new Scanner(System.in); //creo objeto scanner con static delante ya que donde pido el usuario es en los metodo estaticos

    public static void main(String[] args) {

        // Creo dos objetos servidores con constructor parametrizado
        Servidor servidor1 = new Servidor(16, "DDR4", pedirDisco(), pedirProcesador(), "RTX 3060", pedirPrecio(), pedirMonitor(), "Logitech", "HP");

        Servidor servidor2 = new Servidor(32, "DDR5", pedirDisco(), pedirProcesador(), "RTX 4070", pedirPrecio(), pedirMonitor(), "Corsair", "Razer");

        // Creo dos objetos portatil con constructor parametrizado
        Portatil portatil1 = new Portatil(8, "DDR4", pedirDisco(), pedirProcesador(), "Intel HD", pedirPrecio(), "HP", 15, 2);
        Portatil portatil2 = new Portatil(16, "DDR5", pedirDisco(), pedirProcesador(), "RTX 3050", pedirPrecio(), "Asus", 17, 3);

        Servidor servidor3 = new Servidor(); // creo objeto de servidor con constructor por defecto
        servidor3.setCantidadDeMemoria(64); // modifico sus valores con el set
        servidor3.setRam("DDR5");
        servidor3.setCapacidadDeDiscoDuro(pedirDisco()); //llamo al metodo para pedirle yo el valor que quiero modificar en cada set que meto un metodo
        servidor3.setModeloDeProcesador(pedirProcesador());
        servidor3.setModeloDeTarjetaGrafica("RTX 4090");
        servidor3.setPrecio(pedirPrecio());
        servidor3.setTamañoDeMonitor(pedirMonitor());
        servidor3.setModeloDeTeclado("SteelSeries");
        servidor3.setModeloDeRaton("Logitech");

        Portatil portatil3 = new Portatil(); // creo objeto de portatil con constructor por defecto
        portatil3.setCantidadDeMemoria(4); // modifico sus valores con el set 
        portatil3.setRam("DDR3");
        portatil3.setCapacidadDeDiscoDuro(pedirDisco());
        portatil3.setModeloDeProcesador(pedirProcesador());
        portatil3.setModeloDeTarjetaGrafica("Intel HD");
        portatil3.setPrecio(pedirPrecio());
        portatil3.setMarca("Lenovo");
        portatil3.setTamanioDeLaPantalla(14);
        portatil3.setPeso(2);

        // muestro los datos con metodo mostrar
        System.out.println("Servidores :");
        System.out.println("Servidor 1");
        servidor1.mostrarServidor();
        System.out.println("Servidor 2");
        servidor2.mostrarServidor();
        System.out.println("Servidor 3");
        servidor3.mostrarServidor();

        System.out.println("Portatiles :");
        System.out.println("Portatil 1 :");
        portatil1.mostrarPortatil();
        System.out.println("Portatil 2 :");
        portatil2.mostrarPortatil();
        System.out.println("Portatil 3 :");
        portatil3.mostrarPortatil();

        // muestro con toString
        System.out.println("Servidor 1 :" + servidor1.toString());
        System.out.println("Servidor 2 :" + servidor2.toString());
        System.out.println("Servidor 3 :" + servidor3.toString());
        System.out.println("Portatil 1 :" + portatil1.toString());
        System.out.println("Portatil 2 :" + portatil2.toString());
        System.out.println("Portatil 3 :" + portatil3.toString());
    }

    public static String pedirDisco() { //metodo estatico ya que pertenece a la clase para que el disco sea multiplo de 5
        int disco;
        do {
            System.out.print("Capacidad de disco (múltiplo de 5): ");
            disco = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer
        } while (disco % 5 != 0);
        return String.valueOf(disco);
    }

    public static double pedirPrecio() { //metodo estatico para ver que el precio es mayor que cero
        double precio;
        do {
            System.out.print("Precio (>0): ");
            precio = entrada.nextDouble();
            entrada.nextLine(); // limpiar buffer
        } while (precio <= 0);
        return precio;
    }

    public static String pedirProcesador() { // método estático para pedir procesador
        String procesador;
        boolean valido; // variable para controlar si el procesador es válido

        do { //repite el bucle al menos una vez
            System.out.print("Procesador (i5, i7, i9, Ryzen 5, Ryzen 7): ");
            procesador = entrada.nextLine();

            valido = procesador.equalsIgnoreCase("i5")|| procesador.equalsIgnoreCase("i7")|| procesador.equalsIgnoreCase("i9")|| procesador.equalsIgnoreCase("Ryzen 5")|| procesador.equalsIgnoreCase("Ryzen 7"); //guardo en la variable si se cumple uno otro de los procesadores

            if (!valido) { //condicional si no es distinto a los procesadores que guardo en la variable
                System.out.println("Error: Procesador no válido, prueba otra vez."); //imprimo por pantalla el error
            } else { //si no le doy validez
                System.out.println("Procesador válido"); 
            }
        } while (!valido); // repito mientras el bucle no sea valido

        return procesador; // siempre devuelve un valor válido
    }

    public static int pedirMonitor() { //metodo estatico para comprobar que el tamaño del procesador es mayo a 14 pulgadas
        int tamaño;
        do {
            System.out.print("Tamaño monitor (>14): ");
            tamaño = entrada.nextInt();
        } while (tamaño <= 14);
        return tamaño;
    }
}
