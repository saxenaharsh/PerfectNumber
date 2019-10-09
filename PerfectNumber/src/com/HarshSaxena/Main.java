package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
        // write your code here
        isPerfectNumber(5);

    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) {
            System.out.println("Invalid number");
            return false;
        }else{
            for(int i = 1; i < number; i++){
                if(number % i == 0){
                    sum += i;
                    continue;
                }

            }
            if(sum == number){
                System.out.println(sum);
                return true;

            }

        }
        return false;


    }


}

