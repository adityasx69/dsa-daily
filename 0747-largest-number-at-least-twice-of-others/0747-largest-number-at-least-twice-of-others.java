class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>sec_max){
                if(nums[i]>max){
                    sec_max = max;
                    max = nums[i];
                    idx = i;
                }
                else{
                    sec_max = nums[i];
                }
            }
        }
        if(max >= 2*sec_max){
            return idx;
        }
        else{
            return -1;
        }
    }
}