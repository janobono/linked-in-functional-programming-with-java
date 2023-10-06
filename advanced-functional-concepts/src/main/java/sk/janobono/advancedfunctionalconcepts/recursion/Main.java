package sk.janobono.advancedfunctionalconcepts.recursion;

public class Main {

    static void countDown(final Integer x) {
        if (x < 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countDown(x - 1);
    }

    static void countUp(final Integer x, final Integer end) {
        if (x > end) {
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        countUp(x + 1, end);
    }

    public static void main(final String[] args) {
        countUp(0, 10);
    }
}
