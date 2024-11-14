package level2.exercise2;

class GenericMethods {
    public <T> void printArguments(T... args) {
        for (T arg : args) {
            System.out.println("Argument: " + arg);
        }
    }
}