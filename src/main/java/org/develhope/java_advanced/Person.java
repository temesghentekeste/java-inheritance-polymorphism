package org.develhope.java_advanced;

import java.util.Objects;

public class Person {
    /*
        Create Person class, it should have name, age, username, password.
            Override toString function to just print name and age in a good format.
            Override equals function to check username and password.
     */

    private String name;
    private int age;
    private String username;
    private String password;

    public Person(String name, int age, String username, String passowrd) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = passowrd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(username, person.username) && Objects.equals(password, person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
