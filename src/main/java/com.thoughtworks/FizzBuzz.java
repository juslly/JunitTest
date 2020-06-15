package com.thoughtworks;

public class FizzBuzz {
    public String sayResult(int num){

        if(String.valueOf(num).contains("3")){
            System.out.println("resultNum:" + "Fizz");
            return "Fizz";

        }
        if(num % 3 == 0 && num % 5 == 0 && num % 7 == 0){
            System.out.println("resultNum:" + "FizzBuzzWhizz");
            return "FizzBuzzWhizz";

        }
        if(num % 3 == 0 && num % 5 == 0 ){
            System.out.println("resultNum:" + "FizzBuzz");
            return "FizzBuzz";

        }

        if(num % 3 == 0 && num % 7 == 0 ){
            System.out.println("resultNum:" + "FizzWhizz");
            return "FizzWhizz";

        }
        if(num % 5 == 0 && num % 7 == 0 ){
            System.out.println("resultNum:" + "BuzzWhizz");
            return "BuzzWhizz";

        }



        if(num % 3 == 0){
            System.out.println("resultNum:" + "Fizz");
            return "Fizz";

        }
        if(num % 5 == 0){
            System.out.println("resultNum:" + "Buzz");
            return "Buzz";

        }

        if(num % 7 == 0){
            System.out.println("resultNum:" + "Whizz");
            return "Whizz";
        }

        System.out.println("resultNum:" + num);
        return String.valueOf(num);
    }
}
