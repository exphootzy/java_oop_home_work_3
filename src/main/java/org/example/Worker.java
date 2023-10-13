package org.example;

public class Worker extends Employee {
    public Worker(String surname, String name, int age, double salary) {
        super(surname, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Worker; %d years old; Monthly salary (fixed): %.2f (rub.)", surname, name, age, calculateSalary());
    }
}
