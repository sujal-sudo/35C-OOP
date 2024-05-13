public class ArrayClass {
    public static void main(String[] args){
        //   Array declaration 
        int [] myFirstArray;
        // Array initialization 
        myFirstArray = new int [5]; // 5 refers to the size
        int arraySize = myFirstArray.length;
        System.err.println("Total element in array is " + arraySize);

        myFirstArray[0] = 10;
        myFirstArray[1] = 20;
        myFirstArray[2] = 30;
        // / You cannot take or assign array element greater than
         
// Last index, here it is 4

System.err.println("FIrst Index is "+ myFirstArray[0]);

// Array Declralation and initialization 
        int[] mySecondArray = new int[20];
//  Array declralation, initialization and value 
        int[] myThirdArray = {10, 20, 30, 40, 67};
//  or 
        int [] myFourthArray = new int[]{1,2,3,4};

        /*Task
         * make an arrray myFirstArray with the size of 10
         * values should be 10,20,30,40,50,60,70,80,90,100
         * print each index, from 0-9//looop us optional
         * with each print also print the multiplication of the value by 2
         * output
         * 10 20
         * 20 40
         * 30 60
         * ...
         * 90 180
         * 100 200
         */
        // myFirstArray = new int[100];
        // for (int i=0 ; i<=10;i++){
        //     myFirstArray[i]=10+i;
        //     System.out.print(myFirstArray[i]+" ");
        //     System.out.print(myFirstArray[i]*2+"\n");
        // }
        // int [] myFifthArray ={10, 20, 30, 40, 50, 60, 70, 80, 90,100};
        //     for(int i=0; i<=10; i++){
        //     System.out.println(myFirstArray[i] + "\t" + myFifthArray[i]);
        //   }

        // System.out.println(myFirstArray[0] +" "+myFirstArray[0]*2);
        //   System.out.println(myFirstArray[1] +" "+myFirstArray[1]*2);
        //   System.out.println(myFirstArray[2] +" "+myFirstArray[2]*2);
        //   System.out.println(myFirstArray[3] +" "+myFirstArray[3]*2);
        //   System.out.println(myFirstArray[4] +" "+myFirstArray[4]*2);
        //   System.out.println(myFirstArray[5] +" "+myFirstArray[5]*2);
        //   System.out.println(myFirstArray[6] +" "+myFirstArray[6]*2);
        //   System.out.println(myFirstArray[7] +" "+myFirstArray[7]*2);
        //   System.out.println(myFirstArray[8] +" "+myFirstArray[8]*2);
        //   System.out.println(myFirstArray[9] +" "+myFirstArray[9]*2);




    }
}