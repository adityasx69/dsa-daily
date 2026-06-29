class Solution {
    static int countSetBits(int n){
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
    public int minBitFlips(int start, int goal) {
        int count = start ^ goal;
        return countSetBits(count);
    }
}