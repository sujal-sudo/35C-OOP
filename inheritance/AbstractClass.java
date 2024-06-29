package inheritance;
// public class AbstractClass{
//     public static void main(String[] args){

//     }
// }
// // to make abstract class "abstract" keyword used before "class"
// // abstract class cannot be made object of
// abstract class Smartphone{
//     //abstract class may or may not contain abstract function
//     // abstract function do not have body (function hiding)

//     abstract void sms();
//     abstract String call(int number);
//     // can contain normal function
//     // normal function should contain body
//     void imei(){
//         System.out.println("IMEI");
//     }
   
// }
// // abstract class need to be extended in child class
// class samsung extends Smartphone{
//     // abstract function should be implemented in child class
//     void sms(){
//         System.out.println("Samsung way of sms");
//     }
//     String call(int number){
//         return number +"is callung";
//     }
// }
// //task
// //make a class iphone that extends smartphone
// //override abstract functions
// //make object of samsung and iphone
// // call the function sms() and call()

// class iphone extends Smartphone{
//     //abstract function implementing in the child class
//     void sms(){
//         System.out.println("iphone way of sms");
//         }
//     String call(int number){
//         return number +"is calling";
//         }
//     public static void main(String[] args){
//         //object of samsung
//         samsung s = new samsung();
//         s.sms();
//         System.out.println(s.call(1234567890));
//         //object of iphone
//         iphone i = new iphone();
//         i.sms();
//         System.out.println(i.call(1234567890));
        
//     }
        
    
// }

//You are building a shape hierarchy for a drawing application. Design an abstract class named "Shape" with the following abstract methods:
//calculateArea(): This method should calculate and return the area of the shape.
//calculatePerimeter(): This method should calculate and return the perimeter of the shape.
//Implement the abstract class and provide concrete implementations for the abstract methods. Create subclasses for different shapes such as "Circle," "Rectangle," and "Triangle." 
//Each subclass should provide specific implementations for calculating the area and perimeter of that shape. 
//Create instances of each shape class and demonstrate how you can calculate their respective areas and perimeters

abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return Math.PI * radius * radius;
    }
    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double calculateArea(){
        return length * breadth;
    }
    double calculatePerimeter(){
        return 2 * (length + breadth);
    }
}
class Triangle extends Shape{
    double side1;
    double side2;
    double side3;
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    double calculateArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    double calculatePerimeter(){
        return side1 + side2 + side3;
    }
}

public class AbstractClass{
    public static void main(String[] args){
        Circle c = new Circle(5);
        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Perimeter of Circle: " + c.calculatePerimeter());
        Rectangle r = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + r.calculateArea());
        System.out.println("Perimeter of Rectangle: " + r.calculatePerimeter());
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Area of Triangle: " + t.calculateArea());
        System.out.println("Perimeter of Triangle: " + t.calculatePerimeter());
    }
}