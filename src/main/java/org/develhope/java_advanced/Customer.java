package org.develhope.java_advanced;

import java.util.Objects;
import java.util.UUID;

public class Customer extends Person {
    /*
    2- Create Customer class, it should extend Person  class and
    it should have extra customerID(auto genarate we will not have it on constructor) and balance.

        Required extra functions: getBalance, setBalance and getCustomerID

        Overide toString again and print extra customerID
        override equals function and check if username and password matchs
        or customerID and password match.  IF any of cases are correct we will return true.
     */
    private int customerId;
    private double balance;
    public Customer(String name, int age, String username, String passowrd, int customerId) {
        super(name,age, username, passowrd);
        this.customerId = generateCustomerId();
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private int generateCustomerId() {
        return (int) (1000000 * Math.random());
    }

    @Override
    public String toString() {

        return super.toString() +  "Customer{" +
                "customerId=" + customerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return super.equals(o) || ( customerId == customer.customerId && Objects.equals(getPassword(), customer.getPassword()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerId, getPassword());
    }
}
