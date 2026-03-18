class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        int i=0;int j=1;
        for(int ele : nums){
            if(ele >0){
                arr[i] = ele;
                i += 2;
            }
            else if(ele < 0){
                arr[j] = ele;
                j += 2;
            }
        }
        return arr;
    }
}

// int i = 1;
//         int j = 0;
//         while(i < nums.length - 1){
//             if(nums[j] > 0 && nums[i] > 0 || nums[j] < 0 && nums[i] < 0){

//             }
//             else if(nums[j] > 0 && nums[i] < 0|| nums[j] < 0 && nums[i] > 0){
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//             }
//             else if((nums[j] > 0 && nums[i] < 0 && nums[i+1] > 0 || nums[j] > 0 && nums[i] < 0 && nums[i+1] < 0) || (nums[j] < 0 && nums[i] > 0 && nums[i+1] < 0 ||  nums[j] < 0 && nums[i] > 0 && nums[i+1] > 0)){
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//             }
//             i++;
//             j++;
//         }
//         return nums;