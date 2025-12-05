/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06libro;

/**
 *
 * @author Ángel
 */
public class Persona implements Transformable {
    
    //Creamos los atributos
    private String nombre;
    private String apellidos;
    private String alias;
    
    //Creamos los constructores por defecto
    public Persona(){
    this.nombre = "";
    this.apellidos = "";
    this.alias = "";
    
    }
    
    //Creamos los contructores parametrizados
    public Persona(String nombre, String apellidos, String alias){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
        
    }
    
    //Creamos los getter y setter

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
    
    //Implementamos los métodos de Transformable
    
    /**
     * Método que concatena la información de la persona
     * @return la concatenación de la información de la persona
     */
    @Override
    public String concatenarTodo(){
        return nombre + " # " + apellidos + " # " + alias;
    
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
        return "" + obtenerInicialSegura(nombre)+ obtenerInicialSegura(apellidos)
                + obtenerInicialSegura(alias);
    }
    
    /**
     * Método que cuenta las vocales que hay
     */
    @Override
    public void contarVocales(){
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
    String masLarga = (nombre != null) ? nombre : ""; 
    
    // 2. Comprobamos apellidos
    // Si apellidos NO es nulo Y es más largo que la cadena actual más larga
    if (this.apellidos != null && this.apellidos.length() > masLarga.length()) {
        masLarga = this.apellidos;
    }
    
    // 3. Comprobamos el alias
    // Si alias NO es nulo Y es más largo que la cadena actual más larga
    if (this.alias != null && this.alias.length() > masLarga.length()) {
        masLarga = this.alias;
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
    boolean encontradoEnNombre = (this.nombre != null && this.nombre.contains(cadenaBusqueda));

    // Si el autor NO es null Y contiene la cadena, devolvemos TRUE.
    boolean encontradoEnApellidos = (this.apellidos != null && this.apellidos.contains(cadenaBusqueda));
    
    // Si el género NO es null Y contiene la cadena, devolvemos TRUE.
    boolean encontradoEnAlias = (this.alias != null && this.alias.contains(cadenaBusqueda));
    
    // Retornamos TRUE si se encontró en cualquiera de los tres (OR ||)
    return encontradoEnNombre || encontradoEnApellidos || encontradoEnAlias;
    }
    
    //Creamos To String

    @Override
    public String toString() {
        return "La persona se llama: " + nombre + " ,con los apellidos: " + apellidos + " y el alias:" + alias;
    }
    
}    
    

