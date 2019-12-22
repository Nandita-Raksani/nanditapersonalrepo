package com.game;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

    @Test
    public void converterReturnsNormalNumberAsIs() {
        Assert.assertEquals("1", fizzBuzzConverter.convert(1));
        Assert.assertEquals("2", fizzBuzzConverter.convert(2));
        Assert.assertEquals("98", fizzBuzzConverter.convert(98));
    }

    @Test
    public void converterReturnsFizzForMultiplesOfThree() {
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(3));
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(6));
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(99));
    }

    @Test
    public void converterReturnsBuzzForMultiplesOfFive(){
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(5));
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(10));
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(100));
    }

    @Test
    public void converterReturnsFizzBuzzForMultiplesOfFiveAndThree(){
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(60));
    }
}
