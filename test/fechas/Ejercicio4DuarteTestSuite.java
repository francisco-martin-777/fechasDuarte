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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author duvbarte
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({fechas.FechasDuarteTest.class, fechas.FechasDuartePAramIT.class, fechas.FechasDuarteACBCIT.class, fechas.FechasDuarteABIT.class})
public class Ejercicio4DuarteTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
