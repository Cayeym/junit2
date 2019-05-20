import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSegment {

    @Test
    public void testSegmentConstructor(){
        Segment s = new Segment();
    }
    @Test
    public void testSegmentConstructor2(){
        Punt a = new Punt();
        Punt b = new Punt();
        Segment s = new Segment(1, 2, 2, 1);
    }
    @Test
    public void testSegmentAGetX(){
        Punt a = new Punt();
        Punt b = new Punt();
        Segment s = new Segment(1, 2, 2, 1);
        assertEquals(1, a.getX());
    }
    @Test
    public void testSegmentAGetY(){
        Punt a = new Punt();
        Punt b = new Punt();
        Segment s = new Segment(1, 2, 2, 1);
        assertEquals(2, a.getY());
    }
    @Test
    public void testSegmentBGetX(){
        Punt a = new Punt();
        Punt b = new Punt();
        Segment s = new Segment(1, 2, 2, 1);
        assertEquals(2, b.getX());
    }
    @Test
    public void testSegmentBGetY(){
        Punt a = new Punt();
        Punt b = new Punt();
        Segment s = new Segment(1, 2, 2, 1);
        assertEquals(0, b.getY());
    }
    @Test
    public void testSegmentLongitud(){
        Punt a = new Punt();
        Punt b = new Punt();
        Segment s = new Segment(1, 2, 2, 1);
        s.Longitud();
    }
}
