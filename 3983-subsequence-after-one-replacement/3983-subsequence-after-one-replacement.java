class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int x = 0;int y=0;
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(y<s.length()&&s.charAt(y)==c){
                y++;
            }
            if(x<s.length()){
                y = Math.max(y, x + 1);
            }
            if(x<s.length() && s.charAt(x)==c){
                x++;
            }
        }
        if (x == s.length() || y == s.length()) {
            return true;
        }
        return false;
    }
}
// class Solution {
//     public boolean canMakeSubsequence(String s, String t) {
//         int x = 0;int y=0;
//         boolean ans = false; int count=0;
//         while(y<s.length()){
//             if(s.charAt(y) == t.charAt(x)){
//                 y++;
//             }else if(s.charAt(y+1) == t.charAt(x)){
//                 count++;
//                 y+=2;
//             }
//             x++;
//         }
//         if(count<=1){
//             return true;
//         }
//         return false;
//     }
// }