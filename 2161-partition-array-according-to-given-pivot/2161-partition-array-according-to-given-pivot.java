class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> finalx = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                smaller.add(nums[i]);
            }
            else if(nums[i]>pivot){
                greater.add(nums[i]);
            }
            else{
                equal.add(nums[i]);
            }
        }
        finalx.addAll(smaller);
        finalx.addAll(equal);
        finalx.addAll(greater);
        int[] ans = new int[finalx.size()];

        for (int i = 0; i < finalx.size(); i++) {
            ans[i] = finalx.get(i);
        }
        return ans;
    }
}