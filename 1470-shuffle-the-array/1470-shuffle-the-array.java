class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int i=0;int j=n;int idx = 0;
        while(idx<(2*n)){
            if(idx%2==0){
                ans[idx] = nums[i];
                i++;
            }
            else{
                ans[idx] = nums[j];
                j++;
            }
            idx++;
        }
        return ans;
    }
}