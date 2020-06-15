package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_num_given_num_1() {
        String result = fizzBuzz.sayResult(1);
        assertEquals("1", result);
    }

    @Test
    public void should_return_fizz_given_num_3() {
        String result = fizzBuzz.sayResult(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_buzz_given_num_5() {
        String result = fizzBuzz.sayResult(5);
        assertEquals("Buzz", result);

    }

    @Test
    public void should_return_fizzBuzz_given_num_15() {
        String result = fizzBuzz.sayResult(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_whizz_given_num_7() {
        String result = fizzBuzz.sayResult(7);
        assertEquals("Whizz", result);
    }

    @Test
    public void should_return_fizzWhizz_given_num_21() {
        String result = fizzBuzz.sayResult(21);
        assertEquals("FizzWhizz", result);
    }

    @Test
    public void should_return_buzzWhizz_given_num_70() {
        String result = fizzBuzz.sayResult(70);
        assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_fizz_given_num_contains_3() {
        String result = fizzBuzz.sayResult(30);
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_BuzzWhizz_given_num_contains_5() {
        String result = fizzBuzz.sayResult(35);
        assertEquals("BuzzWhizz", result);
    }


}
