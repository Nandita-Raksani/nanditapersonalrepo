package com.game;

public class FizzBuzzConverter {
    public String convert(int numberToBeConverted) {
        if(numberToBeConverted%3==0){
            return "Fizz";
        }
        return String.valueOf(numberToBeConverted);
    }
}
