class Solution {
    public int findMin(int[] nums) {
        int low = 0; int high = nums.length - 1; 
        int target = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low+high) / 2;
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target){
                    target = nums[low];
                }
                low = mid + 1;
            }
            else{
                if(nums[low] <= target){
                    target = nums[low];
                }
                high = mid;
            }
        }
        return target;
    }
}