package Days.Day3;

public class _167_TwoSumII_InputArrayIsSorted {
    public static void main(String[] args){

    }

    public static int[] twoSum(int[] numbers, int target){
        int l = 0;
        int r = numbers.length-1;
        while(l <= r){
            if(numbers[r] == target - numbers[l]){
                return new int[]{l,r};
            }
            if(numbers[r] < target - numbers[l]){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{-1,-1};
    }
}
