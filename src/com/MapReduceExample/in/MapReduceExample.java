package com.MapReduceExample.in;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

    public static void main(String args[])
    {

        List<Integer> numbers = Arrays.asList(19, 12, 32, 41, 25);
       // numbers.stream().map().reduce(0,(a,b)->System.out.println(a+b));

        //normal approach
        int sum=0;
        for(int num : numbers)
        {
            sum=sum+num;
        }
        System.out.println(sum);


        //stream approach
       int sum1= numbers.stream().mapToInt(i->i).sum();
        System.out.println("stream approach "+sum1);


        //reduce approach
      Integer sum2= numbers.stream().reduce(0,(a,b)->a+b);
       System.out.println("reduce approach "+sum2);

       //using optionalReduce method
        Optional<Integer> reduceMethodSum = numbers.stream().reduce(Integer::sum);
        System.out.println("using optionalReduce method " +reduceMethodSum.get());


        //multiply
       Integer multiNum =  numbers.stream().reduce(1,(a,b)->a*b);
       System.out.println("using multiNum "+multiNum);


       //maxValue
        Integer MaxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("using MaxValue "+MaxValue);

        //minValue
        Integer MinValue = numbers
                .stream()
                .reduce((a, b) -> a < b ? a : b)
                .orElseThrow();
        System.out.println("using MinValue "+MinValue);


        //MAxValue with method reference
       Integer maxValueWithMethodReference = numbers.stream().reduce(Integer::max).get();
       System.out.println("using maxValueWithMethodReference "+maxValueWithMethodReference);


    }
}
