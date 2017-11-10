package ru.job4j.array;

public class RotateArray {
    public int[][] rotate(int[][] array) {
        for (int i = 0; i <(array.length / 2); i++) {
            for (int j = i; j < array.length - 1 - i; j++) {
                int tmp = array[i][j];
                array[i][j] = array[array.length - 1 - j][i];
                array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
                array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i];
                array[j][array.length - 1 - i] = tmp;
            }
        }
        return array;
    }
}
