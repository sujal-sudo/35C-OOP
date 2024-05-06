public class PrefixPostfix{
    public static void main(String[] args) {
        /* Prefix, operator on the left side */
        int PrefixValue=10;
        System.out.println("Prefix Value changes here" + ++PrefixValue);
        System.out.println("Prefix remain same" + PrefixValue);
        
        /* Postfix ,operator on right side*/    
        int PostfixValue = 20;
        System.out.println("\n\nPostfix Value changes here" + PostfixValue++);
        System.out.println("It changes in next line" + PostfixValue);

    }
}