package com.chauhan.steamDemo;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String args[]) {

        List<Customer> customers = MyDataBase.getAll();
        //List<Customer> convert List<String> -> DATA transformation
        //mapping: customer -> customer.geEmail()
        //customer -> customer.geEmail() --> one to one mapping

        List<String> emails = customers
                .stream().map(customer -> customer.getEmail())
                .collect(Collectors.toList());

         System.out.println(emails);


         System.out.println("------------------------------------------------");
        List<List<String>>  phonenumber = customers
                .stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());

        for(List<String> phone : phonenumber) {
            System.out.println(phone);
        }

        System.out.println("------------------------------------------------");

        //using flatMapp --> stram() of Stream();
        List<String>  phones = customers
                .stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        for(String myNumbers : phones) {
            System.out.println(myNumbers);
        }
//        for (String email : emails) {
//            System.out.println(email);
//        }
    }
}
