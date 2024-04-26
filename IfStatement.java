public class IfStatement{
    public static void main(String [] args){

    /* simple if statement,takes condition/expression with boolean value */
    if(true){
        System.out.println("True statemen");
    }
    if(false){
        System.out.println("skipped statement");
    }else{
        System.out.println("false statement");
    }
    /* if condition fails, goes to else block/scope */
     int num1=10, num2=20;
     if(num1>num2)
     {
        System.out.println("num1 is greater");
     }
     else{
        System.out.println("num2 is greater");
     }
     /*else if */
     int iNum1=10,iNum2=10;
     if(iNum1==iNum2)
     {
         System.out.println("Both are equal");
     }
     else if(iNum1 > iNum2 )
     {
         System.out.println("Number  1 is greater than number 2 ");
     }
     /*note that else should be at the last of the  ifstatement */
     /* if Else if ladder, more than one else if */
     if(iNum1<0){
        System.out.println("Negative Number");
     }else if(iNum2>=0){
        System.out.println("Num 2 is negative number");

     }
     else if(iNum1==iNum2);{
        System.out.println("Equal number");
     }
    if (iNum1<iNum2) {
        System.out.println("Number 1 is less than number 2");
    }
    else{
        System.out.println("Default execution if all false");
    }

     /*nested if statement */
     int nNum1= -10, nNum2=20;
     if(nNum1 < 0 ){
        if(nNum1> nNum2){
            System.out.println("nNum1 is negative and greater");
        }else{
            System.out.println("nNum1 is negative and lesser");
        }

     
    }else{
        if(nNum1 > nNum2){
            System.out.println("nNum1 is positive and greater");
        }else{
            System.out.println("nNum1 is positive and lesser");
    }

    }

    /* Tasks
     * Given the value below,add the total and take the average
     * if any of the marking is less than 35,print"fail"
     * if average is less than 60,print "3rd div"
     * if average is less than 70, print "2nd div"
     * if average is less than 80, print "1st div"
     * if average is greater than or equal to 80, print "distinction"
     */
    // int math = 38,  science = 60, english = 35;
    /*make total variable and average variable */
     
    }
} 
