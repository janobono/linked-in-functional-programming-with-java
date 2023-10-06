package sk.janobono.advancedfunctionalconcepts.partialapplicationandcurrying;

import java.util.function.Function;

public class Main {

    public static void main(final String[] args) {
        final TriFunction<Integer, Integer, Integer, Integer> add =
                (x, y, z) -> x + y + z;

        final Function<Integer, Function<Integer, Function<Integer, Integer>>> addPartial =
                (x) -> (y) -> (z) -> add.apply(x, y, z);

        final Function<Integer, Function<Integer, Integer>> add5 = addPartial.apply(5);
        final Function<Integer, Integer> add5And6 = add5.apply(6);
        final Integer sum = add5And6.apply(7);

        System.out.println(sum);
    }
}
