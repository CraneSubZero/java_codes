public class Zebra extends OOPAnimals {
    public Zebra(String name, int age, String gender, String habitat) {
        super(name, "Zebra", age, gender, habitat);
    } // To emphasize the Zebra put the "" to it while putting it on the method.

    public void eat() {
        System.out.println("The zebra is grazing on grass.");
    }
}