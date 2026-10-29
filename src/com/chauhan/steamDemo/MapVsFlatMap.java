package com.chauhan.steamDemo;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {


    public static void main(String args[]) {


        List<Customer> customers = MyDataBase.getAll();

        //List<Customer> convert List<String> -> DATA transformation
        //mapping: customer -> customer.geEmail()
        //customer -> customer.geEmail() --> one to one mapping

        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());

         System.out.println(emails);

//        for (String email : emails) {
//            System.out.println(email);
//        }
    }
}
