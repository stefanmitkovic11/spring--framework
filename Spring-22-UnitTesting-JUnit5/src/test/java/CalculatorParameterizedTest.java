import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "TS", ""})
    void testCase1(String args) {
        Assertions.assertTrue(!args.isEmpty());
    }


    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 10})
    void testCase2(int number) {
        Assertions.assertEquals(0, number % 3);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "TS"})
//    @EmptySource
//    @NullSource
    @NullAndEmptySource
    void testCase3(String args) {
        Assertions.assertTrue(!args.isEmpty());
    }


    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String args) {
        Assertions.assertNotNull(args);
    }

    static String[] stringProvider() {
        return new String[]{"Java", "JS", "TS"};
    }


    @ParameterizedTest
    @CsvSource({"2,3,5", "4,5,9", "6,4,10","2,3,5","21,23,44", "20,30,100"})
    void testCase5(int num1, int num2, int result) {
        Assertions.assertEquals(result, Calculator.add(num1, num2));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "sample-data.csv", numLinesToSkip = 1)
    void testCase6(int num1, int num2, int result) {
        Assertions.assertEquals(result, Calculator.add(num1, num2));
    }
}
