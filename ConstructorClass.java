public class ConstructorClass{
    public static void main(String[] args){
        ConstructorExample ce= new ConstructorExample();
        System.out.println("Line after object");
        ConstructorExampleTwo cTwo = new ConstructorExampleTwo("Afon name",10,'M');
    }
}
// task
// make a class cat
// make private attribute nmae, age
//make public attribute breed
// make a constructor that sets name and age only
//make a getter for name and age
// make an object of cat
// print the following from object
//name:xyx
//breed: ABC
// age:10

class Cat{
    private string name;
    private int age;
    public char breed;
    
}
