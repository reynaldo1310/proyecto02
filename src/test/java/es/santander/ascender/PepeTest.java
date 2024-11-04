package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PepeTest {
    @Test
    public void testSumar(){
        //Preparo
        Pepe sut = new Pepe();

        //Ejecuto
        int resultado = sut.sumar (4,3)
        
        //Verifico
        assertTrue(resultado == 7);
    }

}
