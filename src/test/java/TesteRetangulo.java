import org.junit.Test;
import poo.Retangulo;

import static junit.framework.TestCase.assertEquals;


public class TesteRetangulo {
    @Test
    public void ascii() {

        Retangulo r  = new Retangulo();
        assertEquals("errow","+--+\n|  |\n|  |\n+--+",r.desenharASCII());
        Retangulo s = new Retangulo (2,2);
        assertEquals("errowww","++\n++",s.desenharASCII());
        Retangulo y = new Retangulo(3,2);
        assertEquals("errowww","++\n||\n++",y.desenharASCII());




    }





}
