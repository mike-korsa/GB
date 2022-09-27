package Lesson_6;

import org.junit.*;
import org.junit.Test;

public class CalcTest {

    Calculator calculator;

    @Before
    public void init() {
        System.out.println("init");
        calculator = new Calculator();
    }

    @Test
    public void testCalc1() {
        Assert.assertEquals(4, calculator.add(2,2));
    }
//
    @Test
    public void testCalc2() {
        Assert.assertEquals(3, calculator.add(1,2));
    }


//
//    @Test
//    public void testCalc3() {
//        Assert.assertEquals(5, calculator.add(2,2));
//    }
//
    @Test(expected = ArithmeticException.class)
    @Ignore(value = "Не хочу ждать час!")
    public void testDiv() {
        Assert.assertEquals(10, calculator.div(10,0));
    }

    @After
    public void shutdown() {
        System.out.println("end!");
    }
}
