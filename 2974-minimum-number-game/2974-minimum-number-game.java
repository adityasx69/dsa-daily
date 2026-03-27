class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int i = 0;
        int x = 0;
        while(i<nums.length){
            if(i%2==0){
                arr[x+1] = nums[i];
            }
            else if(i%2==1){
                arr[x] = nums[i];
                x = x + 2;
            }
            i++;
        }
        return arr;
    }
}