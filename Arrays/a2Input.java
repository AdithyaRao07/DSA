import java.util.Arrays;

public class a2Input {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        arr[3]=13;
        arr[4]=14;
        // Enhanced for loop
        for(int ele : arr){
            System.out.println(ele);
        }
        int[] arr2=new int[5];
        for(int i=0;i< arr2.length;i++){
            arr2[i]=i+1;
        }
        for (int ele: arr2){
            System.out.println(ele);
        }
        // Printing using toString method
        System.out.println(Arrays.toString(arr2));

        // String Array
        String[] names=new String[3];
        names[0]="Raj";
        names[1]="Ravi";
        names[2]="Teja";
        System.out.println(Arrays.toString(names));
        // Changine the reference of a string array
        names[1]="Adithya";
        System.out.println(Arrays.toString(names));
    }
}
