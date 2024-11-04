package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PepeTest {
    @Test
    public void testSumar(){
        Pepe sut = new Pepe();
                assertTrue(sut.sumar(4, 3) == 7);
    }

}
