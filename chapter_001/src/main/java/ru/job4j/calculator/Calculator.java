package ru.job4j.calculator;
/**
 * Calculator.
 * @author Pavel Buchenkov (pavel.buchenkov@gmail.com)
 */
public class Calculator {
    private double result;
    /**
     * Сложение.
     * @param first аргумент first
     * @param second аргумент second
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Вычитание
     * @param first аргумент first
     * @param second аргумент second
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
        /**
         * Деление
         * @param first аргумент first
         * @param second аргумент second
         */
        public void div(double first, double second) {
            this.result = first/second;
        }
    /**
     * Умножение
     * @param first аргумент first
     * @param second аргумент second
     */
    public void multiple(double first, double second) {
        this.result = first*second;
    }
    /**
     * Результат.
     * @return результат
     */
    public double getResult() {
        return this.result;
    }
}