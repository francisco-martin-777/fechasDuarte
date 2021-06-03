/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duvbarte
 */
public class FechasDuarteTest {

    public FechasDuarteTest() {
        System.out.println("aqui se ejecuta el constructor");
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
    @Test
    public void test6_1() throws Exception {
        System.out.println("Caso 6.1: Datos de entrada: Fecha de hoy (Valor borde). \n"
                + "Resultado esperado (Salida): Se permite el ingreso de la transacción (mensaje de éxito).");
        String fechaFactura = "2021-06-03";
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void test6_2() throws Exception {
        System.out.println("Caso 6.2: Datos de entrada: Fecha de hoy más un día (Fecha de mañana).  \n"
                + "                    Resultado esperado (Salida): No se permite el ingreso de la transacción \n"
                + "                        y se muestra un mensaje de error.");
        String fechaFactura = "2021-06-04";
        Fechas instance = new Fechas();
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void test6_3() throws Exception {
        System.out.println("Caso 6.3: Datos de entrada: Fecha del día de ayer. \n" +
"                    Resultado esperado (Salida): Se permite el ingreso de la transacción (mensaje de éxito).");
        String fechaFactura = "2021-06-02";
        Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
