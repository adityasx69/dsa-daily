class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int pos = s.charAt(i) - 'a' + 1;
            int revPos = 27-pos;
            int prod = (i+1) * revPos;
            sum+=prod;
        }
        return sum;
    }
}