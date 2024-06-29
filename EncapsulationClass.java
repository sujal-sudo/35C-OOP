public class EncapsulationClass{
    public static void main(String[] args){

        
    }
}
// task
//make setter and getter for price
// create 2 object of laptop
// output the following using the object
//output 
//name : apple air m2
//brand : apple
//price : 150000
//year: 2022
class Laptop{
    private String name;
    private String brand;
    private int price;
    private int year;

    public Laptop(String name, String brand, int price, int year) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Apple Air M2", "Apple", 150000, 2022);
        Laptop laptop2 = new Laptop("Dell XPS", "Dell", 120000, 2021);

        System.out.println("Laptop 1:");
        System.out.println("Name: " + laptop1.getName());
        System.out.println("Brand: " + laptop1.getBrand());
        System.out.println("Price: " + laptop1.getPrice());
        System.out.println("Year: " + laptop1.getYear());

        System.out.println("\nLaptop 2:");
        System.out.println("Name: " + laptop2.getName());
        System.out.println("Brand: " + laptop2.getBrand());
        System.out.println("Price: " + laptop2.getPrice());
        System.out.println("Year: " + laptop2.getYear());
    }
}

// 1. encapsulation bundles  the 
// somilar attribute and fucntion instide a class

// class laptop{
//     //2. encapsulation can have data hiding using private properties
//     private String name;
//     private String brand;
//     private double price;
//     int year;
//     //3. encapsulation can have read only or write only
//     // using getter and setter

//     public void setName(String name){
//         this.name=name;
//     }
//     public String getName(){
//         return name;
//     }
//     public void getInfo(){
//         System.out.println(name +""+ brand);
//     }
// }