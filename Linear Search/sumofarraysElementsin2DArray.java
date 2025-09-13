public class sumofarraysElementsin2DArray {
    public static void main(String[] args) {
int[][] arr={
        {10,15,20},
        {50,10,1},
        {45,10}
};
        System.out.println(maxArray(arr));
    }
    public static int maxArray(int[][] arr){
        int max=0;
        for(int row=0;row<arr.length;row++){
            int rowsum=0;
            for(int col=0;col<arr[row].length;col++){
                rowsum+= arr[row][col];
            }
            if(rowsum>max){
                max=rowsum;
            }
        }
        return max;
    }
}
