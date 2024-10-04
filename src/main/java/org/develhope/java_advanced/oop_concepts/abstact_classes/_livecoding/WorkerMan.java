package org.develhope.java_advanced.oop_concepts.abstact_classes._livecoding;

public class WorkerMan extends Man{
    private String jobTitle;
    private int workingHours;

    public WorkerMan(String name, int age, String jobTitle, int workingHours) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.workingHours = workingHours;
    }

//    3 - Add working hours to worker classes and add a work() function.
//    when we run work function we should see: "Name worked .. hours"

    @Override
    void work() {
        System.out.println(name +  " is " + jobTitle+ " worked hours: " + workingHours);
    }

}
