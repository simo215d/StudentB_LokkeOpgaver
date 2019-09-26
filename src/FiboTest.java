import junit.framework.TestCase;

public class FiboTest extends TestCase {
    public void testBeregn() {
        Fibo test = new Fibo();
        assertEquals(6,test.Beregn(3));
        assertEquals(10,test.Beregn(4));
        assertEquals(15,test.Beregn(5));
        assertEquals(-1,test.Beregn(100000));
        assertEquals(-1,test.Beregn(-3));
    }
}