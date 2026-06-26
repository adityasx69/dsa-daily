class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        char x = String.valueOf(digit).charAt(0);
        for(int i=0;i<nums.length;i++){
            String s = String.valueOf(nums[i]);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j) == x) ans++;
            }
        }
        return ans;
    }
}