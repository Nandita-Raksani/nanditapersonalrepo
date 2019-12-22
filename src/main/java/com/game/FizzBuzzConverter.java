package com.game;

import static com.game.constants.FizzBuzzConstants.*;

/**
 * Converter class to check if the number passed is Fizz/Buzz/FizzBuzz other wise return thee number itself.
 *
 * @author Nandita Raksani
 */
public class FizzBuzzConverter {
    /**
     * Determines if the given number is divisible by 3 and 5 then returns 'FizzBuzz', divisible by 5 returns 'Buzz', divisible by 3 'Fizz', the number itself for normal number
     *
     * @param numberToBeConverted : The number which is to be converted. Example: 1,2,6,9,100
     * @return : Returns the result as String. Example: FizzBuzz. Fizz, Buzz, 1, 2
     */
    public String convert(int numberToBeConverted) {

        if (numberToBeConverted % 15 == 0) {
            return FIZZBUZZ;
        }
        if (numberToBeConverted % 5 == 0) {
            return BUZZ;
        }
        if (numberToBeConverted % 3 == 0) {
            return FIZZ;
        }
        return String.valueOf(numberToBeConverted);
    }
}
