class Solution {
    public int alternatingSum(int[] nums) {
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                evenSum += nums[i];
            }
            else if(i%2==1){
                oddSum += nums[i];
            }
        }
        return evenSum - oddSum;
    }
}