/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *• Ejercicio 15.- Diseña una clase Dirección con los atributos calle, número, piso y ciudad. A
continuación, diseña una clase Empleado con los atributos nombre (de tipo String), salario (de tipo
int) y dirección (de tipo Dirección).
• Para probar la funcionalidad de las clases creadas crea una clase Test donde crees 3 direcciones y
luego crea tres empleados, asignándoles una de las direcciones anteriormente creadas. Por último,
crea un método que muestre los datos de cada empleado creado:
EMPLEADO 1:
Nombre: XXX
Salario: XXX
Dirección:
Calle:XXX
Número: XXX
Puerta: XXX
Ciudad: XXX
EMPLEADO 2:
Nombre: …………..
 * @author Ángel
 */
public class Ejercicio15 {

    public static void main(String[] args) {
   
        Direccion direccion1 = new Direccion("Calle Sol", 20, "4B", "Salamanca"); //creo objeto direcciones con constructor parametrizado
        Direccion direccion2 = new Direccion("Calle Nube", 14, "4A", "Barakaldo");
        Direccion direccion3 = new Direccion("Calle Luna", 3, "2C", "Avila");


        Empleado empleado1 = new Empleado("Maria", 2000, direccion1); //creo empleados
        Empleado empleado2 = new Empleado("Juan", 2500, direccion2);
        Empleado empleado3 = new Empleado("Marta", 1800, direccion3);

        // Mostrar datos
        System.out.println("empleado 1:"); //muestro los datos de los empleados
        empleado1.mostrarEmpleado();

        System.out.print("empleado 2:");
        empleado2.mostrarEmpleado();

        System.out.print("empleado 3:");
        empleado3.mostrarEmpleado();
        
        System.out.println(empleado1.toString()); //muestro con ToString todos los datos
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
    }
    
}
