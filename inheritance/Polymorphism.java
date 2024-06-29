package inheritance;

public class Polymorphism{
    public static void main(String[] args){
        mathOperation mo = new mathOperation();
        System.out.println(mo.add(1,2));
        System.out.println(mo.add(2,3,4));
        mo.add();

        // method overriding
        // polymoirphism allows child object to be 
        // held on parent variable
        document d1 = new msWord();
        d1.print("White");
        // method overriding in multi layer inheritance
        document d2 = new msWord();
        d2.print("Black");
        // when doing so, although the variable is
        // document it will run the overriden method
        // in the child class
        document d3 = new office365();
        d3.print("yellow");
        // note: when storing child object on parent
        // variable, only the attribute and function
        // of parent can be used
        // example: d3.online -> cannot be use



    }
}
// method overloading - compiletime polymorphism
// in a class, have same fucntion multiple time with differences
// in parameters
class mathOperation{
    int add(int num1,int num2){
        return num1+num2;
    }
    //1. changing the number of parameters
    int add(int num1, int num2,int num3){
        return num1 + num2 + num3;
    }
    // note: methodology is only possible with unique parameter/ argument data type
    // cannot make function changing variable name
    //EG: int add(int a, int b)-> 
    //cannot be made as function with 2 int is already made
    // cannot overload just by changing return type
    //EG: double add(int num1, int num2)-> 
    //cannot be made as function with 2 int is already made
    void add(){
        System.out.println("Invalid Operation");
    }
}
// method overriding- runtime polymorphism
// when a child class hs the same function as parent class
class document{
    public void print(String paper){
        System.out.println("Basic Document pricing ");
    }
}
// method overriding is only possible in child class
class msWord extends document{
    //when overriding, should be the same function as parent
    @override
    public void print(String paper){
        System.out.println("msWord prints");
    }
}
// method overriding in multi layer inheritance 
class office365 extends msWord{
    boolean online= false;
    @override
    public void print(String paper){
        System.out.println("online prints");
    }
}
// note: when storing child object on parent
// variable, only the attribute and function
// of parent can be used
// example: d3.online -> cannot be use
// note: when storing child object on parent
// variable, only the attribute and function
// of parent can be used
// example: d3.online -> cannot be use
// note: when storing child object on parent
// variable, only the attribute and function
// of parent can be used
// example: d3.online -> cannot be use
// note: when storing child object on parent
