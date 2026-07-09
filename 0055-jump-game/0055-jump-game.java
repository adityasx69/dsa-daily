class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            max = Math.max(max,nums[i]+i);
            if(max>=nums.length-1){
                return true;
            }
        }
        return true;
    }
}
// class Solution {
//     public boolean canJump(int[] nums) {
//         int i = 0; int n = nums.length;
//         while(i<n){
//             if(i==n-1){
//                 return true;
//             }
//             else if(nums[i]+i<=n-1){
//                 i+=nums[i];
//             }
//             else{
//                 i++;
//             }
//         }
//         return false;
//     }
// }