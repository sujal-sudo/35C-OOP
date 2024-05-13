public class ArryaLoop {
    public static void main(String[] args){
        int[] array1= {20,40,60,80,100,120};
        int array1length = array1.length;
        /*Either loop from 0 and index < arra1length
         * or loop from 0 and index <= array1length -1 
         */
        for(int index =0; index < array1length; index++){
            System.out.println("Value at Index "+index+" is :"+array1[index]);
        }
        /*Descding loop */
        /*Start loop from array1length -1 to 0, decrement */
        for(int index = array1length -1; index >=0; index--){
            System.out.println("\n Value at Descending Index "+index+" is :"+array1[index]);
        }
        int counter =0;
        /*use this counter to iterate array1 in while loop */
        while (counter< array1length) {
           System.out.println("\n Value at While Loop Counter Index "+counter +" is :"+array1[counter]);
           counter++;
        }
        /* make two array of length 5
         * myArray1 and myArray2
         * fill the date in myArray1 as 50,40,30,20,10
         * loop the myArray1 put the value in myArrray2 in reverse
         * myArray2 should be 10,20,30,40,50
         * print myArray2 in ascending order
         */
        
    }
}
    

  
