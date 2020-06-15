package com.thoughtworks;

public class FizzBuzz {
    public String sayResult(int num){
        String result  = "";
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String Whizz = "Whizz";

       // processInputContainsSpecialNum(num);
        if(String.valueOf(num).contains("7")){
            System.out.println("resultNum:" + "Fizz");
            return "Fizz";

        }

        if(String.valueOf(num).contains("5")){
            System.out.println("resultNum:" + "Fizz");
            return "BuzzWhizz";

        }
        if(String.valueOf(num).contains("3")){
            System.out.println("resultNum:" + "Fizz");
            return "Fizz";

        }

        if(num % 3 == 0){
            result  = result + Fizz;

        }
        if(num % 5 == 0){
            result  = result + Buzz;

        }

        if(num % 7 == 0){
            result  = result + Whizz;
        }

        if("".equals(result)){
            System.out.println(String.valueOf(num));
            result  = String.valueOf(num);
        }

        return result;
    }


}
