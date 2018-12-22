package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Pavel Buchenkov (pavel.buchenkov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest  {
    /**
     * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
    /**
     * Test subtract.
     */
    @Test
    public void whenSubtractTwoMinusOneThenOne()  {
        Calculator calc = new Calculator();
        calc.subtract(2, 1);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }
    /**
     * Test div.
     */
    @Test
    public void whenFourDivTwoThenTwo()  {
        Calculator calc = new Calculator();
        calc.div(4, 2);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
    /**
     * Test multiple.
     */
    @Test
    public void whenOneMultipleThreeThenThree()  {
        Calculator calc = new Calculator();
        calc.multiple(1, 3);
        double result = calc.getResult();
        double expected = 3;
        assertThat(result, is(expected));
    }
}