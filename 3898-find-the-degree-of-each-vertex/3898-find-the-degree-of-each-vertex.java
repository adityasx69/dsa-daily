class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 1) sum++;
            }
            ans[i] = sum;
        }
        return ans;
    }
}