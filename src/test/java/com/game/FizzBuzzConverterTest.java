package com.game;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {
    @Test
    public void converterReturnsNormalNumberAsIs(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals(1,fizzBuzzConverter.convert(1));
    }
}
