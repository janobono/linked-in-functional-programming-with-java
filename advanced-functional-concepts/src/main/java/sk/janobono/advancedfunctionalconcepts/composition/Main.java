package sk.janobono.advancedfunctionalconcepts.composition;

import java.util.List;
import java.util.function.Function;

public class Main {
    record Employee(String name, Integer age, String jobTitle, Float salary) {
    }

    public static void main(final String[] args) {
        final Function<Integer, Integer> timesTwo = x -> x * 2;
        final Function<Integer, Integer> minusOne = x -> x - 1;

        final Function<Integer, Integer> timesTwoMinusOne = timesTwo.andThen(minusOne);

        System.out.println(timesTwoMinusOne.apply(10));

        final List<Employee> employees = List.of(
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f)
        );

        final Function<Employee, String> getName = employee -> employee.name;
        final Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();
        final Function<String, String> uppercase = str -> str.toUpperCase();

        final Function<Employee, String> getReversedUppercasedName = getName.andThen(reverse).andThen(uppercase);

        final List<String> results = employees
                .stream()
                .map(getReversedUppercasedName)
                .toList();

        System.out.println(results);
    }
}
