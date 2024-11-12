package level2.exercise2;

public class Main {
    public static void main(String[] args) {
        // Crear una instància de Persona
        Persona persona = new Persona("Joan", "Pérez", 30);

        // Crear una instància de GenericMethods
        GenericMethods genericMethods = new GenericMethods();

        // Cridar el mètode amb diferents tipus d'arguments
        genericMethods.imprimirArguments(persona, "Hola món", 42);

        // Exemple amb més arguments
        genericMethods.imprimirArguments("Text de prova", "String fix", new Persona("Maria", "López", 28), 100, 3.14);
    }
}