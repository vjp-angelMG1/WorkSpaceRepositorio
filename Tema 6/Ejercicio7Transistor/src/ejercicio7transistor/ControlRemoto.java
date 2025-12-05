/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7transistor;

/**
 *
 * @author USUARIO
 */
public interface ControlRemoto {
    public void encender();//Método para encender el dispositivo
    public void apagar();//Método para apagar el dispositivo
    public void subirVolumen();//Método para subir el volumen
    public void bajarVolumen();//Método para bajar el volumen
    public void cambiarCanal(float canal);//Método para cambiar el canal, recibe un número decimal como parámetro
    
}
