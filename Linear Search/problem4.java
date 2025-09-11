import java.util.Arrays;

public class problem4 {
    public static void main(String[] args) {
        int[][] arr2D={
                {11,22,33},
                {44,55,66},
                {77,99,100}
        };
        System.out.println(Arrays.toString(searchin2DArray(arr2D,55)));
        System.out.println(maxElement(arr2D));
        System.out.println(minElement(arr2D));
    }
    // Searching in a 2 Dimensional Array
    public static int[] searchin2DArray(int[][] arr,int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return  new int[]{-1,-1};
    }
    // Finding Max element in a 2d array
    public static int  maxElement(int[][] arr){
        int max=arr[0][0];
        for(int[] ar:arr){
            for(int ele:ar){
                if(ele>max){
                    max=ele;
                }
            }
        }
        return max;
    }

    //Finding the min ele in 2D array
    public static int  minElement(int[][] arr){
        int min =arr[0][0];
        for(int[] ar:arr){
            for(int ele:ar){
                if(ele<min){
                    min =ele;
                }
            }
        }
        return min;
    }
}
