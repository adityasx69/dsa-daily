class Solution {
    public boolean checkZeroOnes(String s) {
        int max_1 = 0;
        int max_0 = 0;
        int current_1 = 0;
        int current_0 = 0;

        for (char c : s.toCharArray()){
            if (c == '1'){
                current_1++;
                current_0 = 0;
            }
            else if (c == '0'){
                current_0++;
                current_1 = 0;
            }
            max_1 = Math.max(max_1, current_1);
            max_0 = Math.max(max_0, current_0);
        }
        return max_1 > max_0;
    }
}