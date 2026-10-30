package com.OptionalDemo;

import com.chauhan.steamDemo.Customer;
import com.chauhan.steamDemo.MyDataBase;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassDemo {

    public static Customer getCustomerByEmailId(String email) {
        List<Customer> customers = MyDataBase.getAll();
        return customers.stream().filter(customer -> customer.getEmail().equals(email)).findAny().get();
    }
    public static void main(String args[])
    {



        Customer customer = new Customer(101,"chauhan","chauhan k prasad", Arrays.asList("9952323","232435"));


//        Optional<String> emailOptional = Optional.of(cuustomer.getEmail());
//        System.out.println(emailOptional);

        Optional<String>  emailOptinal = Optional.ofNullable(customer.getEmail());
        System.out.println(emailOptinal);


        System.out.println(emailOptinal.map(String::toUpperCase).orElseGet(()->"DEFAULT EMAIL.."));


        //empty
        //of
        //ofNullable


        Optional<Object> emp = Optional.empty();

        System.out.println(emp);

        getCustomerByEmailId("pkd");

    }
}
