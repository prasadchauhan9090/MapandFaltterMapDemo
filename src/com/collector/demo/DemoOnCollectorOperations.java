package com.collector.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoOnCollectorOperations {


    public static void main(String args[])
    {

        List<Integer> list = Arrays.asList(1, 20, 13, 4, 5, 6, 7, 8, 9, 10);

       List<Integer> ele =  list.stream().filter(t->t>4)
                .collect(Collectors.toList());

        System.out.println(ele);



    }
}
