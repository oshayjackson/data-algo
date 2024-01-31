package com.algorithms;

import java.util.Objects;

public class Customer {

    private Integer custNo;
    private String name;
    private float balance;

    public Customer(int custNo, String name, float balance) {
        this.custNo = custNo;
        this.name = name;
        this.balance = balance;
    }

//    public void setCustNo(int custNo) {
//        this.custNo = custNo;
//    }

    public int getCustNo() {
        return custNo;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public void makePayment(float payment) {
        if (payment > 0) {
            balance -= payment;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custNo=" + custNo +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Customer customer = (Customer) o;
        return custNo == customer.custNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(custNo);
    }
}
