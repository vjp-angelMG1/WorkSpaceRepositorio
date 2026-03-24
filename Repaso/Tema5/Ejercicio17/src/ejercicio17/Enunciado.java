/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author Angel
 */
public class Enunciado {
    //ATRIBUTOS
    private String pregunta;
    private String respuesta;
    //CONSTRUCTOR POR DEFECTO
    public Enunciado() {

        this.pregunta = "";
        this.respuesta = "";

    }
    //CONSTRUCTOR PARAMETRIZADO
    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    //GETTERS Y SETTERS
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean esCorrecta(String respuestaUsuario) {
        
         return this.respuesta.trim().equalsIgnoreCase(respuestaUsuario.trim()); //devuelvo la respuesta ignorando las mayusculas y minusculas y espacios que me daba error por los espacios utilizando el trim
    }
    //METODO PARA MOSTRAR
    public void mostrar() {
        System.out.println("La pregunta es : " + this.pregunta);
        System.out.println("La respuesta es : " + this.respuesta);
    }
    //METODO TOSTRING
    @Override
    public String toString() {
        return "Enunciado{" + "pregunta=" + pregunta + ", respuesta=" + respuesta + '}';
    }
}
