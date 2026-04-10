class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int f : friends){
            set.add(f);
        }
        List<Integer> ans = new ArrayList<>();
        for(int o : order){
            if(set.contains(o)){
                ans.add(o);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}