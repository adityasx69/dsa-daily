class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int clockwise = (i - startIndex + n) % n;
                int anti = (startIndex - i + n) % n;
                ans = Math.min(ans,Math.min(clockwise,anti));
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}