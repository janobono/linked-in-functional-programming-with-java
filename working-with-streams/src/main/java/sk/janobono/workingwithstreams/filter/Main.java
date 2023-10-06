package sk.janobono.workingwithstreams.filter;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(final String[] args) {
        final List<Integer> listOfIntegers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final Predicate<Integer> isEven = (x) -> x % 2 == 0;

        final List<Integer> result = listOfIntegers
                .stream()
                .filter(isEven)
                .toList();

        System.out.print(result);

        final List<String> listOfWords = List.of("hello", "functional", "programming", "is", "cool");

        final Function<Integer, Predicate<String>> createLengthTest = (minLength) -> {
            return (str) -> str.length() > minLength;
        };

        final Predicate<String> isLongerThan3 = createLengthTest.apply(3);

        final List<String> wordResult = listOfWords
                .stream()
                .filter(isLongerThan3)
                .toList();

        System.out.print(wordResult);
    }
}
