class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            List<Integer> temp = new ArrayList<>();
            while(x>0){
                temp.add(x%10);
                x = x/10;
            }
            list.addAll(temp.reversed());
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}