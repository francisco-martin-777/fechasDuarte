/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author duvbarte
 */
@RunWith(Parameterized.class)
public class FechasDuartePAramIT {
    private String fechaEntrada;
    private int resultadoEsperado;
    
    public FechasDuartePAramIT(String fechaEntrada,int resultadoEsperado) {
        this.fechaEntrada=fechaEntrada;
        this.resultadoEsperado=resultadoEsperado;
        
    }
    // Aqui generamos los datos de prueba
    @Parameterized.Parameters
    public static Iterable<Object> generarDatosTest() {
		List<Object> obj = new ArrayList<>();

		obj.add(new Object[] { "2021-06-03" , 0});
		obj.add(new Object[] { "2021-06-04",  1});
		obj.add(new Object[] { "2021-06-02", -1});
		

		return obj;
	}
    
    
    
    /**
     * ahora hariamos los test.
     */
    @Test
    public void testEsFacturaCorrectaEnFechaParametrizado() throws Exception {
        System.out.println("introducimos la fecha correcta:"+fechaEntrada+"nos tendiria que dar como resultado:"+
                resultadoEsperado);
        //String fechaFactura = "";
        Fechas instance = new Fechas();
        //int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaEntrada);
        assertEquals(resultadoEsperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
}
