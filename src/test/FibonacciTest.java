package test;

import org.junit.Test;
import main.Fibonacci;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FibonacciTest {

    @Test
    public void fibonacci(){
    assertNotNull(Fibonacci.fibonacci());
    }

    @Test
    public void isFibonacciTrue(){
        assertTrue(Fibonacci.isFibonacci(1));
    }
    @Test
    public void isFibonacciFalse(){
        assertTrue(Fibonacci.isFibonacci(75));
    }
}
