public class JumpStatement{
    @SuppressWarnings("unused")
    public static void  main(String[] args) {
        for(int i=0;i<=5;i++){
            if(i==2){
                break;
            }
            System.out.println("for loop"+i);
        }
        /* can be used in while and do while */
        int count = 0;
        while(count <=5){
            if (count == 1){
                break;
            }
            System.out.println("While count"+ count);
            count++;
        }
        /*Break ends/terminates the loop where it is called */

        /*Continue skips the current iteration */
        for(int index =0; index <=5; index ++){
            if(index ==3){
                continue; // will ignore all the remaining and go to next loop
            } 
            System.out.print("continue Loop "+index);
        }

        /*Break in nested loop */
        for(int outer=0; outer <= 2; outer ++){
            for(int inner =0; inner<=3; inner ++){
                if(inner == 1){
                    break;
                }
                System.out.println("inner loop" + inner);
            }
        }
        /* if you want to break outer loop */
        System.out.println("outer loop break");
        outerLoop: for(int outer =0; outer<=2 ; outer ++){
            innerLoop: for(int inner=0; inner<=3 ; inner++){
                if(inner ==1){
                    break outerLoop;
                }
                System.out.println("Inner loop" + inner);
            }
        }

        /*task 1
         * use for loop fro -5 to 5
         * if the value is positive end the loop
         */
        /* task 2
         * use for loop from 1-20
         * only print the value if the value is even
         * use"continue " to perform this
         */
        System.out.println("\nTask 1 : ");
        for (int i=-5;i<=5;i++) {
           if(i>0)break;//end the loop when it becomes positive
           System.out.println("Value is Positive so Ending the loop");
        }
        System.out.println("\nTask 2 : ");
        for (int j=1;j<=20;j++) {
            if(j%2!=0) continue; //if number is not even then skip and move on to next iteration
            System.out.println("Even Number is : "+j);
        }
    }
}