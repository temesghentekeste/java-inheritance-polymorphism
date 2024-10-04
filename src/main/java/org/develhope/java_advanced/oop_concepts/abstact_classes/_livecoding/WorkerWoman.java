package org.develhope.java_advanced.oop_concepts.abstact_classes._livecoding;

public class WorkerWoman extends  Woman{
    private String jobTitle;
    private int workingHours;

    public WorkerWoman(String name, int age, String jobTitle, int workingHours) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.workingHours = workingHours;
    }

    @Override
    void work() {
        System.out.println(name +  " is " + jobTitle+ " worked hours: " + workingHours);
    }
}
