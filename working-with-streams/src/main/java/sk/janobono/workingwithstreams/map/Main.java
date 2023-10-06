package sk.janobono.workingwithstreams.map;

import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(final String[] args) {
        final List<Integer> listOfIntegers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final Function<Integer, Integer> timesTwo = (x) -> x * 2;

        final List<Integer> result = listOfIntegers
                .stream()
                .map(timesTwo)
                .toList();

        System.out.print(result);
    }
}
