package org.example;
import java.util.Arrays;
import java.util.random.*;
import static java.lang.Math.*;


public class NumberCruncherApp {
    public static void main(String[] args) {
        var numbers = new int[10];

        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = (int)(Math.random()*51);

        }
        Arrays.sort(numbers);
        printArray(numbers);


    }
    private static void printArray(int[] x)
    {
        double total = 0;
        double median;

        double length = x.length;
        for(int i = 0; i < x.length; i++)
        {
            System.out.println("Element "+ i + " is :" + x[i]);
            total += x[i];
        }
        double average = total/x.length;
        if((x.length)%2 != 0){
            median = x[(int)(x.length/2)];
        }
        else
        {
            median = ((double)x[(int)(x.length/2)] + (double)x[(int)((x.length/2)-1)])/2;
        }
        double sum = 0;
        for(int i = 0; i < x.length; i++)
        {
            sum += Math.pow((x[i]-average),2);
        }
        sum = sum/length;
        double st = Math.sqrt(sum);


        System.out.println(total);
        System.out.println("Count: " + x.length);
        System.out.println("Average: " + average);
        System.out.println("Median: " + median);
        System.out.println("Standard deviation: " + st);
    }
}