package org.example;

public class Employee implements Comparable<Employee> {
    protected String name;
    protected String surname;
    protected double salary;
    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String surname, String name, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public double calculateSalary() {
        return 0;
    }

    @Override
    public int compareTo(Employee o) {
        int surnameRes = surname.compareTo(o.surname);
        if (surnameRes == 0){
            return name.compareTo(o.name);
        }
        return surnameRes;
    }
}
