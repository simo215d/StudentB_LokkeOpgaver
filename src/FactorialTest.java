import junit.framework.TestCase;

public class FactorialTest extends TestCase {
    public void testCalc(){
        Factorial fact = new Factorial();
        assertEquals(6, fact.calc(3));
        assertEquals(120, fact.calc(5));
        assertEquals(-1, fact.calc(10000));
        assertEquals(-1, fact.calc(0));
        assertEquals(-1, fact.calc(-4));
    }
}