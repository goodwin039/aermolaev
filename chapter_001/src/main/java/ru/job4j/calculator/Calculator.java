package ru.job4j.calculator;

/**
 * * Calculator.
 *
 * @author Andrew Ermolaev (goodwin039@gmail.com).
 * @version $Id$ jkkk.
 * @since 0.1.
 */
public class Calculator {
    /**
     * @param result result.
     */
    double result;

    /**
     * @param first first.
     * @param second second.
     */
    void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * @param first first.
     * @param second second.
     */
    void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * @param first first.
     * @param second second.
     */
    void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * @param first first.
     * @param second second.
     */
    void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * @return return.
     */
    double getResult() {
        return this.result;
    }
}
