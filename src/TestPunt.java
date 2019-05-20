import org.junit.*;
import static org.junit.Assert.*;

public class TestPunt {
    @Test
    public void testPuntConstructor() {
        // comprova que el constructor Punt() pugui ser cridat
        Punt p = new Punt();
    }

    @Test
    public void testPuntBuit() {
        // comprova que el constructor Punt() deixi a 0 els valors
        Punt p = new Punt(0 ,0);
        assertEquals(0, p.getX()); // Afirma que la coordenada x val 0
        assertEquals(0, p.getY());
    }
    @Test
    public void testSetXCorrect(){
        Punt p = new Punt(2, 3);
        p.setX(2);
        assertEquals(2, p.getX());
        assertEquals(3, p.getY());
    }
    @Test
    public void testSetYCorrect(){
        Punt p = new Punt(2, 3);
        p.setY(3);
        assertEquals(3, p.getY());
        assertEquals(2, p.getX());
    }
    @Test
    public void testPuntDefinit() {
        // comprova que el constructor Punt(int,int) deixi els valors correctes
        Punt p = new Punt(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }
    @Test
    public void testSuma(){
        Punt p = new Punt();
        Punt b = new Punt();
        p.suma(b);
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
}