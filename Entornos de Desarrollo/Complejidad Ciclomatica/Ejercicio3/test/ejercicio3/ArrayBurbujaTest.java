/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package ejercicio3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.reflect.Method;

public class ArrayBurbujaTest {

    private ArrayBurbuja test = new ArrayBurbuja();

    // Método auxiliar para llamar al private
    private boolean llamarBurbuja(int[] array) throws Exception {
        Method metodo = ArrayBurbuja.class.getDeclaredMethod("burbuja", int[].class);
        metodo.setAccessible(true);
        return (boolean) metodo.invoke(test, (Object) array);
    }

   
    @Test
    public void testCajaNegraBasica() throws Exception {
        int[] array = {3, 1, 2};
        assertEquals(false, llamarBurbuja(array)); //hay intercambio de variables en el array
    }

    
    @Test
    public void testCajaBlanca() throws Exception {
        assertEquals(true, llamarBurbuja(new int[]{1, 2, 3})); //array ordenado camino 1
        assertEquals(false, llamarBurbuja(new int[]{3, 2, 1}));//cambio de variables una vez camino 2
        assertEquals(false, llamarBurbuja(new int[]{4, 3, 2, 1}));//cambio de variables varias veces camino 3
        assertEquals(true, llamarBurbuja(new int[]{1})); //un solo elemento camino 4
    }
}

