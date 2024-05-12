public class Main {
    public static void main(String[] args) {
        OOPAnimals simba = new Lion("Simba", 5, "Male", "Grassland");
        OOPAnimals stripes = new Zebra("Stripes", 3, "Female", "Savannah");

        // Some of the Additional animals can be created and methods can be called here through encapsulation process
        // Example:
        ((Lion) simba).eat();
        ((Zebra) stripes).eat();
    }
}