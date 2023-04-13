package Days.Day3;

public class _189_RotateArray {
    public static void main(String[] args) {

    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // if we have let's say 101 to rotate, then we only rotate it 1 time not 101 times
        if(k < 0){ // if we get -ve value, then -ve is just equals to it's -ve + array.length
            k += nums.length;
        }
        rotate(nums,0, nums.length-k-1);
        rotate(nums,nums.length-k, nums.length-1);
        rotate(nums,0, nums.length-1);

    }

    public static void rotate(int[] nums, int l, int r){
        while(l <= r){
            int tmp = nums[r];
            nums[r] = nums[l];
            nums[l] = tmp;
            l++;
            r--;
        }
    }
}
