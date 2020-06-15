package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Given1_when_excess_then1 {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void Given1_when_excess_then1_test(){
        fizzBuzz.sayResult(1);
        assertEquals("1","1");
    }

    @Test
    public void Given3_when_excess_then3_test(){
        fizzBuzz.sayResult(3);
        assertEquals("Fizz","Fizz");
    }

    @Test
    public void Given5_when_excess_then5_test(){
        fizzBuzz.sayResult(5);
        assertEquals("Buzz","Buzz");

    }

    @Test
    public void Given15_when_excess_then15_test(){
        fizzBuzz.sayResult(15);
        assertEquals("FizzBuzz","FizzBuzz");
    }

    @Test
    public void Given7_when_excess_then7_test(){
        fizzBuzz.sayResult(7);
        assertEquals("Whizz","Whizz");
    }

    @Test
    public void Given21_when_excess_then21_test(){
        fizzBuzz.sayResult(21);
        assertEquals("FizzWhizz","FizzWhizz");
    }

    @Test
    public void Given35_when_excess_then35_test(){
        fizzBuzz.sayResult(35);
        assertEquals("BuzzWhizz","BuzzWhizz");
    }



}
