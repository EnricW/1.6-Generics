package level2.exercise1;

class GenericMethods {

    // Mètode que accepta un argument genèric i un tipus fix (String) més un altre genèric
    public <T> void imprimirArguments(T arg1, String arg2, T arg3) {
        System.out.println("Argument 1 (genèric): " + arg1);
        System.out.println("Argument 2 (String): " + arg2);
        System.out.println("Argument 3 (genèric): " + arg3);
    }
}