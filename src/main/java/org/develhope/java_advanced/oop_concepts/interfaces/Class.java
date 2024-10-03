package org.develhope.java_advanced.oop_concepts.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Class {
/*
    1- Create "Class" interface which will have takeAttendance and getAttendanceList functions.
    implement that interface from 2 class which called "Math" and "Italian". write test cases.
 */

    void takeAttendance(String studentName);
    List<String> getAttendanceList();
}

class Math implements Class {
    private List<String> attendanceList;

    public Math() {
        attendanceList = new ArrayList<>();
    }

    @Override
    public void takeAttendance(String studentName) {
        attendanceList.add(studentName);
    }

    @Override
    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class Italian implements Class {
    private List<String> attendanceList;

    public Italian() {
        attendanceList = new ArrayList<>();
    }

    @Override
    public void takeAttendance(String studentName) {
        attendanceList.add(studentName);
    }

    @Override
    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class ClassTest {
    public static void main(String[] args) {
        // Testing Math class
        Class mathClass = new Math();
        mathClass.takeAttendance("John Doe");
        mathClass.takeAttendance("Jane Smith");

        List<String> mathAttendance = mathClass.getAttendanceList();
        System.out.println("Math Attendance List: " + mathAttendance); // Expected: [John Doe, Jane Smith]

        // Testing Italian class
        Class italianClass = new Italian();
        italianClass.takeAttendance("Mario Rossi");
        italianClass.takeAttendance("Luigi Bianchi");

        List<String> italianAttendance = italianClass.getAttendanceList();
        System.out.println("Italian Attendance List: " + italianAttendance); // Expected: [Mario Rossi, Luigi Bianchi]
    }
}




