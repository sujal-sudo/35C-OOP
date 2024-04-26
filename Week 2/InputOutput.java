import java.util.Scanner;
public class InputOutput {

    public static void main(String[] args) {
        /* Print/Output a line with line break
         
use "sout" shortcut /

  System.out.println("this prints and breaks line");
  / Print the word without line break /
  System.out.println("this will not break line");
  System.out.println("This line will continue\n");
  / Output formating
System.out.printf();
%s String, %d integral, %f floating point, %b boolean
This will not break line too
*/
System.out.printf("The next word is %s", "New world");
System.out.printf("The next int is %d", 10);/* You can use multiple formatter */
System.out.printf("Multiple %f %b", 10.9f, false);

    /* User Input using scanner
     
first import the scanner class
import java.util.Scanner; // at the top of the file */
Scanner scan = new Scanner(System.in); // System.in is used as input
System.out.println("The following takes one word from sentence");
String oneWord= scan.next();
System.out.println(oneWord);
System.out.println("The following takes whole sentence");
String wholeSentence = scan.nextLine();
System.out.println(wholeSentence);
System.out.println("The following takes int");
int intInput = scan.nextInt();
System.out.println(intInput);
System.out.println("The following takes boolean");
boolean booleanInput = scan.nextBoolean();
System.out.println(booleanInput);
scan.close();
    /*  
    Task
Create a new Scanner obj name scan1
Prompt user for the following
What is your name
Are you over 18?
How many siblings do you have?
Print the output
Over 18 status,
you have sibling number of siblings
*/






    }

}
