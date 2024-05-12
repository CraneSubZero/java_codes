public class Lion extends Carnivore {
    public Lion(String name, int age, String gender, String habitat) {
        super(name, "Lion", age, gender, habitat, "Antelope");
    } // To emphasize the lion put the "" and its specific prey which is the "Antelope"

    public void eat() {
        System.out.println("The lion is eating meat."); // Which is the Antelope
    }
}