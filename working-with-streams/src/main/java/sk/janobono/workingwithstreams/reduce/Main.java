package sk.janobono.workingwithstreams.reduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(final String[] args) {
        final List<Integer> listOfIntegers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final BinaryOperator<Integer> sumOperator = (acc, x) -> {
            final Integer result = acc + x;
            System.out.println("acc: " + acc + ", x: " + x + ", result: " + result);
            return result;
        };

        final Integer result = listOfIntegers
                .stream()
                .reduce(0, sumOperator);

        System.out.print(result);
    }
}
