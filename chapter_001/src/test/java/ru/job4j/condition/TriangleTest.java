package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class TriangleTest {
    /**
     * Тест проверяющий метод вычисления расстояния между точками
     */
    @Test
    public void whenAddBandCthenTwoPointEight() {
        //создаю 3 объекта Point
        Point a = new Point(2, 1);
        Point b = new Point(3, 3);
        Point c = new Point(5, 1);
        // создаю объект Triangle
        Triangle triangle = new Triangle(a,b,c);
        double res = triangle.distance(b,c);
        double expected = 2.8D;
        assertThat(res, closeTo(expected, 0.1));
        //assertThat(res, is(3.0));
    }

    /**
     * Тест для проверки метода вычисляющего периметр
     */
    @Test
    public void mustReturnIsAbout4Point035() {
        Point a = new Point(2, 1);
        Point b = new Point(3, 3);
        Point c = new Point(5, 1);
        Triangle triangle = new Triangle(a,b,c);
        double distanceAB = triangle.distance(a,b);
        double distanceAC = triangle.distance(a,c);
        double distanceBC = triangle.distance(b,c);
        double res = triangle.period(distanceAB, distanceAC, distanceBC);
        double expected = 4.035D;
        assertThat(res, closeTo(expected, 0.1));
    }

    /**
     * Тест метода вычисляющего площадь
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // создаем три объекта класса Point.
        Point a = new Point(2, 1);
        Point b = new Point(3, 3);
        Point c = new Point(5, 1);
        // Создаем объект треугольник и передаем в него объекты точек.
        Triangle triangle = new Triangle(a, b, c);
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 3D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

    /**
     * Тест метода вычисляющего существование треугольника
     */
    @Test
    public void ifLengthLessThanTwoOtherThanExist() {
        Point a = new Point(2, 1);
        Point b = new Point(3, 3);
        Point c = new Point(5, 1);
        Triangle triangle = new Triangle(a,b,c);
        double distanceAB = triangle.distance(a,b);
        double distanceAC = triangle.distance(a,c);
        double distanceBC = triangle.distance(b,c);
        boolean res = triangle.exist(distanceAB, distanceAC, distanceBC);
        assertThat(res, is(true));
    }
}