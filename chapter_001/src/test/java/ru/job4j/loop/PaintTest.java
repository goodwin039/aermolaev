package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class PaintTest {
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String line = System.getProperty("line.separator");
        String expected = String.format(" ^%s^^^%s", line, line);
        assertThat(result, is(expected));
    }

    @Test
    public void whenPiramidHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String line = System.getProperty("line.separator");
        String expected = String.format("  ^%s ^^^%s^^^^^%s",line,line,line);
        assertThat(result, is(expected));
    }
}