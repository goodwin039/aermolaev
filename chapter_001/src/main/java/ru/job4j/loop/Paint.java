package ru.job4j.loop;

public class Paint {
    public String piramid(int h) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= h; i++) {
            for (int j = i; j < h; j++) {
                builder.append(' ');
            }
            for (int k = 1; k < (i * 2); k++) {
                builder.append('^');
            }
            builder.append(System.getProperty("line.separator"));
        }
        String piramid = builder.toString();
        return piramid;
    }
}
