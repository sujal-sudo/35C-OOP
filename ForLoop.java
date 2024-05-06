public class ForLoop{
    public static void main(String[] args){
        // for (int index = 0; index < 4; index ++){
        //     System.out.println("Loop"+ index);
        // }
        // /* make the table for the following */
        // for(int index =10; index>=0; index --){
        //     System.out.println("Decrement"+ index);
        // }
        /*Task
         * Make a muiltipliacation table of 2
         * 2x1 = 2
         * 2x2 = 4
         * ...
         * 2x10 =20
         */
    //     for(int index =1;index<= 10; index ++){
    //         System.out.println("2 x" + index + " = "+ index * 2);
    //     }
    //     /*nested for loop
    //      * for loop inside a for loop scope/block
    //      */
    //     for(int outer =0; outer < 2; outer ++){
    //         for(int inner =3; inner >=0; inner --){
    //         System.out.println("Inner Loop"+ inner);
    //     }
    //     System.out.println("Outer Loop" + outer);

    // }
    for(int outer =1; outer <=10; outer ++){
        for(int inner =1; inner >=10; inner --){
        System.out.println("5 x"+ inner + " = " + inner *5);
    }
    System.out.println("1 x" + outer + " = " + outer*1);
}
}
}

       