package level1.exercise2;

public class Main {
    public static void main(String[] args) {
        // Crear una instància de Persona
        Persona persona = new Persona("Joan", "Pérez", 30);

        // Crear una instància de GenericMethods
        GenericMethods genericMethods = new GenericMethods();

        // Cridar el mètode genèric amb diferents tipus de paràmetres

        // Exemple amb Persona, String i int
        genericMethods.imprimirArguments(persona, "Hola món", 42);

        // Exemple amb String, int i Persona (ordre canviat)
        genericMethods.imprimirArguments("Salutacions!", 25, new Persona("Maria", "López", 28));
    }
}