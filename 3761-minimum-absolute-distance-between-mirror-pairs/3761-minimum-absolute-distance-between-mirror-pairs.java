class Solution {
    public int reverse(int x){
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return rev;
    }

    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int rev = reverse(nums[i]);

            if(map.containsKey(nums[i])){
                min = Math.min(min,i-map.get(nums[i]));
            }
            map.put(rev,i);
        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return min;
        }
    }
}

// Brute Force
// class Solution {
//     public int minMirrorPairDistance(int[] nums) {
//         int min = Integer.MAX_VALUE;
//         int found = 0;
//         for(int i=0;i<nums.length;i++){
//             int temp = nums[i];
//             int rev = 0;
//             while(temp > 0){
//                 int digit = temp % 10;
//                 rev = (rev * 10) + digit;
//                 temp = temp / 10;
//             }
//             for(int j=i+1;j<nums.length;j++){
//                 if(rev == nums[j]){
//                     min = Math.min(min,Math.abs(i-j));
//                     found = 1;
//                 }
//             }
//         }
//         if(found == 0){
//             return -1;
//         }
//         else{
//             return min;
//         }
//     }
// }