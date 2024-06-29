public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program Start");
        int num1 = 10;
        try {
            int num2 = num1 / 0; // Arithmetic exception - should exit here
        } catch (ArithmeticException ex) {
            // Catches the type of exception provided
            System.out.println("Cannot divide by 0");
        } finally {
            System.out.println("Runs no matter what");
        }

        // ArrayIndexOutOfBounds
        int[] arrNum = new int[4];
        arrNum[0] = 10;
        try {
            arrNum[100] = 300; // ArrayIndexOutOfBounds exception - exits here
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array too small");
        }

        // NullPointer Exception
        String data = null;
        try {
            System.out.println(data.length()); // NullPointer exception - exits here
        } catch (NullPointerException ex) {
            System.out.println("Null data, please fill");
        }

        // Nested try block
        try {
            int t1 = 10 / 0;
            String d1 = null;
            System.out.println(d1.length());
        } catch (ArithmeticException ex) {
            System.out.println("Number error");
        } catch (NullPointerException ex) {
            System.out.println("Null value");
        } finally {
            System.out.println("Try block end");
        }

        // Exception
        try {
            String d2 = null;
            System.out.println(d2.length());
            int t2 = 10 / 0;
        } catch (Exception ex) { // Corrected the exception type
            System.out.println("Catches any exception");
        }

        // Task
        // Find the exception and use try block and finally accordingly
        try {
            int number1 = 10;
            int number2 = number1 - 10;
            int number3 = number1 / number2;
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception caught in task");
        } finally {
            System.out.println("Arithmetic operation end");
        }

        try {
            String name = null; // Initialized to null
            System.out.println(name.length());
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException caught in task");
        } finally {
            System.out.println("Null operation end");
        }

        try {
            String[] names = new String[100];
            names[0] = "Ram";
            names[110] = "Ankit";
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException caught in task");
        } finally {
            System.out.println("Array operation end");
        }

        System.out.println("Program End");
    }
}

