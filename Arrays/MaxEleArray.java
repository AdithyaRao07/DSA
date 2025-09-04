public class MaxEleArray {
    public static void main(String[] args) {
        int[] arr={10,15,12,11};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,2,3));
    }
    public static int  max(int[] arr){
        int max=arr[0];
        for(int ele : arr){
            if(ele>max){
                max=ele;
            }
        }
        return max;
    }
    // Checking Mac btw a Range of elements
    public static int maxrange(int[] arr, int start, int end){
        int max=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
