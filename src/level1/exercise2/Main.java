package level1.exercise2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lamine", "Yamal", 17);

        GenericMethods genericMethods = new GenericMethods();

        genericMethods.printArguments(person, "Text", 22);

        genericMethods.printArguments("Hello!", 25, new Person("Pau", "Cubarsí", 17));
    }
}