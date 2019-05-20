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
        Punt p = new Punt();
        assertEquals(0, p.getX()); // Afirma que la coordenada x val 0
        assertEquals(0, p.getY());
    }
    @Test
    public void testSetXCorrect(){
        Punt p = new Punt();
        p.setX(2);
        assertEquals(3, p.getX());
        assertEquals(2, p.getY());
    }
    @Test
    public void testSetYCorrect(){
        Punt p = new Punt();
        p.setY(3);
        assertEquals(4, p.getY());
        assertEquals(1, p.getX());
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
}