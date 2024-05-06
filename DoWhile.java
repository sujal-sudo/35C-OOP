import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args) {
        int num1 =0;
        /*While checks the condition first*/
        while(num1 < 0){
            System.out.println("This will not print since condition is false");
        }
        /* do while checks the condition after the loop
         * meaning, do while loop runs at least once evem if the condition is false
         */
        do{
            System.out.println("Do while will check condition after the statement");
        }while(num1< 0); // this line of code will always be executed atleast once

        /* use while loop to ask a user for a integer
        * keep asking user for number unless the integer is negative
        */
        Scanner scan= new Scanner(System.in);
        System.out.println(	 "Enter a number");
        int intValue = scan.nextInt();
        while(intValue>0) {
            System.out.println("Please number should be negative");
            intValue = scan.nextInt();
        }
        System.out.println("You entered "+ intValue);
        scan.close();

}
}