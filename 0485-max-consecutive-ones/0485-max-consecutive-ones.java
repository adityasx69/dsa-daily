class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int zero = 0;
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            if (nums[i] == 1){
                count++;
            }
            else if (nums[i] == 0){
                arr[zero] = count;
                zero++;
                count = 0;
            }
        }
        arr[arr.length - 1] = count;
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }
}