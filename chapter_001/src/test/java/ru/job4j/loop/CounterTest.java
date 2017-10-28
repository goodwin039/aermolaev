package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void fromOnetoTenEqual30() {
        Counter counter = new Counter();
        int res = counter.add(1, 10);
        assertThat(res, is(30));
    }
}