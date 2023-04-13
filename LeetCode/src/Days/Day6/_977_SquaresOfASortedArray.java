package Days.Day6;

public class _977_SquaresOfASortedArray {
    public static void main(String[] args){

    }

    //Two loop -> O(n^2)
    public static int[] sortedSquares1(int[] nums){
        return new int[]{0,0};
    }
    //Two Pointer -> O(n)
    public static int[] sortedSquares2(int[] nums){
        int l = 0;
        int r = nums.length-1;
        int[] res = new int[nums.length];
        int k = r;
        while(l <= r){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                res[k] = (int) Math.pow(Math.abs(nums[l]),2);
                l++;
            }else{
                res[k] = (int) Math.pow(Math.abs(nums[r]),2);
                l++;
            }
            k--;
        }
        return res;
    }
    /*
        I did it using priority queue(max heap)

        class Solution {
        public:
            vector<int> sortedSquares(vector<int>& nums) {
                priority_queue<int> pq;
                for(int i=0;i<nums.size();i++){
                    pq.push(nums[i]*nums[i]);
                }
                int i=nums.size()-1;
                while(!pq.empty()){
                    nums[i--]=pq.top();
                    pq.pop();
                }
                return nums;
            }
        };
    */
    /*
        C++ by creating bucket

        vector<int> sortedSquares(vector<int>& nums) {
             vector<int>ans;
             int buc[10001]={};
             for(int i:nums)buc[abs(i)]++;
             int c=nums.size(), i=0;
             while(c!=0){
                 if(buc[i]>0)ans.push_back(i*i),buc[i]--,c--;
                 else i++;
             }
             return ans;
         }
    */
}
