public class StaticFunction {
public static int addNumber (int num1, int num2){
    int sum = num1 + num2;
    return sum; 
}
    
    public static String vendingMachine(int menu){
        if(menu == 1){
            return "water";
        }
        if (menu == 2){
            return "coke";
        }
        if(menu == 3){
            return "pepsi";
        }
        return "Invalid menu";
    }

    public static void main(String[] args){
        /*We donot have to create object for static function
         * id the static function is in same class
         * can just call from function name
         */
        int returnFromFunction = addNumber(20,20);
        System.out.println("The sum of the numbers is: " + returnFromFunction);

        String returnItem =  vendingMachine(1);
        System.out.println("You bought a "+returnItem);

        /* TASK\
         * Make a function adoptPet
         * takes animal type as string
         * if animal is Dog,Cat,Snake return true
         * else return false
         */

    }
} 

