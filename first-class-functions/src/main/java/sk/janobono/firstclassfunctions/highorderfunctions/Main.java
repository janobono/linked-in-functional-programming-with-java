package sk.janobono.firstclassfunctions.highorderfunctions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(final String[] args) {
        final BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        final Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck =
                (func) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error: second argument is zero!");
                        return 0f;
                    }
                    return func.apply(x, y);
                };

        final BiFunction<Float, Float, Float> divideSafe = secondArgIsntZeroCheck.apply(divide);

        System.out.println(divideSafe.apply(10f, 0f));
        System.out.println(divideSafe.apply(10f, 2f));
    }
}
