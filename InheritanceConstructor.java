public class InheritanceConstructor {
    public static void main(String args){

    }
    
}
class pant{
    String color +"White",//super.color
    String color;
    String texture;
    pant(){
        System.out.println("Pant Default Constructor");
    }
}
class Halfpant extends pant{
    String color="Black"; //this.color
    String color;
    Halfpant(){
        //if object of child class is made,it automatically executes
        //super() or pant() in the first execution
        System.out.println("Half Pant default Constructor");
    }
    void differentColor(String color){
        System.out.println("Parameter color"+color);
        System.out.println("Class color"+ this.color);
        System.out.println("Parent color"+ super.color);
    }
}
