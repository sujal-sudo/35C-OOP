
// public class AccessModifier{
//     public static void main(String[] args) {

//     }
// }

//task
//make a class dog
// make 2 private attribute, name and breed
// make 1 public attribute, age
//make setter for name and breed
//make getter for name, breed and age
//make 1 object of dog
// fill all the attributes
//print the following object
//name:xyz
//breed: abc
//age:10

public class Dog {
    // private attributes
    private String name;
    private String breed;

    // public attribute
    public int age;

    // constructor
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for breed
    public String getBreed() {
        return breed;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // print method
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
    }

    // main method
    public static void main(String[] args) {
        // create object of Dog
        Dog myDog = new Dog("xyz", "abc", 10);

        // fill all attributes

        // print the object
        myDog.printDetails();
    }
}
    
 



// class AccessExample{
//     String name; //Automatically default, meaning package/folder access
//     public int age; //public can be access from anywhere
//     private String phNo; // private can be accessed only in class

//     // same goes to the function
//     void printThis() {
//         System.out.println("Printing detail");
//     }
//     public void printName() {
//         System.out.println("Name is " + name);
//     }
//     private void privateFunction() {
//         System.out.println("This can be run only Inside Private Function");
//     }
//     void accessPrivate() {
//         System.out.println(phNo);
//         privateFunction();
//     }
// }