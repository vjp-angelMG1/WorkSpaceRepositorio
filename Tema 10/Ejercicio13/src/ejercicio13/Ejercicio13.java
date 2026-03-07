/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *Ejercicio 13.- Realiza un programa en el almacenes una lista de objetos de la clase VENTA cuyos
atributos son 2:
• Nombre de Mes.
• Ventas de coches del mes.
• Se mostrará un menú en el que se le ofrezcan al usuario las siguientes opciones:
1. Introducir las ventas de coches de cada uno de los meses del año .
2. Mostrar las ventas introducidas en el punto anterior.
3. Que muestre la suma total de ventas de coches del año.
4. Que muestre las ventas totales de los meses que empiezan por la letra A. (Utiliza el método correspondiente de
la clase String)
5. 5.- Que muestre el nombre del mes con más ventas.
6. 6.- Salir del programa.
• Controlaremos que el usuario elija una opción del menú entre 1 y 6.
• Hasta que el usuario no pulse 6 no saldremos del programa.

 * @author Angel
 */

public class Ejercicio13 {


    public final static int MESES = 12;  //constante con numero de meses del año

    public static void main(String[] args) {  //metodo principal que ejecuta el programa
        Scanner entrada = new Scanner(System.in);  //creo objeto Scanner para leer
        ArrayList<Venta> ventas = new ArrayList<>();  //lista de objetos Venta
        int opcion = 0;  //variable para guardar opcion del menu
        
        do {  //bucle que se repite al menos una vez
            try {  //bloque try para capturar errores
                opcion = menu(entrada);  //muestro menu y guardo opcion
                switch (opcion) {  //switch para ejecutar opcion elegida
                    case 1 :
                        ventas = rellenarVentas(entrada);  //guardo en la variable ventas el resultado al llamar al metodo
                        break; //paro el caso 1
                    case 2 :
                        mostrarVentas(ventas); //llamo al metodo para mostrar
                        break;
                    case 3 : 
                        sumaVentas(ventas); //llamo al metodo para la suma total4
                        break;
                    case 4 : 
                        ventasMesesA(ventas); //llamo al metodo para que me muestre la venta de los que empiecen por A 
                        break;
                    case 5 :
                        mesesConMasVentas(ventas); //llamo al metodo para que muestre los meses con mas ventas 
                        break;
                    case 6 :
                        System.out.println("Saliendo..."); // salir
                        break;
                        
                    default :
                        System.out.println(" Error opcion no valida"); //Imprimo el error 
                }

            } catch (InputMismatchException e) {  //capturo el error al introducir una letra
                System.out.println("Error, introducir una opcion existente");  //imprimo por pantalla el error
                entrada.next();  //limpio el buffer del Scanner
            }

        } while (opcion != 6);  //repito mientras opcion sea distinta de 6
    }

    public static int menu(Scanner entrada) {  //metodo para mostrar el menu y devolver la opcion elegida
        System.out.println("1. Introducir las ventas");  //imprimo por pantalla el menu
        System.out.println("2. Mostrar las ventas");     
        System.out.println("3. Suma total de ventas");   
        System.out.println("4. Ventas meses que empiezan por A"); 
        System.out.println("5. Mes con mas ventas");     
        System.out.println("6. Salir");                  
        System.out.print("Elige opcion: ");             
        return entrada.nextInt();  //leo y devuelvo la opcion
    }
    
    
    public static ArrayList<Venta> rellenarVentas(Scanner entrada) {  //metodo para rellenar lista con parametros
        ArrayList<Venta> ventas = new ArrayList<>();  //creo nueva lista vacia
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};  //array con nombres meses
        
        for (int i = 0; i < MESES; i++) {  //bucle for para 12 meses
            System.out.print("Ventas " + meses[i] + ": ");  //imprimo mes actual
            int ventasMes = entrada.nextInt();  //guardo en la variable el numero de ventas que le introduzco al usuario
            entrada.nextLine();  //limpio buffer del Scanner
            ventas.add(new Venta(meses[i], ventasMes));  //creo objeto Venta y añado a lista
        }
        return ventas;  //devuelvo lista completa
    }
    
    public static void mostrarVentas(ArrayList<Venta> ventas) {  //metodo para mostrar la lista de todas las ventas con parametros
        if (ventas.isEmpty()) {  //condicional si la lista esta vacia
            System.out.println("No hay ventas registradas");  //mensaje si esta vacia
        }
        for (int i = 0; i < ventas.size(); i++) {  //bucle para recorrer lista
            System.out.println(ventas.get(i).toString());  //imprimo cada objeto Venta
        }
    }
    

    public static void sumaVentas(ArrayList<Venta> ventas) {  //metodo para sumar el total de ventas
        if (ventas.isEmpty()) {  //condicional si lista vacia
            System.out.println("No hay ventas registradas");  //mensaje error
            return;  //salgo del metodo
        }
        int suma = 0;  //variable para acumular suma
        for (int i = 0; i < ventas.size(); i++) {  //bucle para sumar todas
            suma += ventas.get(i).getVentas();  //sumo las ventas del objeto
        }
        System.out.println("Total ventas: " + suma + " coches");  //imprimo por pantalla el total de ventas
    }


    public static void ventasMesesA(ArrayList<Venta> ventas) {  //metodo para meses que empiezan con A
        if (ventas.isEmpty()) {  //condicional si lista vacia
            System.out.println("No hay ventas registradas");  //imprimo mensaje de error
        }
        System.out.println("Meses que empiezan por A:");  //titulo
        for (int i = 0; i < ventas.size(); i++) {  //bucle para recorrer meses
            
            if (ventas.get(i).getNombreMes().toLowerCase().startsWith("a")) {//condicional: si el mes empieza por 'a' minuscula
                System.out.println(ventas.get(i).toString());  //imprimo ese mes
            }
        }
    }
    
    public static void mesesConMasVentas(ArrayList<Venta> ventas) {  //metodo para mes maximo con parametros
        if (ventas.isEmpty()) {  //condicional si lista vacia
            System.out.println("No hay ventas registradas");  //mensaje error
        }
        
        //PRIMERA PASADA: encuentro la venta maxima
        int maximo = 0;  //variable para guardar maxima venta
        for (int i = 0; i < ventas.size(); i++) {  //recorro toda la lista
            if (ventas.get(i).getVentas() > maximo) {  //si encuentro mayor
                maximo = ventas.get(i).getVentas();  //actualizo el maximo
            }
        }
        
        //SEGUNDA PASADA: muestro TODOS los meses con ese maximo
        System.out.println("Mes con mas ventas (" + maximo + "):");  //imprimo titulo
        for (int i = 0; i < ventas.size(); i++) {  //recorro otra vez
            if (ventas.get(i).getVentas() == maximo) {  //si coincide con maximo
                System.out.println(ventas.get(i).getNombreMes());  //imprimo mes
            }
        }
    }
}