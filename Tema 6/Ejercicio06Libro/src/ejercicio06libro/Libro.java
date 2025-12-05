/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06libro;

/**
 *
 * @author Ángel
 */
public class Libro implements Transformable {

    // Creamos los atributos
    private String titulo;
    private String autor;
    private String genero;

    //Creamos los constructores por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.genero = "";
    }

    //Creamos los constructores parametriazados
    public Libro(String libro, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    //Creamos los getter y setter
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

    //Implementamos los métodos de Transformable
    /**
     * Método que concatena la información del libro
     *
     * @return la concatenación de la información del libro
     */
    @Override
    public String concatenarTodo() {
        return titulo + " # " + autor + " # " + genero;
    }

    // Método auxiliar para obtener la inicial o un guion si la cadena es nula/vacía
    // para que no dé erros el siguiente método
    private char obtenerInicialSegura(String cadena) {
        if (cadena != null && !cadena.isEmpty()) {
            return cadena.charAt(0);
        }
        return '-'; // Devuelve un guion si no hay cadena válida
    }

    /**
     * Método que nos muestra todas las iniciales
     *
     * @return las iniciales
     */
    @Override
    public String obtenerIniciales() {

        //En un principio puse esto y me daba error por que no puedo llamar a 
        //ningún método (como charAt(), contains(), o length()) si la variable
        //es null. Con lo cual cree un método auxiliar
        
        // return "" + titulo.charAt(0) + autor.charAt(0) + genero.charAt(0);
        
        // Usamos el método seguro para cada atributo
        return "" + obtenerInicialSegura(titulo)+ obtenerInicialSegura(autor)
                + obtenerInicialSegura(genero);
    }

    /**
     * Método que cuenta las vocales que hay
     */
    @Override
    public void contarVocales() {

        //Convertimos todo a una sola cadena en minúsculas
        String textoCompleto = concatenarTodo().toLowerCase();

        //Usamos una cadena de referencia para las vocales
        String vocales = "aeiou";

        int contador = 0;
        //Iteramos sobre la cadena unificada
        for (int i = 0; i < textoCompleto.length(); i++) {
            char caracter = textoCompleto.charAt(i);

            // indexOf devuelve 0 o más si el caracter se encuentra, -1 si no.
            if (vocales.indexOf(caracter) >= 0) {
                contador++;
            }
        }
    }

    /**
     * Método que nos dá la cadena mas larga de todas las cadenas de un objeto
     * @return la cadenas mas larga
     */
    @Override
    public String obtenerCadenaMasLarga() {
    
    // 1. Inicializamos masLarga. Si titulo es null, iniciamos con una cadena vacía 
    // para poder usar .length() sin riesgo.
    String masLarga = (titulo != null) ? titulo : ""; 
    
    // 2. Comprobamos el autor
    // Si el autor NO es nulo Y es más largo que la cadena actual más larga
    if (this.autor != null && this.autor.length() > masLarga.length()) {
        masLarga = this.autor;
    }
    
    // 3. Comprobamos el género
    // Si genero NO es nulo Y es más largo que la cadena actual más larga
    if (this.genero != null && this.genero.length() > masLarga.length()) {
        masLarga = this.genero;
    }
    
    // Devolvemos el resultado (será la cadena más larga, o "" si todos eran null)
    return masLarga;
    }
    
    /**
     * Método que devuelve true si el objeto tiene una cadena con ese valor y 
     * false en caso contrario.
     * @param cadenaBusqueda
     * @return true o false
     */
    @Override
    public boolean buscarCadena(String cadenaBusqueda) {
    
    // Si el título NO es null Y contiene la cadena, devolvemos TRUE.
    boolean encontradoEnTitulo = (this.titulo != null && this.titulo.contains(cadenaBusqueda));

    // Si el autor NO es null Y contiene la cadena, devolvemos TRUE.
    boolean encontradoEnAutor = (this.autor != null && this.autor.contains(cadenaBusqueda));
    
    // Si el género NO es null Y contiene la cadena, devolvemos TRUE.
    boolean encontradoEnGenero = (this.genero != null && this.genero.contains(cadenaBusqueda));
    
    // Retornamos TRUE si se encontró en cualquiera de los tres (OR ||)
    return encontradoEnTitulo || encontradoEnAutor || encontradoEnGenero;
    }


    //Creamos To String
    @Override
    public String toString() {
        return "El libro con titulo: " + titulo + " del autor: " + autor + " es del genero: " + genero;
    }

}
    

