// Class demonstrating Characteristics of Polymorphism
class AnimalShape {
    // 1. Compile-Time Polymorphism (Method Overloading)
    // Dynamic parameters/signatures in the same class
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sound(String animalType) {
        System.out.println(animalType + " makes a specific sound");
    }
}

// 2. Runtime Polymorphism (Method Overriding & Dynamic Binding)
class CatShape extends AnimalShape {
    @Override
    void sound() {
        System.out.println("Cat meows (Runtime Polymorphism)");
    }
}

public class PolymorphismCharacteristics {
    public static void main(String[] args) {
        // Feature 1: Compile-time Polymorphism
        AnimalShape a = new AnimalShape();
        a.sound();               // Calls general method
        a.sound("Dog");          // Calls overloaded method

        // Feature 2: Runtime Polymorphism (Parent reference, Child object)
        AnimalShape myCat = new CatShape(); // Dynamic Method Dispatch
        myCat.sound();           // Calls overridden method in CatShape
    }
}