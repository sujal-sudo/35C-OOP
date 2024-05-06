import java.util.Scanner;
public class whileloop{
    public static void main(String[] args){
        /* while loop takes condition/boolean expression inside() */
        int count=0;
        while(count<=5){
            System.out.println("While count" + count);
            count ++;
        }
        /*real use of while is used when number of iteration is not fixed
         * for eg, uif you want to keep asking a user for input until desired condition
        */
        Scanner scan= new Scanner(System.in);
        System.out.println(	 "Enter a number");
        int intValue = scan.nextInt();
        while(intValue<0||intValue>100){
            System.out.println("Please number between 0-100");
            intValue = scan.nextInt();
        }
        System.out.println("You entered "+ intValue);
        scan.close();
    }
}
        