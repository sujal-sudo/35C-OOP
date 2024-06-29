import java.util.ArrayList;
public class Arraylistloop {
    public static void main(String[] args) {
        /* import arraylis in the top */
        ArrayList<String> names = new ArrayList<>();

        names.add("Ankit");
        names.add("Parves");
        names.add("Rabin");
        names.add("Dipen");
        names.add("Joseph");
        names.add("Sanjay");
        names.add("Yubraj");

        /* To get the lenght of arraylist we use .size() function */
        int nameslength = names.size();
        /* It will return how many element is in the arraylist */
        // Use a loop
        for(int index = 0; index < nameslength; index ++){
            System.out.println("Names in index " + index + " " + names.get(index));
        }
        System.out.println("Using for Each Loop in Java");

        // Use Collection for
        for(String element: names){
            System.out.println(element);
        }
    }
}