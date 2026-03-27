class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0;i<sentences.length;i++){
            String s = sentences[i];
            int count = 0;
            String[] words = s.trim().split("\\s+");
            max = Math.max(max,words.length);
        }
        return max;
    }
}