package sk.janobono.introductiontofunctionalprogramming.firstclassfunctions;

import java.util.function.Function;

public class Main {

    public static void main(final String[] args) {
        final var function = new Function<Integer, Integer>() {

            @Override
            public Integer apply(final Integer integer) {
                return null;
            }
        };
    }
}
