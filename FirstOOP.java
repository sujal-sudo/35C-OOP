// public class FirstOOP{
//     public static void main(String[] args){
//         Person p1 = new Person();
//         p1.name="Ram";
//         p1.age=20;
//         p1.gender='M';
//         p1.intorduction();


//         Person p2 = new Person();
//         p2.name="mary";
//         p2.age=10;
//         p2.gender='F';
//         p2.intorduction();

//         Person p3 = new Person();
//         p3.name="Aayush";
//         p3.age=30;
//         p3.gender='N';
//         p3.intorduction();

//         Square s1 = new Square();
//         s1.sides = 10;
//         int s1Area= s1.area();
//         System.out.println("Area of square is: " + s1Area);
//         System.out.println(s1.area());
//         s1.increaseSidex(2);
//         System.out.println(s1.area());


//     }
// }
// class Person{
//     String name;
//     int age;
//     char gender;
    
//     void intorduction(){
//         System.out.println("Hello, my name is " + name);
//     }
// }
// task create a class rectangle
// create 2 attribute, length and breadth as double
// make a function that returns area of rectangle
// make a function that returns perimeter of rectangle\
// make a function info, that prints the length and breadth of the rectangle
// make an object of Rectangle
// fill both the attribute/fields
// call the area function and print the area
// call the perimeter function and print the perimeter

// class rectangle{
//     double length;
//     double breadth;
//     double area(){
//         return length*breadth;
//     }
//     double perimeter(){
//         return 2*(length+breadth);
//     }
//     void info(){
//         System.out.println("Length: " + length);
//         System.out.println("Breadth: " + breadth);
//     }

// }
// public class FirstOOP{
//     public static void main(String[] args){
//         rectangle r1 = new rectangle();
//         r1.length = 40;
//         r1.breadth = 20;
//         System.out.println("Area of rectangle is: " + r1.area());
//         System.out.println("Perimeter of rectangle is: " + r1.perimeter());
//         r1.info();
//     }
// }

// class Square{
//     int sides;
//     int area(){
//         return sides*sides;
//     }
//     void increaseSidex(int x){
//         sides = sides + x;
//     }
// }

// task create class car
// create attribute name, brand, year
//create a function expiry that returns year added with 100
// create function start-> print(name is starting)
// create function stop-> print(name,brand is stoping)
// create a function info -> Print(name,brand and year)
//create 2 objects
//fill attribute of both
// start both object
// stop 1st object
// info of 2nd object


class car{
    String name;
    String brand;
    int year;
    int expiry(){
        return year+100;
    }
    void start(){
        System.out.println(name + " is starting");
    }
    void stop(){
        System.out.println(name + " " + brand + " is stoping");
    }
    void info(){
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
public class FirstOOP{
    public static void main(String[] args){
        car c1 = new car();
        c1.name = "Audi";
        c1.brand = "A4";
        c1.year = 2020;
        c1.start();
        car c2 = new car();
        c2.name = "RollsRoyce";
        c2.brand = "Spectre";
        c2.year = 2024;
        c2.start();
        c1.stop();
        c2.info();
    }
}
