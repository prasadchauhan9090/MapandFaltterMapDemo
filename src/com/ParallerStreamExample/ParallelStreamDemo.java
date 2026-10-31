package com.ParallerStreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static void main(String args[])
    {



        long start=0;
        long end=0;


//        start=System.currentTimeMillis();
//        IntStream.range(1,50).forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("Total execution time: "+(end-start)+"ms");
//
//        System.out.println("=================================");
//
//        start=System.currentTimeMillis();
//        IntStream.range(1,50).parallel().forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("Parallel execution time: "+(end-start)+"ms");


        IntStream.rangeClosed(1,10).forEach(i-> {
            System.out.println("THREAD: " + Thread.currentThread().getName() + ":" + i);
        });

        IntStream.rangeClosed(1,10).parallel().forEach(i-> {
            System.out.println("THREAD: " + Thread.currentThread().getName() + ":" + i);
        });







    }
}
