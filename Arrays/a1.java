public class a1 {
    public static void main(String[] args) {
        // Q: Store a Rollnum
        int roll1=1;

        // Q: Store a Name
        String sname1="Raj";

        // Q: Store Multiple roll nums
        int roll2=2;
        int roll3=3;
        int roll4=4;

        // Syntax
        // Datatype[] variable_name=new Datatype[size];
        // Q: Store Multiple Roll nums
        int[] Rollnums=new int[5];
        // or
        int[] Rollnums2={1,2,3,4,5};

        // Memory management
        int[] arr; // Declaration is done and arr is defined in Stack
        arr=new int[6];// Actual object is created in the heap memory
    }
}
