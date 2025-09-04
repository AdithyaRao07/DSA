import java.util.Arrays;

class practice1 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 12, 7};
        int[] arr2 = new int[5];
        arr2[0] = 5;
        arr2[1] = 1;
        arr2[3] = 4;
        arr2[2] = 2;
        System.out.println(arr[0]);
        int ele = 12;
        boolean found = false;
        for (int num : arr) {
            if (num == ele) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element is present" : "Element not present");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(linearSearch(arr, 1));
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,12));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid]==target){
                return mid;
            } else if (target<arr[mid]) {
                high=mid-1;
            } else if (target>arr[mid]) {
                low=mid+1;
            }
        }
        return -1;
    }
}