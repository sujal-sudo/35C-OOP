package Week1;

public class Variableclass{
    /* instance variable
     * need object to access
     * not shared in multipe object
     */
    int instanceVariable =10;
    /* static varibale
     * no need objects,can be accessed using class
     * shared in multiple object
     */
    static int staticVariable =100;
    public static void main(String[] args){
        /* Non Primitive data type */
        /*Decleration */
        byte byteVariable;
        /* initialization */
        byteVariable=100;
        /*decleration and initialization  */
        short shortVariable=1000;
        /*multipleiba Decleration */
        int intVariable1, intVariable2;
        /*initilization */
        intVariable1= 10;
        intVariable2=-10;
        /*multiple decleration and initilization */
        long  longVariable1=100000, longVariable2=-199999;
        /*initilization */
        float floatVariable =1.89f;
        double doubleVariable=189.8923d;
        char charVariable='c';
        boolean booleanVariable=true;
        /*Illegal actions */
        // byte byteVariable =20;// cannot redeclare a variable
        //byte variable=30;// instead use reassignment
        //boolean boolVar2 ='false'// should match the exact datatype
        //byte bytevariable2=100000;// cannot exceed min or max

        /* non-primitive data type */
        String stringVariable="This is a string";
        /*or use the class */
        String stringVariable2= new String("String using class");
        /*class/object */
        Variableclass variableObject =new Variableclass();
        /*use the same class Name as specified in publicc class <className>*/

        /* need object to access instance variable
         */

         System.out.println(variableObject.instanceVariable);
         /*can access static variable with class only/no object neeeded */
         System.out.println(Variableclass.staticVariable);

         /*typecasting
          */
          int intVariableConvert=10;
          double intVariableConvertToVariable = intVariableConvert;
          /*explicit casting */
          double doubleVariableConvert =100.29;
          int doubleVariableConvertToInt= (int) doubleVariableConvert;
           


          

         
    }
}