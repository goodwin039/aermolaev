package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void ifFactorial0ThanReturn1() {
        Factorial factorial = new Factorial();
        int res = factorial.calc(0);
        assertThat(res, is(1));
    }

    @Test
    public void ifFactorialMoreThan0() {
        Factorial factorial = new Factorial();
        int res = factorial.calc(5);
        assertThat(res, is(120));
    }
}