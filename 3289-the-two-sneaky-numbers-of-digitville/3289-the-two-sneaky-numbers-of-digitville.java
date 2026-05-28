class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        int x = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i])>=2){
                arr[x] = nums[i];
                x++;
            }
        }
        return arr;
    }
}