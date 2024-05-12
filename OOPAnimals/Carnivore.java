public class Carnivore extends OOPAnimals {
    private String prey;

    public Carnivore(String name, String species, int age, String gender, String habitat, String prey) {
        super(name, species, age, gender, habitat);
        this.prey = prey;
    }

    // You can insert some Private field of getters and setters
    // Some additional methods can be added here within the lines.
}