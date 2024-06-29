public class InheritanceClass{
    public static void main(String[] args){

        ChildClass cc=new ChildClass();
        cc.lastname ="XYZ";
        cc.expenses = 1000.1;
        cc.firstname="ABC";
        cc.info();
        cc.detail();
        //cc.salary = 10000;  

    }
}

class ParentClass{
    public String lastname;
    private int salary;
    double expenses;
    void info(){
        System.out.println("Parent Function" + lastname);
    }
}

//single level inheritance - one parent and one child
// use "extends" to inherit a class
class ChildClass extends ParentClass{
    String firstname;
    void detail(){
        System.out.println("Child function"+ firstname + " "+lastname);
    }
}
// multi level inheritance =Nested class
class GrandchildClass extends ChildClass{
    String middlename;
    void description(){
        System.out.println("Grandchild function"+ firstname + " "+ middlename + " " +lastname);
    }
}

// tree /hiercarcial inheritance
class StepBrotherClass extends ParentClass{
    String address;
    void living(){
        System.out.println("Brother function" + address);
    }
}