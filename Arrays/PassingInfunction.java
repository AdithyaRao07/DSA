import java.util.Arrays;

public class PassingInfunction {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int[] array){
        array[1]=10;
    }
}
