// Main class to test polymorphism
public class AnimalTest {
    public static void main(String[] args) {
        Animal myDog = new Dog("Bruno", 5);
        Animal myCat = new Cat("Whiskers", 3);
        Animal myBird = new Bird("Tweety", 2);

        myDog.makeSound();   // Bruno says: Woof woof!
        myCat.makeSound();   // Whiskers says: Meow!
        myBird.makeSound();  // Tweety says: Tweet tweet!
    }
}
