package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments.person_worker;

class WorkerWoman extends Woman {
    private String jobTitle;
    private int workingHours;
    public WorkerWoman(String name, int age, String jobTitle, int workingHours) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.workingHours = workingHours;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    // Override the work method
    @Override
    public void work() {
        System.out.println(name + " is a WorkerWoman and is " + getJobTitle() + " and worked " + getWorkingHours());
    }
}