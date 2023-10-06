package sk.janobono.firstclassfunctions.returningfunctions;

import sk.janobono.firstclassfunctions.bifunctionsandbeyond.NoArgFunction;

import java.util.function.Function;

public class Main {
    protected static class MyMath {
        public static Integer timesTwo(final Integer x) {
            return x * 2;
        }

        public static Integer timesThree(final Integer x) {
            return x * 3;
        }

        public static Integer timesFour(final Integer x) {
            return x * 4;
        }

        public static Function<Integer, Integer> createMultiplier(final Integer y) {
            return (Integer x) -> x * y;
        }
    }

    public static void main(final String[] args) {
        final NoArgFunction<NoArgFunction<String>> createPrinter = () -> () -> "Hello functional!";

        final NoArgFunction<String> greeter = createPrinter.apply();

        System.out.println(greeter.apply());

        final Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
        final Function<Integer, Integer> timesThree = MyMath.createMultiplier(3);
        final Function<Integer, Integer> timesFour = MyMath.createMultiplier(4);

        System.out.println(timesTwo.apply(6));
        System.out.println(timesThree.apply(6));
        System.out.println(timesFour.apply(6));
    }
}
