package level2.exercise1;

class GenericMethods {
    public <T> void printArguments(T arg1, String arg2, T arg3) {
        System.out.println("Argument 1 (generic): " + arg1);
        System.out.println("Argument 2 (String): " + arg2);
        System.out.println("Argument 3 (generic): " + arg3);
    }
}