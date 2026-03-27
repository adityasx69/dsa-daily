class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;
        for(int i=0;i<nums.length;i++){
            eleSum += nums[i];
            int x = nums[i];
            while(x>0){
                int digit = x % 10;
                digitSum = digitSum + digit;
                x = x/10;
            }
        }
        int diff = Math.abs(eleSum - digitSum);
        return diff;
    }
}