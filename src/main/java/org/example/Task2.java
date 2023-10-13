package org.example;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    static Random random = new Random();
    static Worker generateWorker(){
        String[] names = new String[] {"Aybars","Anna","Artem", "Kristina", "Javohir"};
        String[] surnames = new String[] {"Kudrow","Demir","Smit", "Black"};

        int age = random.nextInt(20, 66);

        int salary = random.nextInt(50000, 110000);

        Worker worker = new Worker(surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)], age, salary);
        return worker;
    }

    static Freelancer generateFreelancer(){
        String[] names = new String[] {"Anasteisha","Grigoryy","Ayse", "Woody", "Ben"};
        String[] surnames = new String[] {"Hopkins","Kubrick","Jackson", "Khalkin"};

        int salary = random.nextInt(1000, 1500);
        int age = random.nextInt(20, 66);

        Freelancer freelancer = new Freelancer(surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)], age, salary);
        return freelancer;
    }
    static Employee [] generateEmployees(int count) {

        Employee[] employees = new Employee[count];
        int typeOfEmployee;
        for (int i = 0; i < employees.length; i++) {
            typeOfEmployee = random.nextInt(2);
            if (typeOfEmployee == 1) employees[i] = generateWorker();
            else employees[i] = generateFreelancer();
        }
        return employees;
    }
    public static void main(String[] args) {
        Employee [] employees = generateEmployees(15);

        Arrays.sort(employees, new SalaryComparator((SortType.Ascending)));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new SalaryComparator((SortType.Descending)));

        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();

        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();

        Arrays.sort(employees, new AgeComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }
}
