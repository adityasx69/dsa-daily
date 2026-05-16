class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Character> map = new HashMap<>();
        int count = 0;
        int jLen = jewels.length(); int sLen = stones.length();
        for(int i=0;i<jLen;i++){
            char c = jewels.charAt(i);
            for(int j=0;j<sLen;j++){
                if(c == stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}