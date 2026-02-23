package mypackage;

public class TestPolymorphism {

    public static void main(String[] args) {

        Animal a1 = new Dog();  // Dynamic Polymorphism
        Animal a2 = new Cat();  // Dynamic Polymorphism

        a1.sound();
        a2.sound();
    }
}