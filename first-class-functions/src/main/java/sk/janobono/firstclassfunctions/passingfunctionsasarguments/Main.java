package sk.janobono.firstclassfunctions.passingfunctionsasarguments;

import java.util.function.BiFunction;

public class Main {
    public static class MyMath {
        public static Integer add(final Integer x, final Integer y) {
            return x + y;
        }

        public static Integer subtract(final Integer x, final Integer y) {
            return x - y;
        }

        public static Integer combine2and3(final BiFunction<Integer, Integer, Integer> combineFunc) {
            return combineFunc.apply(2, 3);
        }
    }

    public static void main(final String[] args) {
        System.out.println(MyMath.combine2and3(MyMath::add));
        System.out.println(MyMath.combine2and3(MyMath::subtract));
        System.out.println(MyMath.combine2and3((x, y) -> 2 * x + 2 * y));
    }
}
