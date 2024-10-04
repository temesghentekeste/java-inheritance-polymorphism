package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments;

class WorkerWoman extends Woman {
    public WorkerWoman(String name, int age) {
        super(name, age);
    }

    // Override the work method
    @Override
    public void work() {
        System.out.println(name + " is a WorkerWoman and is doing a professional job.");
    }
}