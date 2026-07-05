class Solution {
    public int maxDigitRange(int[] nums) {
        int ans = 0; int maxDigitRange = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int largest = 0;
            int smallest = 9;
            if(num==0){
                largest = 0;
                smallest=0;
            }
            while(num>0){
                int digit = num%10;
                if(digit>largest){
                    largest = digit;
                }
                if(digit<smallest){
                    smallest = digit;
                }
                num/=10;
            }
            if(largest - smallest > maxDigitRange){
                maxDigitRange = Math.max(maxDigitRange,largest-smallest);
                ans= nums[i];
            }else if(largest - smallest == maxDigitRange){
                ans+=nums[i];
            }
        }
        return ans;
    }
}