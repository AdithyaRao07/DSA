import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr2D= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8,9}
        };
        // Dynamic Arrays
     /*   int[][] arr={
                {1,2,3},
                {4,5},
                {7,8,9}
        }; */

        // 2D Array syntax
        // int[][] arr2D=new int[3][];

        //inserting values into a 2D array
       //  arr2D[2][2]=9;

        // Printing an 2D array(output)
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D[i].length;j++){
                System.out.print(arr2D[i][j]);
            }
            System.out.println();
        }
        //printing using 2nd method
        for (int row=0;row<arr2D.length;row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }
        // enhanced for loop
        for(int[] a:arr2D){
            System.out.println(Arrays.toString(a));
        }
    }
    }

