/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05;

/**
 * Las clases son plantillas que definen
 * características (atributos) y comportamientos (métodos) 
 * de algo del mundo real. Con ella podemos crear
 * tantos objetos de ese tipo como necesitemos.
 * 
 * Estas clases NUNCA tienen método main.
 * 
 * ABSTRACCIÓN:
 * Una de las ideas principales de la POO
 * es la abstracción, es decir, quedarnos 
 * solo con lo que nos interesa de ese objeto
 * y aislarlo del resto de características.
 * Por ejemplo, una rueda de bici tiene un diámetro, 
 * un ancho, un tipo de cubierta, puede llevar cámara o ser
 * tubeless, tiene un número de radios, distintos tipos de 
 * válvula... Pero quizás solo me interese el diámetro y el 
 * tipo de cubierta, por lo que ignoro el resto de características.
 * 
 * ENCAPSULACIÓN: 
 * Los atributos siempre serán privados. De esta manera, solo 
 * serán accesibles desde la propia clase. Otras clases podrán
 * acceder a los atributos solo a través de los getters y setters.
 * Esto protege el código.
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
       System.out.println("Acelerando el coche...");
   }
   
   public void frenar() {
       System.out.println("Frenando el coche...");
   }
   
   public void girar() {
       System.out.println("Girando el coche...");
   }
   //4. TO STRING: devuelve un String con los datos del objeto
   @Override
   public String toString() {
       return "Mi coche tiene ruedas " + this.ruedas + ", suspension " + this.suspension + " y " + this.espejos + "espejos.";
   }
    
}

