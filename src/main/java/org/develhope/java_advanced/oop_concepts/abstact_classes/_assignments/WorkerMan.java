package org.develhope.java_advanced.oop_concepts.abstact_classes._assignments;

class WorkerMan extends Man {
    public WorkerMan(String name, int age) {
        super(name, age);
    }

    // Override the work method
    @Override
    public void work() {
        System.out.println(name + " is a WorkerMan and is doing a manual job.");
    }
}