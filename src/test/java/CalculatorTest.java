import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
    private Main calculator;
    @Before
    public void setUp() {
        calculator = new Main();
    }
    @Test
    public void test_add() {
        int a = 10;
        int aa = 20;
        int expectedResult = 30;
        int result = calculator.add(a,aa);
        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void test_subt() {
        int a = 20;
        int aa = 10;
        int expectedResult = 10;
        int result = calculator.subt(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_mul() {
        int a = 10;
        int aa = 10;
        int expectedResult = 100;
        int result = calculator.mul(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_per() {
        int a = 10;
        int b = 7;
        int expectedResult = 3;
        int result = calculator.per(a,b);
        Assert.assertEquals(expectedResult, result);
    }
}