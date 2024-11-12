package level2.exercise1;

public class Main {
    public static void main(String[] args) {
        // Crear una instància de Persona
        Persona persona = new Persona("Joan", "Pérez", 30);

        // Crear una instància de GenericMethods
        GenericMethods genericMethods = new GenericMethods();

        // Cridar el mètode amb arguments de tipus genèric i String
        genericMethods.imprimirArguments(persona, "Hola món", 42);

        // Exemple amb un altre tipus genèric i un tipus fix (String)
        genericMethods.imprimirArguments("Text de prova", "String fix", new Persona("Maria", "López", 28));
    }
}