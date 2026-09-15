public class Main {
    public static void main(String[] args) {
        try {
            Parrot p = new Parrot("Kiwi", "Squawk", "African Grey");
            p.makeSound();
            p.layEggs();
            p.fly();
            p.mimic();

            Parrot invalid = new Parrot("NoName", "Squawk", "");
        } catch (InvalidSpeciesException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}