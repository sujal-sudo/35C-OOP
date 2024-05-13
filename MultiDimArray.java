public class MultiDimArray {
    public static void main(String[] args){
        /*the number of square bracket represet dimension of array */
        int[] oneDArray;
        int[][] twoDArray;
        int[][][]threeDArray;
        /*To allocate size we must allocate the size of each square bracket */
        twoDArray= new int[2][3];
        /* The first size 2 represent how many array 
         * The Second size 3 represent how many element/value inside the inner array
        */
        /*[
            [0,0,0],-> 0
            [0,0,0],-> 1
        ] */
        //twoDArray[0] -> takes first array
        //twoDArray[0][0] -> takes first element of first array

        twoDArray[0][0] =10;
        twoDArray[0][1]=20;
        twoDArray[1][1]=50;
        twoDArray[1][2]=100;
        //print/access
        System.out.println(twoDArray[0][1]);
        /*Task
         * make the following array
         * [
         * [10,20,30,50]
         * [100,200,300,400]
         * [50,60,70,10]
         * [-10,-20,-30,-50]
         * [1,2,3,5]
         * ]
         * Variable name arrayDemo;
         */

         int[][] arrayDemo = {
            {10, 20, 30, 50},
            {100, 200, 300, 400},
            {50, 60, 70, 10},
            {-10, -20, -30, -50},
            {1, 2, 3, 5}
        };

        // Printing the array
        for (int i = 0; i < arrayDemo.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arrayDemo[i].length; j++) {
                System.out.print(arrayDemo[i][j]);
                if (j < arrayDemo[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }


        // /*Print the 4th index array */
        // /*output
        //  * the element in 4th index is
        //  * 1
        //  * 2
        //  * 3
        //  * 5
        //  */
        int[][] arrays = {
            {0, 1, 2, 3, 4},
            {5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19},
            {1,2,3,5}
        };

        System.out.println("The elements in the array at the 4th index are:");
        for (int i = 0; i < arrays[4].length; i++) {
            System.out.println(arrays[4][i]);
        }
        




        
    }
    
}
