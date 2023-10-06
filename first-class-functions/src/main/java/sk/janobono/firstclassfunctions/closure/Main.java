package sk.janobono.firstclassfunctions.closure;

import sk.janobono.firstclassfunctions.bifunctionsandbeyond.NoArgFunction;

public class Main {

    public static void main(final String[] args) {
        final NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            final String name = "John";
            return () -> "Hello, " + name;
        };

        final NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
    }
}
