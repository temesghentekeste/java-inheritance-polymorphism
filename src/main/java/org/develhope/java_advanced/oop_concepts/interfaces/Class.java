package org.develhope.java_advanced.oop_concepts.interfaces;

/*
    1- Create "Class" interface which will have takeAttendance and getAttendanceList functions.
    implement that interface from 2 class which called "Math" and "Italian". write test cases.
 */

import java.util.ArrayList;
import java.util.List;

public interface Class {
    void takeAttendance(Person person);
    List<String> getAttendanceList();
}

class Math implements Class {
    private List<String> attendanceList;

    public Math() {
        attendanceList = new ArrayList<>();
    }

    @Override
    public void takeAttendance(Person person) {
        attendanceList.add(person.getAttendanceString());
    }

    @Override
    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class Italian implements Class {
    List<String> attendanceList;

    public Italian() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(Person person) {
        attendanceList.add(person.getAttendanceString());
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

interface Person {
    String getAttendanceString();
}

class Teacher implements Person {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String getAttendanceString() {
        return "Teacher: " + name + ", Subject: " + subject;
    }
}


class Student implements Person {
    private String name;
    private int gradeLevel;

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String getAttendanceString() {
        return "Student: " + name + ", Grade: " + gradeLevel;
    }
}




class ClassRunner {
    public static void main(String[] args) {
        // Create Teacher and Student instances
        Teacher mathTeacher = new Teacher("Alice", "Math");
        Student student1 = new Student("John Doe", 10);
        Student student2 = new Student("Jane Smith", 11);

        // Testing Math class attendance
        Class mathClass = new Math();
        mathClass.takeAttendance(mathTeacher);
        mathClass.takeAttendance(student1);
        mathClass.takeAttendance(student2);
        List<String> mathAttendance = mathClass.getAttendanceList();
        System.out.println("Math Attendance List: " + mathAttendance);

        // Testing Italian class attendance
        Teacher italianTeacher = new Teacher("Mario Rossi", "Italian");
        Student student3 = new Student("Luigi Bianchi", 12);

        Class italianClass = new Italian();
        italianClass.takeAttendance(italianTeacher);
        italianClass.takeAttendance(student3);

        List<String> italianAttendance = italianClass.getAttendanceList();
        System.out.println("Italian Attendance List: " + italianAttendance);
    }
}
