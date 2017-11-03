package ru.job4j.loop;

public class Board {
    public String paint(int width, int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if((i % 2 == 0) && (j % 2 == 0)) builder.append('x');
                if((i % 2 != 0) && (j % 2 != 0)) builder.append('x');
                if((i % 2 != 0) && (j % 2 == 0)) builder.append(' ');
                if((i % 2 == 0) && (j % 2 != 0)) builder.append(' ');
            }
            builder.append(System.getProperty("line.separator"));
        }
        String board = builder.toString();
        return board;
    }
}
