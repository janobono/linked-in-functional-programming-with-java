package sk.janobono.firstclassfunctions.bifunctionsandbeyond;

import java.util.function.BiFunction;

public class Main {

    public static void main(final String[] args) {
        final BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(32, 32));

        final TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;
        System.out.println(addThree.apply(54, 3, 4));

        final NoArgFunction<String> sayHello = () -> "Hello!";
        System.out.println(sayHello.apply());
    }
}
