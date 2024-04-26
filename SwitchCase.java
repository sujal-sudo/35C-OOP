public class SwitchCase {
    public static void main(String[]args){
        char value=	 'a';
        int numVal =10;
        switch (value) {
            case 'a': 
            switch(numVal){
                case 10:
                    System.out.println("10");
                    break ;
                default:
                    System.out.println("Default");
                    break;
            
            }
                System.out.println("Apple");
                break;
            
            case 'b':
                System.out.println("Banana");

                break;
            case 'c':
                System.out.println("cat");
                break;

            case 'd':
                System.out.println("dog");
                break;

            default:
            System.out.println("no word found");
            break;
    }
     /*task
      * consider the variable week in int
      * if the value is
      *0- Print sunday
      *1-Print monday
      *2-Print tuesday
      *3-Print wednesday
      *4-Print thursday
      *5-Print friday
      *6-Print saturday
     */
    
}
}
