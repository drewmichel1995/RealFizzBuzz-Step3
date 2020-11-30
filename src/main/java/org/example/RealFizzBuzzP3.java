/*
Drew Michel
AdAction Coding Assessment Step 1
 */
package org.example;

public class RealFizzBuzzP3 {
    public static void main(String args[])
    {
        String result = fizzBuzz(1,20);
        System.out.println(generateReport(result));

    }

    static String fizzBuzz(int start, int end){
        String output = "";
        for(int i = start; i <= end; i++){
            output += checkNumber(i) + " ";
        }
        return output;
    }

    static String checkNumber(int number){
        if(Integer.toString(number).contains("3")){
            return "lucky";
        }else if(evenlyDivisible(number, 15)){
            return "fizzbuzz";
        }else if(evenlyDivisible(number, 5)){
            return "buzz";
        }else if(evenlyDivisible(number, 3)){
            return "fizz";
        }else{
            return Integer.toString(number);
        }
    }

    static boolean evenlyDivisible(int dividend, int divisor){
        return dividend % divisor == 0;
    }

    static String generateReport(String output){
        String[] outputs = output.split(" ");
        String report = "";
        int fizz = 0; int buzz = 0; int fizzbuzz = 0; int lucky = 0; int numbers = 0;
        for(int i = 0; i < outputs.length; i++){
            switch(outputs[i]){
                case("fizz"):
                    fizz++;
                    break;
                case("buzz"):
                    buzz++;
                    break;
                case("fizzbuzz"):
                    fizzbuzz++;
                    break;
                case("lucky"):
                    lucky++;
                    break;
                default:
                    numbers++;
                    break;
            }
        }
        return "\nfizz: " + fizz + "\nbuzz: " + buzz + "\nfizzbuzz: " + fizzbuzz + "\nlucky: " + lucky + "\nintegers: " + numbers;
    }

}