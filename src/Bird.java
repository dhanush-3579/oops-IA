public class Bird extends Animal {
    protected String species;

    public Bird(String name, String sound, String species) throws InvalidSpeciesException {
        super(name, sound);
        if (species == null || species.trim().isEmpty()) {
            throw new InvalidSpeciesException("Species name cannot be empty.");
        }
        this.species = species;
    }

    public void layEggs() {
        System.out.println(name + " (" + species + ") lays eggs.");
    }
}