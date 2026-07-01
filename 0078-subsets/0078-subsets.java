class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int subsetsCount = 1<<nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<subsetsCount;i++){
            List<Integer> x = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j)) != 0){
                    x.add(nums[j]);
                }
            }
            ans.add(x);
        }
        return ans;
    }
}

// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> list = new ArrayList<>();
//         list.add(new ArrayList<>());
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                 List<Integer> curr = new ArrayList<>();
//                 curr.add(nums[i],nums[j]);
//                 if(!list.contains(curr)){
//                     list.add(curr);
//                 }
//             }
//         }
//         return list;
//     }
// }