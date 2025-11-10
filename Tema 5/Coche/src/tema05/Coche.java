/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05;

/**
 *
 * @author alumno
 */
public class Coche {
    // 1. ATRIBUTOS: características. NUNCA se inicializan aquí.
    private String ruedas;
    private String suspension;
    private int espejos;
    
   //2. CONSTRUCTORES: permiter "construir" (instanciar) un objeto de este tipo.
   // Inicializan todos los atributos.
   // 2.1. CONSTRUCTOR POR DEFECTO
   public Coche() {
       this.ruedas ="";
       this.suspension ="";
       this.espejos = 0;
   }   
   // 2.2. CONSTRUCTOR PARAMETRIZADO (sobrecarga de métodos y autorreferencia this)
   public Coche(String ruedas, String suspension, int espejos) {
       this.ruedas = ruedas;
       this.suspension = suspension;
       this.espejos = espejos;
   }
   
   // 3. MÉTODOS:
   // 3.1 GETTERS Y SETTERS: devuelven y establecen el valor de los atributos
   public String getRuedas() {
       return this.ruedas;
   }
   
   public void setRuedas(String ruedas) {
       this.ruedas = ruedas;    
   }
   
   
   public String getSuspension() {
       return this.suspension;
   }
   public void setSuspension(String suspension) {
       this.suspension = suspension;
   }
   
   public int getEspejos() {
      return this.espejos;
   }
   public void setEspejos(int espejos) {
       this.espejos = espejos;
   }
           
   // 3.2. OTROS MÉTODOS
   public void acelerar() {
       System.out.println("Acelerando el coche");
   }
   public void girar() {
       System.out.println("Girando el coche");
   }
   public void frenar() {
       System.out.println("Frenando el coche");
   }
   //4. TO STRING: devuelve un String con los datos del objeto
   @Override
   public String toString() {
       return "Mi coche tiene ruedas " + this.ruedas + ", suspension " + this.suspension + " y " + this.espejos + "espejos.";
   }
    
}
