/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author J-CHAN
 */
public class TestIdMaestroAlumno {
    
    idMaestroAlumno idMAEjemplo = new idMaestroAlumno();
  
    //Test que deberian de dar un resultado correcto

    //Test correctos

      @Test
    public void testMaestro1() {
        assertEquals("Maestro", idMAEjemplo.valorMA(1,"1000"));
}
  @Test
    public void testMaestro2() {
        assertEquals("Maestro", idMAEjemplo.valorMA(1,"9999"));
}
    @Test
    public void testAlumno1() {
        assertEquals("Alumno", idMAEjemplo.valorMA(2,"al0114758"));
}
  @Test
    public void testAlumno2() {
        assertEquals("Alumno", idMAEjemplo.valorMA(2,"al0161175"));
}    
    @Test
    public void testIntendente1() {
        assertEquals("Intendente", idMAEjemplo.valorMA(3,"in901"));
}
  @Test
    public void testIntendente2() {
        assertEquals("Intendente", idMAEjemplo.valorMA(3,"in994"));
}
//Test incorrectos
 @Test
    public void testMaestro3() {
        assertEquals("Maestro", idMAEjemplo.valorMA(1,"100"));
}
  @Test
    public void testMaestro4() {
        assertEquals("Maestro", idMAEjemplo.valorMA(1,"99978"));
}
    @Test
    public void testAlumno3() {
        assertEquals("Alumno", idMAEjemplo.valorMA(2,"jf0114758"));
}
  @Test
    public void testAlumno4() {
        assertEquals("Alumno", idMAEjemplo.valorMA(2,"al01611"));
}    
    @Test
    public void testIntendente3() {
        assertEquals("Intendente", idMAEjemplo.valorMA(3,"dd0"));
}
  @Test
    public void testIntendente4() {
        assertEquals("Intendente", idMAEjemplo.valorMA(3,"in10000"));
}    
        
  
    public TestIdMaestroAlumno(){
    }
}

