import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCase1(){
        fail("Not implemented yet");
    }

    @Test
    void testCase2(){
//        assertTrue(Calculator.operator.equals("add"));
        assertEquals("add", Calculator.operator);
    }

    @Test
    void testCase3(){
        boolean result = Calculator.add(2, 2) == 4;
        assertTrue(result);
    }

    @Test
    void testCase4(){
        boolean result = Calculator.add(2, 2) == 5;
        assertFalse(result);
    }

    @Test
    void testCase5(){
      assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3}, "Array equals failed");
    }

    @Test
    void testCase6(){
        String nullString = null;
        assertNull(nullString);

        String notNullString = "Stefan";
        assertNotNull(notNullString);
    }


    @Test
    void testCase7(){
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        assertSame(c1, c2);
        assertNotSame(c1, c3);
    }


    @Test
    void testCase8(){


    }


    @Test
    void add() {
        int actual = Calculator.add(2,3);
        assertEquals(5, actual, "Addition test is failed");
//        fail("Not implemented yet");
    }



}