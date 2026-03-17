
package pruebaclases;

/**
 * Clase PruebaClases (Main class)
 * 
 * @author Daniel
 */
public class PruebaClases {

    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos coche1 con el constructor por defecto y establecemos el valor
        //de sus atributos utilizando los setters
        Coche coche1 = new Coche();
        coche1.setMarca("Audi");
        coche1.setModelo("A3");
        coche1.setAniosAntiguedad(10);
        
        //Creamos coche2 con el constructor parametrizado
        Coche coche2 = new Coche("Seat", "León", 5);
        
        //Mostramos coche1 y coche2
        coche1.mostrarCoche();
        System.out.println("");     
        coche2.mostrarCoche();
        
        //Cambiamos el modelo a coche1 y mostramos el nuevo valor 
        //utilizando el método getModelo()
        coche1.setModelo("A6");
        System.out.println(coche1.getModelo());
        
        //Aumentamos la antiguedad a coche1 y mostramos el nuevo valor 
        //utilizando el método getAniosAntiguedad()
        coche1.aumentarAntiguedad(5);
        System.out.println(coche1.getAniosAntiguedad());
        
        //Utilizamos el método "esAntiguo" de coche1 (almacenando previamente 
        //el valor en una variable)
        boolean antiguo = coche1.esAntiguo();
        if(antiguo == true) {
            System.out.println("Es antiguo");
        } else {
            System.out.println("Es nuevo");
        }
        
        //Utilizamos el método "esAntiguo" de coche1 (directamente en el "if")
        if(coche1.esAntiguo()) {
            System.out.println("Es antiguo");
        } else {
            System.out.println("Es nuevo");
        }      
        
    }

}
