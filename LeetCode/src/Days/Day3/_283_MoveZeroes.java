package Days.Day3;

public class _283_MoveZeroes {
    public static void main(String[] args){

    }
    //my solution
    public static void moveZeroes1(int[] nums){
//        int l = 0;
//        int h = 0;
//        while(l <= nums.length-1){
//            if(nums[l] != 0 || h == nums.length-1){
//                l++;
//                h = l;
//            }else {
//                h++;
//                if(nums[h] != 0){
//                    int tmp = nums[h];
//                    nums[h] = nums[l];
//                    nums[l] = tmp;
//                }
//            }
//        }
        int i = 0;
        int j = 0;
        while(i < nums.length){
            if(nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
            i++;
        }
    }

    //in tutorial 1
    public static void moveZeroes2(int[] nums){
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }
        for(int i = lastNonZeroFoundAt; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    //in tutorial 2
    public static void moveZeroes3(int[] nums){
        for(int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++){
            if(nums[cur] != 0){
                if(lastNonZeroFoundAt != cur){
                    swap(nums[lastNonZeroFoundAt], nums[cur]);
                }
                lastNonZeroFoundAt++;
            }
        }
    }
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}
