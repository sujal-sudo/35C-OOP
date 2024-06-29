public class MultiDimArrayLoop {
    public static void main(String[] args){


        // int [] [] arrayTwo =new int[3][2];
        // arrayTwo[0][0] = 10;
        // arrayTwo[0][1] = 20;
        // arrayTwo[1][0] = 30;
        // arrayTwo[1][1] = -10;
        // arrayTwo[2][0] = -20;
        // arrayTwo[2][1] = 100;
        // /* Visual representation
        //  * [ 
        //  *      [10,20]
        //  *      [30, -10]
        //  *      [-10, 100]
        //  * ]
        //  */
        // /* Iterate/access each array*/
        // int arrayTwoLength = arrayTwo.length;
        // for(int outer =0; outer < arrayTwoLength; outer++) {
        //     System.out.println("Access Array in" + outer);
        //     System.out.println(arrayTwo[outer].length);
        //     int innerLength =arrayTwo[outer].length;
        //     for(int inner =0; inner < innerLength;inner++);{
        //     System.out.print(arrayTwo[outer][inner]);
        //     }

        // }

        /*Make the following array
         * [
         * ["Sujal","tutut","Ustad fateh ali khan"]
         * ["hariyo","kalo","om"]
         * ]
         * Variable:names
         */
        /*loop and print all */
        /*continue and find the array index in which kalo is in
         * output:1
         */
        String[][] names= {
            {"Sujal", "tutut", "Ustad fateh ali khan"},
            {"hariyo", "kalo", "om"}
    };

    // Loop through and print all elements
    System.out.println("All elements:");
    for (int i = 0; i < names.length; i++) {
        for (int j = 0; j < names[i].length; j++) {
            System.out.println(names[i][j]);
        }
    }

    // Find the index of "kalo"
    int rowIndex = -1;
    int colIndex = -1;
    outerloop:
    for (int i = 0; i < names.length; i++) {
        for (int j = 0; j < names[i].length; j++) {
            if (names[i][j].equals("kalo")) {
                rowIndex = i;
                colIndex = j;
                break outerloop;
            }
        }
    }

    if (rowIndex != -1 && colIndex != -1) {
        System.out.println("Index of 'kalo': [" + rowIndex + "][" + colIndex + "]");
    } else {
        System.out.println("'kalo' not found in the array.");
    }
}
}

