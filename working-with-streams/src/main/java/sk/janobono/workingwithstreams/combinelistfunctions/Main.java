package sk.janobono.workingwithstreams.combinelistfunctions;

import java.util.List;

public class Main {

    record Employee(String name, Integer age, String jobTitle, Float salary) {
    }

    public static void main(final String[] args) {
        final List<Employee> employees = List.of(
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f)
        );

        final Float totalDeveloperSalaries = employees
                .stream()
                .filter(employee -> "developer".equals(employee.jobTitle()))
                .map(Employee::salary)
                .reduce(0f, Float::sum);

        final Long numberOfDevelopers = employees
                .stream()
                .filter(employee -> "developer".equals(employee.jobTitle()))
                .count();

        final Float averageDeveloperSalary = totalDeveloperSalaries / numberOfDevelopers;
        System.out.println(averageDeveloperSalary);
    }
}
