package com.thoughtworks;

public class FizzBuzz {
    public String sayResult(int num){
        if(num % 3 == 0){
            System.out.println("resultNum:" + "Fizz");
            return "Fizz";

        }
        System.out.println("resultNum:" + num);
        return String.valueOf(num);
    }
}
