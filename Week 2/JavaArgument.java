public class JavaArgument {
    public static void main(String[] args){
        /*the args in the main function can be useds
         * to take input from command line
         * when executing the file we can passs argument
         * Eg:
         * java JavaArgument arg1 arg2
         * the arg1 and arg2 can be accessed from args
         */
        if(args.length<2){
            System.out.println(	 "Please provide at least 2 arguments");
            return;
        }
        /* use index og args toa ccess */
        System.out.println("Argument 1 is" + args[0]);
        System.out.println("Argument 2 is " + args[1]);
        
    }
    
}
