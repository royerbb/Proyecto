
package test;

import camisa.CamisaTipo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PrimerTest {
    @Test
    public void testTestCalcularPrecio() {
        System.out.println("testCalcularPrecio");
        CamisaTipo camisa = new CamisaTipo();
        Assertions.assertEquals(855.0, camisa.CalcularPrecio(1, 3));
        Assertions.assertEquals(1092.5, camisa.CalcularPrecio(2, 5));
        Assertions.assertEquals(620.0, camisa.CalcularPrecio(3, 2));
    }

}
