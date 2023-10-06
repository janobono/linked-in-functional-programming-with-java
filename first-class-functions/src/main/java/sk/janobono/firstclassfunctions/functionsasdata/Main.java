package sk.janobono.firstclassfunctions.functionsasdata;

import sk.janobono.firstclassfunctions.bifunctionsandbeyond.NoArgFunction;

public class Main {
    protected record Person(String name, Integer age) {
    }

    protected static class DataLoader {
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(final boolean isDevelopment) {
            this.loadPerson = isDevelopment ? this::loadPersonFake : this::loadPersonReal;
        }

        private Person loadPersonReal() {
            System.out.println("Loading person...");
            return new Person("Real Person", 30);
        }

        private Person loadPersonFake() {
            System.out.println("Returning fake person...");
            return new Person("Fake Person", 100);
        }
    }

    public static void main(final String[] args) {
        final boolean IS_DEVELOPMENT = true;
        final DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
