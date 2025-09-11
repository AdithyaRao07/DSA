public class problem3 {
    public static void main(String[] args) {
    int[] arr={10,20,30,25,35};
        System.out.println(linearSearch(arr,1,4,30));
        System.out.println(minsearch(arr));
    }
    // Searching with in a Range
    public static boolean linearSearch(int[] arr,int start,int end,int target){
        for(int i=start;i<=end;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return  false;
    }
    // Searching minimum number in array
    public static int minsearch(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int ele:arr){
            if(ele<min){
                min=ele;
            }
        }
        return min;
    }
}
