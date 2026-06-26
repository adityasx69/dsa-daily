class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double sum = 0;
        for(int right=0;right<k;right++){
            sum += nums[right];
        }
        double ans = sum;
        for(int right = k;right<nums.length;right++){
            sum-=nums[left];
            left++;
            sum+=nums[right];
            ans = Math.max(ans,sum);
        }
        return (double) ans/k;
    }
}