package level1.exercise2;

class GenericMethods {

    // Mètode genèric que imprimeix els tres arguments
    public <T> void imprimirArguments(T arg1, T arg2, T arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}