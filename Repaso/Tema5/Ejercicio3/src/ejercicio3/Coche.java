/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *• Luego, diseña una clase Coche que contenga los siguientes atributos privados:
• marca (de tipo cadena)
• modelo (de tipo cadena)
• ruedas (objeto de tipo Rueda)
• La clase Coche contendrá los siguientes métodos públicos:
• establecerMarca
• establecerModelo.
• obtenerMarca.
• obtenerModelo.
• establecerRueda.
• obtenerRueda.
* 
 * @author Ángel
 */
public class Coche {
    //Atributos
    private String marca;
    private String modelo;
    private Rueda rueda;
    
public Coche(){
    this.marca = "";
    this.modelo = "";
    this.rueda = new Rueda();
}

public Coche(String marca, String modelo, Rueda rueda){
    this.marca = marca;
    this.modelo = modelo;
    this.rueda = rueda;

}

//Parametrizado (adicional)
public Coche(String marca){
    this.marca = marca;
    this.modelo = "";
    this.rueda = new Rueda();
}
public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca = marca;
}

public String getModelo(){
    return modelo;
}
public void setModelo(String modelo){
    this.modelo = modelo;
}
public Rueda getRueda(){
    return rueda;
}
public void setRueda(Rueda rueda){
    this.rueda = rueda;
} 

//metodo mostrar
public void mostrarCoche(){
    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " +this.modelo);
    this.rueda.mostrarRueda();
}

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", rueda=" + rueda + '}';
    }

}
