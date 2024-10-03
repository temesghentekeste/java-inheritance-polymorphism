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
