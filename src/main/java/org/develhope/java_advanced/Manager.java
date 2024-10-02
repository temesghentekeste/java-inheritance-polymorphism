package org.develhope.java_advanced;

import java.util.Objects;
import java.util.UUID;

public class Manager extends Person {
    /*
        3- Create Manager class, it should have managerId (auto generate) and
        actionNumber( set zero when you created the object so it should assign 0 in the constructor)

        //        Required extra functions: getActionNumber, setActionNumber and getManagerID

        //        Overide toString again and print extra managerID
        override equals function and check if username and password matchs
        or managerIDand password match.  IF any of cases are correct we will return true.

        1- Create increase money and decrease money function from manager

            Create a function called updateMoney(Customer, changeAmount);

            then change the money of customer. change amount can be negative so basicly we need to do => previous amount + changeAmount into customer account.

            Deadline 3.15pm
     */
    private int managerId;
    private int actionNumber;

    public Manager(String name, int age, String username, String passowrd) {
        super(name, age, username, passowrd);
        this.managerId = generateManagerId();
        this.actionNumber = 0;
    }

    private int generateManagerId() {
        return (int) (100*Math.random());
    }

    public int getManagerId() {
        return managerId;
    }

    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId + "\n" +
                super.toString() +
                '}';
    }

    public void updateMoney(Customer customer, double changeAmount) {
        customer.setBalance(customer.getBalance() + changeAmount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return super.equals(o) || (managerId == manager.managerId && getPassword().equals(manager.getPassword()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), managerId, actionNumber);
    }
}
