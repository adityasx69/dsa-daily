class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num = 0;
            int j = i;
            while(j>=0){
                num = num + nums[j];
                j--;
            }
            ans[i] = num;
        }
        return ans;
    }
}