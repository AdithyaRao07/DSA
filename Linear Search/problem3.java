public class problem3 {
    public static void main(String[] args) {
    int[] arr={10,20,30,25,35};
        System.out.println(linearSearch(arr,1,4,30));
    }
    public static boolean linearSearch(int[] arr,int start,int end,int target){
        for(int i=start;i<=end;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return  false;
    }
}
