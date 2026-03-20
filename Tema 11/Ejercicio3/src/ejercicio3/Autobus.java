/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Map;
import java.util.HashMap;

/**
 * *• Ejercicio 03.- Diseña un programa en Java para gestionar los
autobuses de la estación de Plasencia.
• Nuestro programa dispondrá de un vector de 6 celdas dónde
“aparcar” los autobuses.
• De cada autobús, almacenaremos su matrícula y los conductores
que tiene asignados (los cuales se almacenarán en un HashMap).
• De cada conductor almacenaremos su DNI (que hará las veces
de clave) y su nombre.
* • El programa dispondrá del siguiente menú:
• Aparcar (pedirá un número, que será la posición del vector donde
deberemos aparcar el autobús. Si la posición está ocupada, se volverá a
pedir hasta encontrar una libre).
• Mostrar dársenas libres.
• Buscar autobús (método que muestre toda la información del autobús
a partir de su matrícula).
• Buscar conductor (Mostrará la matrícula del autobús que tiene
asignado).
• Método que retorne la posición del vector donde se encuentra el
autobús con mayor número de conductores asignados.
 * @author Angel
 */
public class Autobus {
     // ATRIBUTOS
    private String matricula;
    private Map<String, Conductor> conductores;
    
    // CONSTRUCTORES
    // Por defecto
    public Autobus() {
        this.matricula = "";
        this.conductores = new HashMap<>();
    }
    // Parametrizado
    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }
    
    public Autobus(String matricula, Map<String, Conductor> conductores) {
        this.matricula = matricula;
        this.conductores = conductores;
    }
    
    
    // GETTERS Y SETTERS
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<String, Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(Map<String, Conductor> conductores) {
        this.conductores = conductores;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", conductores=" + conductores + '}';
    }

}
