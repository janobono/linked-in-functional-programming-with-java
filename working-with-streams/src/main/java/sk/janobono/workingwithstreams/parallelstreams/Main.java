package sk.janobono.workingwithstreams.parallelstreams;

import java.util.List;

public class Main {

    record Employee(String name, Integer age, String jobTitle, Float salary) {
    }

    public static void main(final String[] args) {
        final List<String> words = List.of("hello", "apple", "functional", "programming", "is", "cool");

        final List<String> processedWords = words
                .parallelStream()
                .map(word -> {
                    System.out.println("Uppercasing " + word);
                    return word.toUpperCase();
                })
                .map(word -> {
                    System.out.println("Adding exclamation point to " + word);
                    return word + '!';
                })
                .toList();

        System.out.println(processedWords);
    }
}
