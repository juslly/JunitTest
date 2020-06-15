package com.thoughtworks;

import org.junit.Test;

public class Given1_when_excess_then1 {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void Given1_when_excess_then1_test(){
        fizzBuzz.sayResult(1);
    }

    @Test
    public void Given3_when_excess_then3_test(){
        fizzBuzz.sayResult(3);
    }



}
