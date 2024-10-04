package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments;

class WorkerWoman extends Woman {
    private String jobTitle;
    public WorkerWoman(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Override the work method
    @Override
    public void work() {
        System.out.println(name + " is a WorkerWoman and is " + getJobTitle());
    }
}