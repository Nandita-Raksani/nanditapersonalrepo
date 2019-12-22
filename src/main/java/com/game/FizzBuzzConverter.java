package com.game;

public class FizzBuzzConverter {
    public String convert(int numberToBeConverted) {
        if(numberToBeConverted%15==0){
            return "FizzBuzz";
        }
        if(numberToBeConverted%5==0){
            return "Buzz";
        }
        if(numberToBeConverted%3==0){
            return "Fizz";
        }
        return String.valueOf(numberToBeConverted);
    }
}
