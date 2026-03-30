class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int doublee = 0;
        for(int i=0;i<nums.length;i++){
            if(0 <= nums[i] && nums[i] < 10){
                single += nums[i];
            }
            else if(nums[i] > 9){
                doublee += nums[i];
            }
        }
        if(single != doublee){
            return true;
        }
        return false;
    }
}