package ru.job4j.max;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(0, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(678, 2);
        assertThat(result, is(678));
    }

    @Test
    public void whenFirstMoreThanTwoOthers() {
        Max max = new Max();
        int res = max.max(3, 2, 0);
        assertThat(res, is(3));
    }
}