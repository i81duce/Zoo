public class Animal {
    public String name;

    public void makeSound() {
        System.out.println("Nothing");
    }

    @Override
    public String toString() {
        return this.name;
    }
}