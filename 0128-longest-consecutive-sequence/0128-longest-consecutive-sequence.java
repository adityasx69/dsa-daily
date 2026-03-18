class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num+length)){
                    length++;
                }
            longest = Math.max(length,longest);
            }
        }
        return longest;
    }
}

// int n = nums.length;
//         Map<Integer,Integer> map = new HashMap<>();
//         int max1 = 0;
//         int x = 0;
//         int y = 0;

//         for(int i=0;i<n;i++){
//             map.put(i,map.getOrDefault(i,0) + 1);
//             if(map.get(i) > 0){
//                 x = i;
//             }
//             if(map.get(i) <= 0){
//                 y = i;
//             }
//             int max = y - x;
//             if(max > max1){
//                 max1 = max;
//             }
//         }
//         return max1;