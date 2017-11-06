package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с чётным числом элементов, например {2, 6, 1, 4}.
        Turn turn = new Turn();
        int[] arr = {2, 6, 1, 4};
        int[] resultArray = turn.back(arr);
        int[] expectArray = {4, 1, 6, 2};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turn = new Turn();
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrayResult = turn.back(arr);
        int[] arrayExpect = {5, 4, 3, 2, 1};
        assertThat(arrayResult,is(arrayExpect));
    }
}