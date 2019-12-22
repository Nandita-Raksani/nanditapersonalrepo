package com.game;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {
    @Test
    public void converterReturnsNormalNumberAsIs(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("1",fizzBuzzConverter.convert(1));
        Assert.assertEquals("2",fizzBuzzConverter.convert(2));
        Assert.assertEquals("98",fizzBuzzConverter.convert(98));
    }

    @Test
    public void converterReturnsFizzForMultiplesOfThree(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Fizz",fizzBuzzConverter.convert(3));
    }
}
