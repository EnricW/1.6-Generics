package level2.exercise1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lamine", "Yamal", 17);

        GenericMethods genericMethods = new GenericMethods();

        genericMethods.printArguments(person, "Hello!", 42);

        genericMethods.printArguments("Text", "Another text", new Person("Pau", "Cubarsí", 17));
    }
}