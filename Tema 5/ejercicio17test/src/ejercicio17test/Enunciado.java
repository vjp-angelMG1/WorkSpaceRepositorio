/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17test;

/**
 *
 * @author USUARIO
 */
public class Enunciado {
    
    //ATRIBUTOS
    private String pregunta;
    private String respuesta;
    
    //CONSTRUCTORES
    //POR DEFECTO
    public Enunciado() {
        this.pregunta="";
        this.respuesta="";
    }
    
    //PARAMETRIZADO
    public Enunciado(String pregunta, String respuesta) {
        this.pregunta=pregunta;
        this.respuesta=respuesta;
    }
    
    // GETTERS Y SETTERS
    public void setPregunta(String pregunta) {
        this.pregunta=pregunta;
    }
    public String getPregunta() {
        return this.pregunta;
    }
    
    public void setRespuesta(String respuesta) {
        this.respuesta=respuesta;
    }
    public String getRespuesta() {
        return this.respuesta;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Pregunta: " + pregunta + ", Nota: " + respuesta;
    }
    
}
