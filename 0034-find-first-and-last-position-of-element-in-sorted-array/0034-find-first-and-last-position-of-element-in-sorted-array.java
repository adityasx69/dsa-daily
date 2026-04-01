class Solution {
    public int lowerbound(int[] arr, int n, int x) {
        int left = 0; int right = arr.length - 1; int ans = n;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] >= x){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
    public int upperbound(int[] arr, int n, int x) {
        int left = 0; int right = arr.length - 1; int ans = n;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] > x){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerbound(nums, n, target);
        if(lb == n || nums[lb] != target){
            return new int[] {-1,-1};
        }
        int ub = upperbound(nums,n,target) - 1;
        return new int[] {lb,ub};
    }
}