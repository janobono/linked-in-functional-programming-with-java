package sk.janobono.firstclassfunctions.lambdaexpressions;

import java.util.function.Function;

public class Main {

    public static void main(final String[] args) {
        final Function<Integer, Integer> myTriple = (x) -> x * 3;
        final Integer result = myTriple.apply(5);
        System.out.println(result);

        final Function<Integer, Integer> absoluteValue = (x) -> x > 0 ? x : -x;
        final Integer abs = absoluteValue.apply(-5);
        System.out.println(abs);
    }
}
