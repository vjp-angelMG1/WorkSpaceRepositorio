/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08vehiculo;

/**
 *
 * @author Ángel
 */
public class Ejercicio08Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos que se crean de tipo Vehiculo, pero instanciados como Coche y Moto
        Vehiculo coche = new Coche(100);
        Vehiculo moto = new Moto(75);
        
        System.out.println("--Coche--");
        procesarVehiculo(coche);//Procesar el objeto Coche
        System.out.println("\n--Moto--");
        procesarVehiculo(moto);//Procesar el objeto Moto
    }

    //Método que aplica comportamiento específico según el tipo de vehículo
    public static void procesarVehiculo(Vehiculo vehiculo) {
        vehiculo.mostrarMovimiento();//Método común para todos los vehículos
        
        //Verificar si el objeto es una instancia de Coche
        if (vehiculo instanceof Coche) {
            Coche c = (Coche) vehiculo;//Se hace casting para acceder a métodos específicos de Coche
            c.encenderAire();//Método exclusivo de Coche
            c.mostrarMovimiento();//Mostrar el estado actualizado
        // Verificar si el objeto es una instancia de Moto
        } else if (vehiculo instanceof Moto) {
            Moto m = (Moto) vehiculo;//Se hace casting para acceder a métodos específicos de Moto
            m.hacerCaballito();//Método exclusivo de Moto
            m.mostrarMovimiento();//Mostrar el estado actualizado
        }
    }
    
    
}
