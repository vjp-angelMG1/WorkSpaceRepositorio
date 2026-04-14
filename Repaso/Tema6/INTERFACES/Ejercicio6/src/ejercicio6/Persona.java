/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 * * *• Ejercicio 6. – Realiza un programa en JAVA, orientado a objetos, en el
 * que crees una interfaz Transformable que contenga las siguientes operaciones
 * sobre cadenas: • concatenarTodo. Devuelve una cadena resultado de concatenar
 * todas las cadenas de un objeto separadas con el carácter ‘#’. •
 * obtenerIniciales. Devuelve una cadena resultado de concatenar las iniciales
 * de todas las cadenas de un objeto. • contarVocales. Cuenta todas las vocales
 * de todas las cadenas de un objeto y muestra el resultado por pantalla. •
 * obtenerCadenaMasLarga. Devuelve la cadena mas larga de todas las cadenas de
 * un objeto. • buscarCadena. Recibe una cadena por parámetros. Devuelve true si
 * el objeto tiene una cadena con ese valor y false en caso contrario. • Crea
 * las clases Libro (con los atributos título, autor y género) y Persona (con
 * los atributos nombre, apellidos y alias). Ambas clases deben implementar el
 * comportamiento definido en la interfaz Transformable. • Para probar el
 * programa, implementa una clase Test en la que instancies un objeto de cada
 * clase creada anteriormente y pruebes los métodos de cada objeto. •
 * Posteriormente, utiliza el polimorfismo para crear cada uno de los objetos a
 * partir de la interfaz Transformable y prueba los métodos implementados
 * nuevamente.
 *
 * @author Angel
 */
public class Persona implements Transformable {
    
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String alias;
    
    //CONSTRUCTOR
    //Por defecto
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.alias = "";
    }
    //Parametrizado
    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }
    
    //GETTERS / SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    //Metos abstractos sobreescritos de la interfaz
    @Override
    public String concatenarTodo() {
        return nombre + "#" + apellidos + "#" + alias;
    }

    @Override
    public String obtenerIniciales() {
        return "" + nombre.charAt(0) + apellidos.charAt(0) + alias.charAt(0);
    }

    @Override
    public void contarVocales() {
        String datos = concatenarTodo().toLowerCase();
        int contVocales = 0;
        
        for(int i=0; i<datos.length(); i++) {
            if(datos.charAt(i) == 'a'|| datos.charAt(i) == 'e' || datos.charAt(i) == 'i'|| datos.charAt(i) == 'o'|| datos.charAt(i) == 'u') {
                    contVocales++;
            }
        }
        
        System.out.println("La persona tiene " + contVocales + " vocales");
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String cadenaMasLarga = nombre;
        
        if(apellidos.length() > cadenaMasLarga.length()) {
            cadenaMasLarga = apellidos;
        } else if (alias.length() > cadenaMasLarga.length()) {
            cadenaMasLarga = alias;
        }
        
        return cadenaMasLarga;
    }

    @Override
    public boolean buscarCadena(String cadena) {
        boolean encontrado = false;
        
        if(cadena.equalsIgnoreCase(nombre) || cadena.equalsIgnoreCase(apellidos)|| cadena.equalsIgnoreCase(alias)) {
            encontrado = true;
        }
        
        return encontrado;      
    }
    
    //metodo toString
    @Override
    public String toString() {
        return super.toString()+"Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", alias=" + alias + '}';
    }     

}
