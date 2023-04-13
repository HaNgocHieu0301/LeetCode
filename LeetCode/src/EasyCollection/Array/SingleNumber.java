package EasyCollection.Array;

public class SingleNumber {
    public static void main(String[] args){

    }

    //=======Method 1: Bit Manipulation=======//
    /*
    * N1 ^ N1 ^ N2 ^ N3 ^ N3
    * N1 ^ N1 = 0
    * N3 ^ N3 = 0
    * 0 ^ 0 = 0
    * 0 ^ N2 = N2
    * */
    public static int singleNumber(int[] nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    //======Method 2: Using HashMap======//

    //======Method 3: A For Loop======//
}
