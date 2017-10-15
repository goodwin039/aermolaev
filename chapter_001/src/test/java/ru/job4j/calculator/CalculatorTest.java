package ru.job4j.calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 *  CalculatorTest.
 *
 * @author Andrew Ermolaev (goodwin039@gmail.com).
 * @version $Id$ jkkk.
 * @since 0.1.
 */
public class CalculatorTest {

    /**
     * @throws Exception Exception.
     */
    @Test
    public void subtract() throws Exception {
        Calculator calc = new Calculator();
        calc.subtract(3D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * @throws Exception Exception.
     */
    @Test
    public void div() throws Exception {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * @throws Exception Exception.
     */
    @Test
    public void multiple() throws Exception {
        Calculator calc = new Calculator();
        calc.multiple(4D, 2D);
        double result = calc.getResult();
        double expected = 8D;
        assertThat(result, is(expected));
    }

    /**
     *  It`s checked add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}