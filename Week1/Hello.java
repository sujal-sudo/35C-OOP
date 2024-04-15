package Week1;

public class Hello {
    public static void main(String[] args){
        System.out.println( "Hello World!" );  //prints out the string to the console

        /*2. Extend/Modify the above program to print two additional lines:

This is my first program\I am on module ST4003CEM */
        System.out.print("This is my first program\nI am on module ST4003CEM");


        /* 3.Write a program that prints the following output:

A "quoted" String is

'much' better if you learn

the rules of "escape sequences."

Also, "" represents an empty

String. Don't forget: use \"

instead of " !

'' is not the same as " */
        System.out.println("\n\"A quoted\" String is");
        System.out.println("'much' better if you learn");
        System.out.println("the rules of \"escape sequences.\"");
        System.out.println("Also, \"\" represents an empty");
        System.out.println("String.");
        System.out.println("Don't forget: use \\\" instead of \\!");
        System.out.println("'' is not the same as \"");

        /*4. WAP that prints the following pattern:

*

**

***

****

 */
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }               
            System.out.println();
        }                    

        /* WAP prints the following pattern:

            *********

            *********

            *********

            ********* */
            System.out.println("*********\n*********\n*********\n*********");        



    }
}
