package test;

import org.junit.Test;

public class arrayToNumber {

    @Test
    public void test1() {

        int [] numbers = {1,2,0,4,5};

        double power = Math.pow(10,numbers.length-1);
        int result = 0;

        for(int i = numbers.length-1; i >= 0; i--) {

           result += numbers[i] * power;

           power /= 10;

        }

        System.out.println(result);

    }

    @Test
    public void test2() {

        int [] numbers = {1,2,0,4,5};
        String result = "";
        for(int i = numbers.length-1; i >= 0; i--) {

          result += String.valueOf(numbers[i]);

        }

        System.out.println(result);

    }



}
