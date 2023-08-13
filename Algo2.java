public class Algo2 {
    public static void main(String[] args) {
        int[] nums = { -5, 2, 7, 10, 58, -7, 8, 23 };
        int smallNumber = nums[0];
        int largeNumber = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>largeNumber) largeNumber = nums[i];
            if(nums[i] < smallNumber) smallNumber = nums[i];
        }
        System.out.println("Largest number of the array is: "+ largeNumber);
        System.out.println("Smallest number of the array is: "+smallNumber);
    }
}
