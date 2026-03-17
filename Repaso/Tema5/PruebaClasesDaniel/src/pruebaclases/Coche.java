
package pruebaclases;

/**
 *
 * Clase Coche
 * 
 * @author Daniel
 */
public class Coche {
    
    //Atributos
    private String marca;
    private String modelo;
    private int aniosAntiguedad;   
    
    //Constructores
    
    //Por defecto
    public Coche(){
        this.marca = "";
        this.modelo = "";
        this.aniosAntiguedad = 0;
    
    }
    
    //Parametrizado
    public Coche(String marca, String modelo, int aniosAntiguedad) {
        this.marca = marca;
        this.modelo = modelo;
        this.aniosAntiguedad = aniosAntiguedad;
    }
    
    //Parametrizado (adicional)
    public Coche(String marca){
        this.marca = marca;
        this.modelo = "";
        this.aniosAntiguedad = 0;
    }
    
    
    //Getters / Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }
     
    //Método mostrar
    public void mostrarCoche(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Anios Antigüedad: " + this.aniosAntiguedad);
    }
    
    //Método toString()
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", aniosAntiguedad=" + aniosAntiguedad + '}';
    }
      
    //Otros métodos...
    public boolean esAntiguo(){
        if(aniosAntiguedad > 15) {
            return true;
        } else {
            return false;
        }  
    }
    
    public void aumentarAntiguedad(int aniosExtra){
        this.aniosAntiguedad = this.aniosAntiguedad + aniosExtra;
    
    }
  
}
