package sk.janobono.firstclassfunctions.thefunctioninterface;

import java.util.function.Function;

public class Main {
    protected static class MyMath {
        public static Integer triple(final Integer x) {
            return x * 3;
        }
    }

    public static void main(final String[] args) {
        final Function<Integer, Integer> myTriple = MyMath::triple;
        final Integer result = myTriple.apply(5);
        System.out.println(result);
    }
}
