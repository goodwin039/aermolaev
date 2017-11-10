package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RotateArrayTest {
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 2 на 2.
        RotateArray rotateArray = new RotateArray();
        int[][] arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (arr.length * i) + (j + 1);
            }
        }
        int[][] resultArray = rotateArray.rotate(arr);
        int[][] expectArray = {{3,1},{4,2}};
        assertThat(resultArray,is(expectArray));
    }

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 3 на 3.
        RotateArray rotateArray = new RotateArray();
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (arr.length * i) + (j + 1);
            }
        }
        int[][] resultArray = rotateArray.rotate(arr);
        int[][] expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertThat(resultArray,is(expectArray));
    }
}