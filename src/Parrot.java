public class Parrot extends Bird implements Flyable {
    public Parrot(String name, String sound, String species) throws InvalidSpeciesException {
        super(name, sound, species);
    }

    public void mimic() {
        System.out.println(name + " mimics human speech.");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies high in the sky.");
    }
}