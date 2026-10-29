package com.chauhan.steamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyDataBase {

    public static List<Customer> getAll() {
        return Stream.of(

                new Customer(101, "chauhan", "prasad@gmail.com", Arrays.asList("34435235", "34523525")),
                new Customer(102, "roshan", "roshan@gmail.com", Arrays.asList("9876543210", "9123456780")),
                new Customer(103, "kiran", "kiran@gmail.com", Arrays.asList("8765432109", "9012345678")),
                new Customer(104, "prasad", "prasad123@gmail.com", Arrays.asList("7654321098", "8901234567")),
                new Customer(105, "suresh", "suresh@gmail.com", Arrays.asList("6543210987", "7890123456")),
                new Customer(106, "mahesh", "mahesh@gmail.com", Arrays.asList("5432109876", "6789012345")),
                new Customer(107, "ramesh", "ramesh@gmail.com", Arrays.asList("4321098765", "5678901234")),
                new Customer(108, "venkat", "venkat@gmail.com", Arrays.asList("3210987654", "4567890123")),
                new Customer(109, "sai", "sai@gmail.com", Arrays.asList("2109876543", "3456789012")),
                new Customer(110, "rahul", "rahul@gmail.com", Arrays.asList("1098765432", "2345678901"))
        ).collect(Collectors.toList());
    }
}
