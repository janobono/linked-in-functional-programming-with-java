package sk.janobono.introductiontofunctionalprogramming.functionalpurity;

public class Main {

    public static void main(final String[] args) {
        // function is pure - always same results with same inputs
        final var result = add(12, 15);
    }

    public static int add(final int x, final int y) {
        return x + y;
    }
}
