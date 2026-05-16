class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = 1_000_000_007;
        for (int i=0;i < queries.length;i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];
            int idx = l;
            while (idx <= r) {
                nums[idx] = (int)((nums[idx] * 1L * v) % mod);
                idx += k;
            }
        }
        int ans = 0;
        for (int num : nums) {
            ans = ans^num;
        }
        return ans;
    }
}