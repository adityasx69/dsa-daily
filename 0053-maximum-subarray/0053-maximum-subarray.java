class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(sum > max){
                max = sum;
            }
            
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}

// brute force
// int n = nums.length;
//         if(n == 1){
//             return nums[0];
//         }
//         int sum = 0;
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 sum += nums[j];
                
//                 if(sum > max){
//                 max = sum;
//                 }
//             }
//             sum = 0;
//         }
//         return max;