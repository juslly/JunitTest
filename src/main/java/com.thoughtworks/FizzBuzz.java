package com.thoughtworks;

public class FizzBuzz {
    public String sayResult(int num) {
        String result = "";
        //包含特殊数字处理
        result = processInputContainsSpecialNum(num);
        if (result.equals("")) {
            //对倍数进行处理
            result = processInputDoubleNum(num);
            if ("".equals(result)) {
                System.out.println(String.valueOf(num));
                result = String.valueOf(num);
            }

        }
        return result;
    }

    private String processInputDoubleNum(int num) {
        String result = "";
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String Whizz = "Whizz";
        if (num % 3 == 0) {
            result = result + Fizz;

        }
        if (num % 5 == 0) {
            result = result + Buzz;

        }

        if (num % 7 == 0) {
            result = result + Whizz;
        }
        return result;

    }

    private String processInputContainsSpecialNum(int num) {

        if (String.valueOf(num).contains("7")) {
            System.out.println("resultNum:" + "Fizz");
            return "Fizz";

        }

        if (String.valueOf(num).contains("5")) {
            System.out.println("resultNum:" + "Fizz");
            return "BuzzWhizz";

        }
        if (String.valueOf(num).contains("3")) {
            System.out.println("resultNum:" + "Fizz");
            return "Fizz";

        }
        return "";

    }
}
