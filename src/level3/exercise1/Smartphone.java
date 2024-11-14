package level3.exercise1;

class Smartphone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    public void takePhotos() {
        System.out.println("Taking photos...");
    }
}
