public class findEvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr={10,1,111,1111};
        System.out.println(findEvendigits(arr));
    }
    public static int findEvendigits(int[] nums){
        int ans=0;
        for(int ele:nums){
            int count=0;
            if(ele==0){
                count=1;
            }
            if(ele<0){
                ele=ele*(-1);
            }
            while(ele>0){
                count++;
                ele=ele/10;
            }
            if(count%2==0){
                ans++;
            }
        }
        return ans;
    }
}
