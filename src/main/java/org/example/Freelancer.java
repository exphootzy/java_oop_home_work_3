package org.example;

public class Freelancer  extends Employee{
    public Freelancer(String surname, String name, int age, double salary) {
        super(surname, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Freelancer; %d years old; Monthly avarage salary (not fixed): %.2f (rub.)", surname, name, age, calculateSalary());
    }
}
