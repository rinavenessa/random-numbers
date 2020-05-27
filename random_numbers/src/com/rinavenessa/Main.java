package com.rinavenessa;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        int[] numbers = new int[10];
//         int min =Integer.MIN_VALUE;
//        int  max = Integer.MAX_VALUE;
//         for (int i = 0; i < numbers.length; i++)
//         {
//             numbers[i]= new Random().nextInt(100);
//
//         }
//        for (int i = 0; i < numbers.length; i++)
//        {
//            if (numbers[i] < min )
//                min = numbers[i];
//            if(numbers[i]> max)
//                max = numbers[i];
//        }
//        System.out.println("Random numbers "+Arrays.toString(numbers));
//        System.out.println("minimum value: "+min);
//        System.out.println("maximum value: "+max);
//
//    }
//}
        double[] val = new double[10];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        System.out.println("Random number array...");
        for (int i = 0; i < val.length; i++) {
            val[i] = new Random().nextInt(100);
            System.out.println(val[i]);
        }
        for (int i = 0; i < val.length; i++) {
            if (val[i] < min)
                min = val[i];
            if (val[i] > max)
                max = val[i];
        }
        System.out.println("Minimum element = " + min);
        System.out.println("Maximum element = " + max);
    }
}