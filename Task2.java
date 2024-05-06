

public class Task2 {
    public static void main(String[] args) {
        
        /* 1. Write a program to check whether a person can cast a vote or not. 
        The condition is you must be over 18 years old to vote. */

        int age=36;
        if (age>18) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("Sorry, you are not eligible to vote yet.");
        }


        /* 2. Write a program to calculate SI. Formula Simple Interest = (PrincipleAmount*Time*Rate/100) */

        double p=8000, t=2, r= 9.4;
        double SI = (p*t*r)/100;
        System.out.println(SI);


        /*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid. 
        Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side*/

        int b=20, h=45;
        double Area= 0.5*(b*h);
        System.out.println(Area);

        int l=50;
        double Volume_cube=l*l*l;
        System.out.println(Volume_cube);

        double Volume_cuboid=l*b*h;
        System.out.println(Volume_cuboid);


        /* 4. Write the ternary operator for question no. 1*/

        int ten1=18, ten2=20;
        boolean tenexp=ten2>=ten1;
        String out=tenexp?"Yes the given number is greater than or equals to 18":"No the given number is not greater than or equals to 18";
        System.out.println(out);


        /* 5. Write a program to take two integer inputs from the user and print the sum and product of them. */

        int num1=36, num2=69;
        int sum = (num1+num2);
        System.out.println(sum);
        
        int product = (num1*num2);
        System.out.println(product);


        /* 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
        Finally, calculate the division of the thus obtained sum and product and print the result. */

        int num3=36, num4=69;
        int isum = (num3+num4);
        System.out.println(isum);
        
        int iproduct = (num1*num2);
        System.out.println(iproduct);

        int division= (iproduct/isum);
        System.out.println(division);


        /* 7. Take the name, roll number, and field of interest from the user and print in the format below: 
        Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */

        String name="Sujal";
        int rno=1;
        String fofi="Business.";
        System.out.print("Hey, my name is ");
        System.out.print(name);
        System.out.print(", my roll number is ");
        System.out.print(rno);
        System.out.print(". My field of interest are ");
        System.out.println(fofi);


        /* 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */

        double rl=36.69, rb=69.36;
        double area=(rl*rb);
        int intarea=(int)area;
        System.out.println(intarea);

        //Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

        // a. If equal to or more than 70 -> First Class

        // b. If more than 59 -> Upper Second Class

        // c. If more than 49 -> Second class

        // d. If more than 39 -> Third class and if below than 40 the result is fail. 

        // Hint: Use ternary operator

        
        double[] subjectMarks = {85, 75, 60, 70}; // Example marks for four subjects
        
                double totalMarks = 0;
        
                // Calculate total marks
                for (double mark : subjectMarks) {
                    totalMarks += mark;
                }
        
                // Calculate percentage
                double percentage = (totalMarks / (4 * 100)) * 100;
        
                // Determine the result
                String result;
                if (percentage >= 70) {
                    result = "First Class";
                } else if (percentage > 59) {
                    result = "Upper Second Class";
                } else if (percentage > 49) {
                    result = "Second Class";
                } else if (percentage > 39) {
                    result = "Third Class";
                } else {
                    result = "Fail";
                }
        
                // Output
                System.out.println("Total Marks: " + totalMarks);
                System.out.println("Percentage: " + percentage);
                System.out.println("Result: " + result);
    }
}

