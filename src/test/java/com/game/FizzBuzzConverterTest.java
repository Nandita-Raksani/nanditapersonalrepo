package com.game;

import org.junit.Assert;
import org.junit.Test;

import static com.game.constants.FizzBuzzConstants.*;

/**
 * Test class for the FizzBuzzConverter class
 *
 * @author Nandita Raksani
 */
public class FizzBuzzConverterTest {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

    /**
     * Method to test whether the normal number is returned as it is by the converter
     */
    @Test
    public void converterReturnsNormalNumberAsIs() {
        Assert.assertEquals("1", fizzBuzzConverter.convert(1));
        Assert.assertEquals("2", fizzBuzzConverter.convert(2));
        Assert.assertEquals("98", fizzBuzzConverter.convert(98));
    }

    /**
     * Method to test whether the multiples of 3 are returned as 'Fizz' by the converter
     */
    @Test
    public void converterReturnsFizzForMultiplesOfThree() {
        Assert.assertEquals(FIZZ, fizzBuzzConverter.convert(3));
        Assert.assertEquals(FIZZ, fizzBuzzConverter.convert(6));
        Assert.assertEquals(FIZZ, fizzBuzzConverter.convert(99));
    }

    /**
     * Method to test whether the multiples of 5 are returned as 'Buzz' by the converter
     */
    @Test
    public void converterReturnsBuzzForMultiplesOfFive() {
        Assert.assertEquals(BUZZ, fizzBuzzConverter.convert(5));
        Assert.assertEquals(BUZZ, fizzBuzzConverter.convert(10));
        Assert.assertEquals(BUZZ, fizzBuzzConverter.convert(100));
    }

    /**
     * Method to test whether the multiples of 5 and 3 are returned as 'FizzBuzz' by the converter
     */
    @Test
    public void converterReturnsFizzBuzzForMultiplesOfFiveAndThree() {
        Assert.assertEquals(FIZZBUZZ, fizzBuzzConverter.convert(15));
        Assert.assertEquals(FIZZBUZZ, fizzBuzzConverter.convert(60));
        Assert.assertEquals(FIZZBUZZ, fizzBuzzConverter.convert(90));
    }
}
