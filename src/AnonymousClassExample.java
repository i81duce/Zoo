import com.sun.org.apache.regexp.internal.RE;

public class AnonymousClassExample {
    public static void main(String[] args) {
        Reptile alligator = new Reptile() {
            @Override
            public void makeSound() {
                System.out.println("Croak");
            }
        };
        alligator.name = "Alligator";

        alligator.makeSound();
    }
}