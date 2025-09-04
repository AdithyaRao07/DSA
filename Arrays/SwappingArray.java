import java.util.Arrays;

public class SwappingArray {
    public static void main(String[] args) {
        int[] arr={10,11,12,13};
        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
    }
    public static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    // Reversing an Array
    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
         System.out.println(Arrays.toString(arr));
    }
}
