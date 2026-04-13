/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 * *• Ejercicio 6. – Realiza un programa en JAVA, orientado a objetos, en el
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
public class Libro implements Transformable { //añado a la clase la interfaz de la que voy a sobreescribir los metodos abstractos

    //ATRIBUTOS
    private String titulo;
    private String autor;
    private String genero;

    //CONSTRUCTORES
    //Por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.genero = "";
    }
    //Parametrizado
    public Libro(String titulo, String autor, String genero) { //con los parametros
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    //GETERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    //Metodos abstractos sobrescritos desde la interfaz
    @Override
    public String concatenarTodo() {
        return titulo + "#" + autor + "#" + genero;
    }

    @Override
    public String obtenerIniciales() {
        return "" + titulo.charAt(0) + autor.charAt(0) + genero.charAt(0); //devuelvo las iniciales de cada atributo
    }

    @Override
    public void contarVocales() {
        String datos = concatenarTodo().toLowerCase();
        int contVocales = 0;

        for (int i = 0; i < datos.length(); i++) {
            if (datos.charAt(i) == 'a'|| datos.charAt(i) == 'e'|| datos.charAt(i) == 'i'|| datos.charAt(i) == 'o'|| datos.charAt(i) == 'u') { //cuento las vocales de cada atributo
                contVocales++; //voy almacenando las veces en un contador
            }
        }

        System.out.println("El libro tiene " + contVocales + " vocales");
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String cadenaMasLarga = titulo;

        if (autor.length() > cadenaMasLarga.length()) {
            cadenaMasLarga = autor;
        } else if (genero.length() > cadenaMasLarga.length()) {
            cadenaMasLarga = genero;
        }

        return cadenaMasLarga;
    }

    @Override
    public boolean buscarCadena(String cadena) {
        boolean encontrado = false;

        if (cadena.equalsIgnoreCase(titulo)|| cadena.equalsIgnoreCase(autor)|| cadena.equalsIgnoreCase(genero)) { //ignono mayusculas en cada cadena
            encontrado = true;
        }

        return encontrado;
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+"Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + '}';
    }

}

