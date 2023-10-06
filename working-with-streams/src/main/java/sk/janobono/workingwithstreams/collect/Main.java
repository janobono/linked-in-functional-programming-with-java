package sk.janobono.workingwithstreams.collect;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(final String[] args) {
        final List<String> listOfWords = List.of("hello", "apple", "functional", "programming", "is", "cool");

        System.out.print(listOfWords
                .stream()
                .collect(Collectors.joining("-"))
        );

        System.out.print(listOfWords
                .stream()
                .collect(Collectors.groupingBy(String::length))
        );

        System.out.print(listOfWords
                .stream()
                .collect(Collectors.partitioningBy((word) -> word.length() > 5))
        );
    }
}
