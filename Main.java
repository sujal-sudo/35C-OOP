public class task3 {
    public static void main(String[] args){

    }
    
}
// Base class
class Animal {
    String name;
    
    void speak() {
        System.out.println("Animal speaks");
    }
}

// Mammal class inheriting from Animal
class Mammal extends Animal {
    String species;
    
    void fur() {
        System.out.println("Mammal has fur");
    }
}

// Reptile class inheriting from Animal
class Reptile extends Animal {
    String egg;
    
    void shed() {
        System.out.println("Reptile sheds skin");
    }
}

// Amphibian class inheriting from Animal
class Amphibian extends Animal {
    String scale;
    
    void swim() {
        System.out.println("Amphibian swims");
    }
}

// Dog class inheriting from Mammal
class Dog extends Mammal {
    String breed;
    
    void bark() {
        System.out.println("Dog barks");
    }
}

// Cat class inheriting from Mammal
class Cat extends Mammal {
    String origin;
    
    void meow() {
        System.out.println("Cat meows");
    }
}

// Labrador class inheriting from Dog
class Labrador extends Dog {
    String color;
    
    void play() {
        System.out.println("Labrador plays");
    }
}

// GermanShepherd class inheriting from Dog
class GermanShepherd extends Dog {
    String spots;
    
    void guard() {
        System.out.println("German Shepherd guards");
    }
}

public class task3{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        
        Mammal mammal = new Mammal();
        mammal.fur();
        
        Reptile reptile = new Reptile();
        reptile.shed();
        
        Amphibian amphibian = new Amphibian();
        amphibian.swim();
        
        Dog dog = new Dog();
        dog.bark();
        
        Cat cat = new Cat();
        cat.meow();
        
        Labrador labrador = new Labrador();
        labrador.play();
        
        GermanShepherd germanShepherd = new GermanShepherd();
        germanShepherd.guard();
    }
}
