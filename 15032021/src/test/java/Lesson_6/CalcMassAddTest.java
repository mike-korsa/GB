package Lesson_6;

import Lesson_6.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalcMassAddTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0,0,0},
                {1,1,2},
                {2,2,4},
                {3,1,6},
                {0,0,0},
        });
    }

    private int a;
    private int b;
    private int c;

    public CalcMassAddTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void massTestAdd() {
        Assert.assertEquals(c, calculator.add(a,b));
    }
}
