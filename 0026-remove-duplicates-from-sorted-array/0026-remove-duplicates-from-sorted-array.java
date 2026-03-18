class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = nums[0];
        int k = 1;
        for (int i=1;i<nums.length;i++){
            if(nums[i] != unique){
                nums[k] = nums[i];
                unique = nums[i];
                k++;
            }
        }
        return k;
    }
}