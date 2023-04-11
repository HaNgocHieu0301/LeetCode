package EasyCollection.Array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int result = 0;
        int curPointer = 1;
        int secondPointer = 0;
        while(curPointer < nums.length){
            //1 2 2 4 4 5 3
            if(nums[secondPointer] != nums[curPointer]){
                secondPointer++;
                nums[secondPointer] = nums[curPointer];
                result++;
            }
            curPointer++;
        }
        return result;
    }
}
