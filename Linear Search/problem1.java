public class problem1 {
    public static void main(String[] args) {
     int[] arr={1,2,3,4};
        System.out.println(linearSearch(arr,2));
    }
    public static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int index=0;
        // using enhanced for loop
        for(int ele: arr){
            if(ele==target){
                System.out.println("Element is present");
                return index ;
            }
            index++;
        }
        return -1;
    }
}
