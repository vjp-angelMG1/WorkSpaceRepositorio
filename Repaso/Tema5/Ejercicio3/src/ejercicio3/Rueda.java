/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Angel
 */
public class Rueda {
    //ATRIBUTOS
    private String material;
    private int pulgadas;
    
public Rueda(){
    this.material= "";
    this.pulgadas= 0;
}
public Rueda(String material,int pulgadas){
    this.material = material;
    this.pulgadas = pulgadas;
}
public String getMaterial(){
    return material;
} 
public void setMaterial(String material){
    this.material=material;
}

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
    public void mostrarRueda(){
        System.out.println("Mostrar material : "+this.material);
        System.out.println("Mostrar pulgadas : "+this.pulgadas);
    }
    @Override
    public String toString() {
        return "Rueda{" + "material=" + material + ", pulgadas=" + pulgadas + '}';
    }

}
