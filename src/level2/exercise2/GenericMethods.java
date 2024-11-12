package level2.exercise2;

class GenericMethods {

    // Mètode genèric que accepta una llista d'arguments de tipus genèric
    public <T> void imprimirArguments(T... args) {
        for (T arg : args) {
            System.out.println("Argument: " + arg);
        }
    }
}