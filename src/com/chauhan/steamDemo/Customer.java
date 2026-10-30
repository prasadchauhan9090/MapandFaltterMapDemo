package com.chauhan.steamDemo;

import java.util.List;

public class Customer {

    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;
    private int custBill;

    public Customer()
    {

    }


    public Customer(int id, String name, String email, List<String> phoneNumbers, int custBill) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.custBill = custBill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public int getCustBill() {
        return custBill;
    }

    public void setCustBill(int custBill) {
        this.custBill = custBill;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", custBill=" + custBill +
                '}';
    }
}
