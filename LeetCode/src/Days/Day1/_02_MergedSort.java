package Days.Day1;

public class _02_MergedSort {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] result = twoSum3(nums, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " - ");
        }
    }
    //Using Force-Brute
    public static int[] twoSum1(int[] nums, int target){
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }
    public static int[] twoSum3(int[] nums, int target){
        int res[] = new int[2];

        int i =0, j=1;
        int diff = 1;
        while(true){
            if(target == nums[i] + nums[j]){
                res[0] = i;
                res[1] = j;
                break;
            } else if(j == nums.length -1){
                diff++;
                i = 0;
                j = diff;
            } else {
                i++;
                j++;
            }
        }
        return res;
    }

    //2 3 4 5 6 7 8 9 1
    public static int[] twoSum4(int[] nums, int target){
        return new int[]{1,2,3};
    }
}
