class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            String s = Integer.toString(nums[i]);
            int sum = 0;
            for(int j=0;j<s.length();j++){
                int digit = s.charAt(j) - '0';
                sum += digit;
            }
            min = Math.min(sum,min);
        }
        return min;
    }
}