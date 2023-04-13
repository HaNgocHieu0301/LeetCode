package Days.Day1;

public class _88_TwoSum {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,4, 0,0};
        int[] nums2 = {5,6};
        int m = 4;
        int n = 2;
        int[] res = merge(nums1, m, nums2, n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + "-");
        }
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int i = nums1.length- 1;
        m--;
        n--;
        while(i >= 0){
            if(m < 0){
                for (int j = n; j >= 0; j--) {
                    nums1[i] = nums2[j];
                    i--;
                }
            }else if(n < 0){
                for (int j = m; j >= 0; j--) {
                    nums1[i] = nums1[j];
                    i--;
                }
            }else if(nums1[m] >= nums2[n]){
                nums1[i] = nums1[m];
                m--;
            }else{
                nums1[i] = nums2[n];
                n--;
            }
            i--;
        }
        return new int[]{1,2};
    }
}
