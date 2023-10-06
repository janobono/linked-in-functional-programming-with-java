package sk.janobono.workingwithstreams;

import java.util.List;

public class Chapter3Challenge1 {
    record Person(String name, Integer age) {
    }

    record Car(String make, String color, Float price) {
    }

    record Employee(String name, Integer age, String jobTitle, Float salary) {
    }

    public static void main(final String[] args) {
        final List<Person> people = List.of(
                new Person("Brandon", 23),
                new Person("Hank", 43),
                new Person("Jenna", 33),
                new Person("Veronica", 56),
                new Person("Jack", 27)
        );

        // Get a list that contains all the people's names

        final List<String> peopleNames = people
                .stream()
                .map(Person::name)
                .toList();
        System.out.println(peopleNames);


        final List<Car> cars = List.of(
                new Car("Chevy", "red", 45000f),
                new Car("Ford", "blue", 23000f),
                new Car("Toyota", "grey", 14000f),
                new Car("Lamborghini", "blue", 150000f),
                new Car("Renault", "blue", 150000f)
        );

        // Give a list of all the blue cars

        final List<Car> blueCars = cars
                .stream()
                .filter(c -> "blue".equals(c.color()))
                .toList();
        System.out.println(blueCars);

        final List<Employee> employees = List.of(
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f)
        );

        // Find the sum of all the employees' salaries
        final Float salarySum = employees
                .stream()
                .map(Employee::salary)
                .reduce(0f, Float::sum);
        System.out.println(salarySum);
    }
}
