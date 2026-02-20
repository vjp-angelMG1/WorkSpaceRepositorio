/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejercicio1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Ángel
 */
public class BinariaTest {

    Binaria test = new Binaria();

    @Test
    public void TestCajaNegra() {
        assertEquals(4, test.busquedaBinaria(5));
    }

    @Test
    public void testCajaBlanca() {
        // Caso que entra al if principal
        assertEquals(4, test.busquedaBinaria(5));                                          // nodo 4 → nodo 5

        // Casos que toman la rama "array[index] < numero"
        assertEquals(9, test.busquedaBinaria(10));                                           // nodo 7 → nodo 8

        // Casos que toman la rama "array[index] > numero"
        assertEquals(0, test.busquedaBinaria(1));                                            // nodo 10 → nodo 11

        // Caso que no existe
        assertEquals(-1, test.busquedaBinaria(15));                                            // termina while sin encontrar

    }
}