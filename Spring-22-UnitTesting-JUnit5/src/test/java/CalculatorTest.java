import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setUpAll() {
        System.out.println("BeforeAll is executed");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll is executed");
    }


    @BeforeEach
    void setUpEach() {
        System.out.println("BeforeEach is executed");
    }


    @AfterEach
    void tearDownEach() {
        System.out.println("AfterEach is executed");
    }

    @Test
    void testCase1() {
        System.out.println("Test Case 1");
        fail("Not implemented yet");
    }

    @Test
    void testCase2() {
        System.out.println("Test Case 2");
//        assertTrue(Calculator.operator.equals("add"));
        assertEquals("add", Calculator.operator);
    }

    @Test
    void testCase3() {
        System.out.println("Test Case 3");
        boolean result = Calculator.add(2, 2) == 4;
        assertTrue(result);
    }

    @Test
    void testCase4() {
        System.out.println("Test Case 4");
        boolean result = Calculator.add(2, 2) == 5;
        assertFalse(result);
    }

    @Test
    void testCase5() {
        System.out.println("Test Case 5");
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3}, "Array equals failed");
    }

    @Test
    void testCase6() {
        System.out.println("Test Case 6");
        String nullString = null;
        assertNull(nullString);

        String notNullString = "Stefan";
        assertNotNull(notNullString);
    }


    @Test
    void testCase7() {
        System.out.println("Test Case 7");
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        assertSame(c1, c2);
        assertNotSame(c1, c3);
    }


    @Test
    void testCase8() {
        System.out.println("Test Case 8");

    }


    @Test
    void add() {
        System.out.println("Test Case Add");

        int actual = Calculator.add(2, 3);
        assertEquals(5, actual, "Addition test is failed");
//        fail("Not implemented yet");
    }

    @Test
    void add2() {
        System.out.println("Test Case Add 2");

        assertThrows(IllegalArgumentException.class, () -> Calculator.add2(5, 2));

//        assertThrows(IllegalArgumentException.class, () -> Calculator.add2(2, 5));

    }


}