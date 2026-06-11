class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]) {
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}

// my approach
// class Solution {
//     public int getCommon(int[] nums1, int[] nums2) {
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0;i<nums1.length;i++){
//             int j = 0;
//             int x = Integer.MAX_VALUE;
//             while(j<nums2.length){
//                 if(nums1[i] == nums2[j]){
//                     x = Math.min(x,nums1[i]);
//                 }
//                 j++;
//             }
//             smallest = Math.min(x,smallest);
//         }
//         return smallest;
//     }
// }