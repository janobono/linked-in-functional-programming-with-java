package sk.janobono.workingwithstreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter3Challenge2 {
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

        // Map average of salaries by jobTitle

        final Map<String, Float> averageSalariesMap = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::jobTitle))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .map(Employee::salary)
                                .reduce(0f, Float::sum) / entry.getValue().size()
                ));
        System.out.println(averageSalariesMap);
    }
}
