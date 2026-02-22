/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriatema10clasesenvoltorio;

import java.util.ArrayList; //Importo la clase ArrayList que viene del paquete java.util

/**
 * Importante: En las estructuras de datos dinamicas solamente podemos guardar
 * objetos no podemos guardar tipos de datos simples por eso utilizamos la
 * conversion AutoUnBoxing.
 *
 * @author Ángel
 */
public class TeoriaTema10ClasesEnvoltorio {

    public static void main(String[] args) {
        // 0. CLASES ENVOLTORIO (WRAPPER): envuelve un tipo de dato simple en un objeto
//        int edad = 20;              //tipo de dato primitivo o simple
//        Integer edadInteger = edad; //Autoboxing  //Envuelve el tipo de dato primitivo o simple para crear un objeto para int es Integer(Funciona igual con todos tipos de datos cambiando a Mayuscula la primera letra excepto int)
//        int edad2 = edadInteger; //AutoUnBoxing //Aqui realiza la conversion al contrario es decir de Integer a Int convirtiendolo de un objeto a un dato simple
//        
//        System.out.println(edadInteger);
//        System.out.println(edadInteger.getClass()); //muestra por pantalla la clase de edadInteger
//        
//        
//       String edadString = String.valueOf(edad); //me convierte el numero entero 20 en un String con el método valueOf
//        System.out.println(edadString); //Imprimo por pantalla y da 20 transformando el numero en String
//        System.out.println(edadString.getClass()); //Si imprimo la clase estoy imprimiendo un String no un Int
//        
//        String pass = "1234";  // Variable de tipo String que es contraseña numérica
//        System.out.println(pass + 5); //Imprimo me salde diferente al ser un estring aqui se concatena y no se suma al ultimo valor como si fuera el passInt de  abajo
//        int passInt = Integer.parseInt(pass); //paso por parametro la variable que quiero convertir de String a int guardandolo en la variable int
//        System.out.println(passInt + 5); //imprimo me sale la variable en int sumandole 5
//        
//        String edadString2 = Integer.toString(edad); //guardo en una variable la edad de 20 como String llamado a la clase envoltorio Integer con el método estacico ToString y paso por parametro el valor que quiero convertir a String
//        System.out.println(edadString2); //Imprimo por pantalla la variable edadString2
//        System.out.println(edadString2.getClass());//para saber si es un String o un int nos devuelve el valor con getClass
//        

        //1. ARRAYLIST
        // 1.1. Crear un array
        ArrayList<Integer> edades = new ArrayList<>(); //Al array se le añade el tipo de dato que vamos almacenar Integer (nunca se pone int)en una lista de edades //Inicializando un ArrayList por defecto () los parentesis por que es un objeto el constructor por defecto //variable edades que apunta estrucutra de datos = new ArrayList<>() 

        //1.2. Insertar
        //1.2.1. Insertar un elemento al final
        edades.add(1);                              //llamo a la variable que apunta a mi ArrayList y le indicion el valor que quiera añadir en este caso 1 //esto es un dato simple pero gracias al autoboxing se esta convirtiendo a integer //Esto hace que mi autoboxing tenga ya un nodo con un 1
        edades.add(8);
        edades.add(7);                              //Ahora tengo en mi ArrayList tres nodos uno con 1 otro con 8 y otro con 7
        edades.add(3);

        //1.2.2. Insertar un elemento en un índice
        edades.add(1, 5); //Para insertar el objeto con valor 5 en el indice 1

        //1.3. Obtener
        System.out.println(edades.get(1)); //como obtenemos un valor de nuestro Arraylist edades es un Arraylist y es un objeto utilizamos edades.get //en get tiene que ser el de index ya que le voy a indicar el elemento que quiero obtener en este caso el 1
        System.out.println(edades.get(0)); //quiero obtener en el indice 0, llamo al el elemento de indice 0

        for (Integer edad : edades) { //Mostrar todos los elementos de mi array con bucle for
            System.out.print(edad); //Imprimo por pantalla la edad actual
        }
        System.out.println("");
        //1.4. Modificar un elemento 
        edades.set(0, 3);
        for(Integer edad : edades){ //Mostrar todos los elementos de mi array con bucle for
            System.out.print(edad); //Imprimo por pantalla la edad actual en la que al imprimir se ve por pantalla que hemos modificado el 1 por el 3
        }
        System.out.println("");
        //1.5. Eliminar
        //1.5.1. Eliminar 1 elemento por su indice
//        edades.remove(0); //Eliminar el elemento que tenemos en el indice 0 que es el hemos modificado
//        for(Integer edad : edades){ //Mostrar todos los elementos de mi array con bucle for
//            System.out.print(edad); //Imprimo por pantalla la edad actual y no aparece el que antes de moficar a 3 era 1
//        }

        //1.5.2. Eliminar un objeto concreto
//        edades.remove(new Integer(3));  //a la hora de pasar por parametros no pasar solo el numero ya que elimina el indice que esta en el objeto y no el objeto para eliminar el objeto tengo que pasarle por parametro el objeto (new Integer(3)) esto elimina de la lista el objeto
//        for(Integer edad : edades){ //Mostrar todos los elementos de mi array con bucle for
//            System.out.print(edad); //Imprimo por pantalla la edad actual
//            
//        }
        //1.5.3. Eliminar todos los elementos 
//        edades.clear(); //limpiarla por completo dejarla vacia
//        for (Integer edad : edades) { //Mostrar todos los elementos de mi array con bucle for
//            System.out.print(edad); //Imprimo por pantalla la edad actual
//        }
//        System.out.println("");
        //1.6. Saber si está vacia
        if (edades.isEmpty()) {     //devuelve un true o un false en funcion de como esta la lista 
            System.out.println("El ArrayList está vacio"); //imprimo por pantalla si esta vacia
        } else {
            for (Integer edad : edades) { //Mostrar todos los elementos de mi array con bucle for
                System.out.print(edad); //Imprimo por pantalla la edad actual
            }
        }
        System.out.println("");
        //1.7. Saber su Tamaño
        System.out.println("El tamaño del ArrayList es: "+edades.size()); //size da el tamaño de la lista el tamaño va variando dependiendo de los valores que añada o los valores que elimine es distinto a los array que son estructuras de datos estaticas
        
        //1.9. Contiene
        System.out.println(edades.contains(new Integer(0)));//el parametro tiene que ser un objeto esto me me va devolver un true o un false dependiendo de la lista tiene un objeto de valor 3 en este caso true si es 0 me devolvera un false
        
        //1.10. Obtener el índice de un elemento
        //1.10.1. Obtener el primer índice
        System.out.println(edades.indexOf("El indice del número 3 es: "+ new Integer(3))); //Me devuelve el indice de valor 3 del objeto que tenemos guardado en edades que es 0
        System.out.println(edades.indexOf("El indice del número 3000 es:"+new Integer(3000))); //Me devuelve el indice de valor 3000 es -1 porque la lista no contiene un numero de valor 3000 es util para saber si la lista contiene o no un elemento
        
        //1.10.2. Obtener el último índice
        System.out.println(edades.lastIndexOf("El último índice de 3 es: "+new Integer(3))); //el ultimo indice del numero 3 es 4 al añadir a edades.add(3) este seria el 4º
        
        //Saber si un elemento está repetido
        if((edades.indexOf(5)) == edades.lastIndexOf(5)){ //Condicional significa que el numero no esta repetido una manera sencilla de comprobar si un objeto esta repetido en una lista
            System.out.println("El numero no esta repetido");
        }else{
            System.out.println("El numero si esta repetido");
        }
        //1.11. Clonar
        ArrayList<Integer> numeros = (ArrayList)edades.clone(); //clono mi ArrayList de edades y lo guardo en la nueva variable numeros //Con una conversion de tipos de objeto a ArrayList añadiendo (ArrayList)
        numeros.forEach(numero -> System.out.println(numero)); //Para cada numero en numeros imprimo por pantalla el numero
        numeros.forEach(System.out::println);//Mucho mas complicado Para cada elemento en numeros lo que voty hacer imprimir los :: llaman al metodo de la clase
        //1.12. Convertir en array
        Object[]edadesArray = edades.toArray(); //Esto convierte edades el ArrayList en un Array
        System.out.println(edadesArray[0]); //lo compruebo imprimiendo por pantalla edadesArray[0]imprime el primer elemento del array
        System.out.println("El primer elemento del array es: "+edadesArray[0]); //el primer elemento del array es 3
    }
}