public class Snake extends Reptile {
    public Snake () {
        this.name = "Snake";
    }

    @Override
    public void makeSound() {
        System.out.println("Ssssss");
    }
}
