package ru.job4j.array;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class ArrayDuplicateTest {
    @Test
    public void whenArrayHasDuplicateThanCutIt() {
        String[] arr = {"aa", "aa", "bb", "bb", "cc", "cc", "dd", "dd"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(arr);
        String[] expect = {"aa", "dd", "bb", "cc"};
        assertThat(result, is(expect));
    }
}