class Solution {
    //optimized
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char c: magazine.toCharArray()){
            freq[c-'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            if(freq[c-'a'] == 0){
                return false;
            }
            freq[c-'a']--;
        }
        return true;
    }
}

// my approach
// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character,Integer> r = new HashMap<>();
//         HashMap<Character,Integer> m = new HashMap<>();
//         for(int i=0;i<ransomNote.length();i++){
//             char c = ransomNote.charAt(i);
//             r.put(c,r.getOrDefault(c,0)+1);
//         }
//         for(int j=0;j<magazine.length();j++){
//             char d = magazine.charAt(j);
//             m.put(d,m.getOrDefault(d,0)+1);
//         }
//         for(int k=0;k<ransomNote.length();k++){
//             char c = ransomNote.charAt(k);
//             if(m.getOrDefault(c, 0) < r.get(c)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }