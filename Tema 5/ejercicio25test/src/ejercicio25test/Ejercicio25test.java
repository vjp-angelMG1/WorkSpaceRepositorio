/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25test;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio25test {

    /**
     * @param args the command line arguments
     */

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===== CREAR 2 SERVIDORES (CONSTRUCTOR PARAMETRIZADO) =====");
        Servidor s1 = crearServidorParametrizado();
        Servidor s2 = crearServidorParametrizado();

        System.out.println("===== CREAR 2 PORTÁTILES (CONSTRUCTOR PARAMETRIZADO) =====");
        Portatil p1 = crearPortatilParametrizado();
        Portatil p2 = crearPortatilParametrizado();

        System.out.println("===== CREAR 1 SERVIDOR (CONSTRUCTOR POR DEFECTO + SETTERS) =====");
        Servidor s3 = crearServidorPorDefecto();

        System.out.println("===== CREAR 1 PORTATIL (CONSTRUCTOR POR DEFECTO + SETTERS) =====");
        Portatil p3 = crearPortatilPorDefecto();

        // MOSTRAR LOS 6 OBJETOS
        System.out.println("========== MOSTRANDO LOS 6 OBJETOS ==========");
        System.out.println("Servidor 1: " + s1);
        System.out.println("Servidor 2: " + s2);
        System.out.println("Servidor 3: " + s3);

        System.out.println("Portátil 1: " + p1);
        System.out.println("Portátil 2: " + p2);
        System.out.println("Portátil 3: " + p3);
    }


    // -------------------------------------------------------------------------
    // ---------------------- MÉTODOS PARA CREAR ORDENADOR ---------------------
    // -------------------------------------------------------------------------

    public static int pedirRAM() {
        System.out.println("Introduce la memoria RAM (GB): ");
        return entrada.nextInt();
    }

    public static int pedirCapacidadDisco() {
        int disco;
        do {
            System.out.println("Introduce la capacidad del disco duro (múltiplo de 5): ");
            disco = entrada.nextInt();
            if (disco % 5 != 0)
                System.out.println("ERROR → Debe ser múltiplo de 5.");
        } while (disco % 5 != 0);
        
        return disco;
    }

    public static String elegirProcesador() {
        
        System.out.println("Elige un modelo de procesador:");
        System.out.println("1. Intel i5");
        System.out.println("2. Intel i7");
        System.out.println("3. AMD Ryzen 5");
        System.out.println("4. AMD Ryzen 7");

        int opcion;
        String mp = "";

        do {
            System.out.println("Opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: mp = "Intel i5";
                
                break;
                
                case 2: mp = "Intel i7";
                
                break;
                
                case 3: mp = "Ryzen 5"; 
                
                break;
                
                case 4: mp = "Ryzen 7";
                
                break;
                
                default:
                    System.out.println("Error,Opción no válida.");
            }
        } while (opcion < 1 || opcion > 4);

        entrada.nextLine(); // limpiar 
        return mp;
    }

    public static double pedirPrecio() {
        double precio;
        do {
            System.out.println("Introduce el precio (>0): ");
            precio = entrada.nextDouble();
            if (precio <= 0)
                System.out.println("ERROR → El precio debe ser mayor que 0.");
        } while (precio <= 0);
        return precio;
    }


    // -------------------------------------------------------------------------
    // ------------------------ CREAR SERVIDOR ---------------------------------
    // -------------------------------------------------------------------------

    public static Servidor crearServidorParametrizado() {
        int ram = pedirRAM();
        int disco = pedirCapacidadDisco();
        String procesador = elegirProcesador();

        System.out.println("Introduce modelo de tarjeta gráfica: ");
        String grafica = entrada.nextLine();

        double precio = pedirPrecio();

        double tamMonitor;
        do {
            System.out.println("Introduce tamaño del monitor (>14 pulgadas): ");
            tamMonitor = entrada.nextDouble();
            if (tamMonitor <= 14)
                System.out.println("ERROR → Debe ser mayor de 14.");
        } while (tamMonitor <= 14);

        entrada.nextLine(); // limpiar buffer

        System.out.println("Introduce modelo de teclado: ");
        String teclado = entrada.nextLine();

        System.out.println("Introduce modelo de ratón: ");
        String raton = entrada.nextLine();

        return new Servidor(ram, disco, procesador, grafica, precio, tamMonitor, teclado, raton);
    }


    public static Servidor crearServidorPorDefecto() {
        Servidor servidor = new Servidor();

        servidor.setMemoriaRAM(pedirRAM());
        servidor.setCapacidadDiscoDuro(pedirCapacidadDisco());
        servidor.setModeloProcesador(elegirProcesador());

        System.out.println("Introduce modelo de tarjeta gráfica: ");
        entrada.nextLine();
        servidor.setModeloTarjetaGrafica(entrada.nextLine());

        servidor.setPrecio(pedirPrecio());

        double tamMonitor;
        do {
            System.out.println("Introduce tamaño del monitor (>14): ");
            tamMonitor = entrada.nextDouble();
        } while (tamMonitor <= 14);

        servidor.setTamanioMonitor(tamMonitor);

        entrada.nextLine();
        System.out.println("Introduce modelo de teclado: ");
        servidor.setModeloTeclado(entrada.nextLine());

        System.out.println("Introduce modelo de ratón: ");
        servidor.setModeloRaton(entrada.nextLine());

        return servidor;
    }

    // -------------------------------------------------------------------------
    // ------------------------ CREAR PORTÁTIL ---------------------------------
    // -------------------------------------------------------------------------

    public static Portatil crearPortatilParametrizado() {

        System.out.println("Introduce memoria RAM: ");
        int ram = entrada.nextInt();

        int disco = pedirCapacidadDisco();

        String procesador = elegirProcesador();

        System.out.println("Introduce modelo de tarjeta gráfica: ");
        String grafica = entrada.nextLine();

        double precio = pedirPrecio();

        entrada.nextLine(); // buffer
        System.out.println("Introduce marca del portátil: ");
        String marca = entrada.nextLine();

        System.out.println("Introduce tamaño de pantalla: ");
        double pantalla = entrada.nextDouble();

        System.out.println("Introduce el peso: ");
        double peso = entrada.nextDouble();

        return new Portatil(ram, disco, procesador, grafica, precio, marca, pantalla, peso);
    }

    public static Portatil crearPortatilPorDefecto() {

        Portatil portatil = new Portatil();

        System.out.println("Introduce memoria RAM: ");
        portatil.setMemoriaRAM(entrada.nextInt());

        portatil.setCapacidadDiscoDuro(pedirCapacidadDisco());

        portatil.setModeloProcesador(elegirProcesador());

        entrada.nextLine();
        System.out.println("Introduce tarjeta gráfica: ");
        portatil.setModeloTarjetaGrafica(entrada.nextLine());

        portatil.setPrecio(pedirPrecio());

        entrada.nextLine();
        System.out.println("Introduce marca del portátil: ");
        portatil.setMarca(entrada.nextLine());

        System.out.println("Introduce tamaño de pantalla: ");
        portatil.setTamanoPantalla(entrada.nextDouble());

        System.out.println("Introduce peso: ");
        portatil.setPeso(entrada.nextDouble());

        return portatil;
    }

    
}
