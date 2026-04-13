class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = nums.length;
        for(int i=0;i<nums.length;i++){
            int length = 0;
            int found = 1;
            if(nums[i] == target){
                length = Math.abs(i - start);
                found = 1;
            }
            if(nums[i] != target){
                found = 0;
            }
            if(found == 1){
                min = Math.min(min,length);
            }
        }
        return min;
    }
}