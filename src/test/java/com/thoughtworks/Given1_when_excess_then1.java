package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Given1_when_excess_then1 {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void given1_when_excess_then1_test(){
       String str =  fizzBuzz.sayResult(1);
        assertEquals("1",str);
    }

    @Test
    public void given3_when_excess_then3_test(){
        String str = fizzBuzz.sayResult(3);
        assertEquals("Fizz",str);
    }

    @Test
    public void given5_when_excess_then5_test(){
        String str = fizzBuzz.sayResult(5);
        assertEquals("Buzz",str);

    }

    @Test
    public void given15_when_excess_then15_test(){
        String str = fizzBuzz.sayResult(15);
        assertEquals("FizzBuzz",str);
    }

    @Test
    public void given7_when_excess_then7_test(){
        String str = fizzBuzz.sayResult(7);
        assertEquals("Whizz",str);
    }

    @Test
    public void given21_when_excess_then21_test(){
        String str = fizzBuzz.sayResult(21);
        assertEquals("FizzWhizz",str);
    }

    @Test
    public void given35_when_excess_then35_test(){
        String str = fizzBuzz.sayResult(35);
        assertEquals("BuzzWhizz",str);
    }



}
