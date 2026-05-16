class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int leftSum = 0;
            int rightSum = 0;
            int j = i-1; int k = i+1;
            while(j>=0){
                leftSum += nums[j];
                j--;
            }
            while(k<nums.length){
                rightSum += nums[k];
                k++;
            }
            answer[i] = Math.abs(leftSum - rightSum);
        }
        return answer;
    }
}