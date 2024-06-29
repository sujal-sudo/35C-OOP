public class tasktask {
    public static void main(String[] args) {
        language dog = new language();
        dog.speak();
    }
}
class Animal{
    void speak(){
        System.out.println("Animal is speaking");

    }
}

class Mammal extends animal{
    void speak(){
        System.out.println("Mammal is speaking");
    }
}
