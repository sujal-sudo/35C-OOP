package inheritance;

public class InheritanceConstructor {
    
    public static void main(String[] args) {
        HalfPant hp= new HalfPant();
        hp.differentColor("red");

        Pant p1=new Pant();
        System.out.println(p1.color);
        
    }
}


class Pant{

    String color;
    String texture;
    Pant(){
        System.out.println("Pant default constructor ");
    }

    // Overloading same function/constructor with different logic/parameters
    Pant(String color){
        this.color=color;
        System.out.println("Constructor with one string parameter");
    }

    Pant(String color,String texture){
        this.color=color; this.texture=texture;
        System.out.println("Constructor with two string parameters");
    }

    Pant(int num){
        System.out.println("Num "+num);

        System.out.println("Constructor with one int parameter");
    }
}

class HalfPant extends Pant{
    String color;
    HalfPant(){
        // If object of child class is made, it automatically executes
        // super() or Pant() in the first execuiton
        System.out.println("Half Pant default Constructor");
    }


    void differentColor (String Color){
        System.out.println("Parameter Color "+color);
        System.out.println("Class color"+this.color);
        System.out.println("ParentColor"+super.color);
    }
}
/*
 * make a class shirt
 * make 2 attribute color and thread
 * make a parameterized constructor that takes color and thread
 * make a parameterixed constructor that sets default/
 * color to "white" and thread to "cotton"
 * make a class polo that extends shirt
 * make 1 attrubute color,set default to green
 * make non parameterized constructor on polo
 * make a non parameterized constructor of parent with "Red" and "Silk"
 * make a functoion design() in that takes string color
 * set the current color of polo to shirt
 * set the parameter color to current color or polo
 * make a function details() that prints parent color and thread
 * also print the color of current polo
 *  make an object of polo and call function design and details
 * */
class Shirt {
    String color;
    String thread;

    // Parameterized constructor
    Shirt(String color, String thread) {
        this.color = color;
        this.thread = thread;
    }

    // Parameterized constructor with default values
    Shirt() {
        this.color = "white";
        this.thread = "cotton";
    }
}

class Polo extends Shirt {
    String poloColor;

    // Non-parameterized constructor
    Polo() {
        super("Red", "Silk");
        this.poloColor = "green";
    }

    // Function to design the polo with a new color
    void design(String color) {
        this.poloColor = color;
    }

    // Function to print the details
    void details() {
        System.out.println("Parent Shirt Color: " + super.color);
        System.out.println("Parent Shirt Thread: " + super.thread);
        System.out.println("Polo Color: " + this.poloColor);
    }

    public static void main(String[] args) {
        Polo myPolo = new Polo();
        myPolo.design("blue");
        myPolo.details();
    }
}


 


