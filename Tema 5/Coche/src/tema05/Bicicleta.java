/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05;

/**
 *
 * @author alumno
 */
public class Bicicleta {

    //ATRIBUTOS
    private int ruedas;
    private String manillar;
    private String pedales;
    private String frenos;
    private boolean estaPedaleando;

    //Atributo estático que pertenece a la clase 
    private static int numBicicleta=0;
    
    
    //CONSTRUCTORES
    //Por defecto
    public Bicicleta() {
        this.ruedas = 0;
        this.pedales = "";
        this.manillar = "";
        this.frenos = "";
        this.estaPedaleando = false;
        
    //incrementamos el valor de número de bicicletas 
        incrementarNumBicicleta();
    }  

    public Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando) {
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
    
    //Incrementamos el valor del número de bicicletas
    incrementarNumBicicleta();
    }
    // GETTERS Y SETTERS
    public void setReudas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setManillar(String manillar) {
        this.manillar = manillar;
    }

    public String getManillar() {
        return this.manillar;
    }

    public void pedales(String pedales) {
        this.pedales = pedales;
    }
    public String pedales() {
        return this.pedales;
    }


//MÉTODOS

//TO STRING
    
    @Override
    public String toString() {
        return "Mi bicleta tiene " + this.ruedas + " ruedas"
                + ", un manillar " + this.manillar
                + ", unos pedales " + this.pedales
                + ", unos frenos " + this.frenos
                + " y ahora ¿estoy pedaleando? " + this.estaPedaleando;
    }
}
