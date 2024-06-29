import java.util.ArrayList;
public class ArrayListClass{
    public static void main(String[] args){
        ArrayList <String> Animal = new ArrayList<>();
        Animal.add("CAT");
        Animal.add("Bandhar");
        System.out.println(Animal);

        Animal.add(0,"Donkey");
        System.out.println("After adding donkey to 0 index");
        System.out.println(Animal);
    }
    
}
