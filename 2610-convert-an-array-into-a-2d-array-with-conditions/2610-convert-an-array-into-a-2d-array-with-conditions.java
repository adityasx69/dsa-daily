class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int key:map.keySet()){
            int freq = map.get(key);
            for(int i=0;i<freq;i++){
                if(list.size() == i) list.add(new ArrayList<>());
                list.get(i).add(key);
            }
        }
        return list;
    }
}