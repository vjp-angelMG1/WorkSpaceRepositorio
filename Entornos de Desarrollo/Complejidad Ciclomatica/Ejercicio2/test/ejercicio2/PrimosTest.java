/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicio2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class PrimosTest {
   


    
    private Primos clase = new Primos();
    
    @Test
    public void testCajaNegra(){

        // Caso límite: mínimo primo
        assertEquals(2, clase.sumaPrimos(2)); //2=2

    }
    @Test
    public void testCajaBlanca() {

    assertEquals(5, Primos.sumaPrimos(4));   // Camino 1
    
    assertEquals(2, Primos.sumaPrimos(2));   // Camino 2

    assertEquals(5, Primos.sumaPrimos(3));   // Camino 3

    assertEquals(10, Primos.sumaPrimos(6));  // Camino 4

    assertEquals(17, Primos.sumaPrimos(10)); // Camino 5
}

}

