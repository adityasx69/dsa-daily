class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] result = new int[n];
        result[0] = 1; int right = 1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1] *nums[i-1];
        }
        for(int i=n-1;i>=0;i--){
            result[i] = result[i] * right;
            right *= nums[i];
        }
        return result;
    }
}



// approach 1 (TLE)
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] sum = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int left = i; int right = i;
//             int sumLeft = 1; int sumRight = 1;
//             while(left>=0){
//                 if(left != i){
//                     sumLeft *= nums[left];
//                 }
//                 left--;
//             }
//             while(right<nums.length){
//                 if(right != i){
//                     sumRight *= nums[right];
//                 }
//                 right++;
//             }
//             sum[i] = sumLeft*sumRight;
//         }
//         return sum;
//     }
// }

// approach 2
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int zeroCount = 0;
//         int product_wo_zero = 1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] == 0){
//                 zeroCount++;
//             }
//             else{
//                 product_wo_zero *= nums[i];
//             }
//         }
//         for(int j=0;j<nums.length;j++){
//             if(zeroCount>1){
//                 nums[j] = 0;
//             }
//             else if(zeroCount==1){
//                 if(nums[j] ==0){
//                     nums[j] = product_wo_zero;
//                 }
//                 else{
//                     nums[j] = 0;
//                 }
//             }
//             else{
//                 nums[j] = product_wo_zero / nums[j];
//             }
//         }
//         return nums;
//     }
// }