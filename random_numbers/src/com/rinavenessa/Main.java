package com.rinavenessa;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
       int[] numbers = new int[10];
        int min =Integer.MAX_VALUE;
       int  max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i]= new Random().nextInt(100);

        }
       for (int i = 0; i < numbers.length; i++)
       {
           if (numbers[i] > min )
               min = numbers[i];
           if(numbers[i]< max)
               max = numbers[i];
       }
       System.out.println("Random numbers "+Arrays.toString(numbers));
       System.out.println("minimum value: "+min);
       System.out.println("maximum value: "+max);

   }
}
       
