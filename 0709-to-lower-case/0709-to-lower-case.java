class Solution {
    public String toLowerCase(String s) {
        String r = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(65 <= c && c <= 90){
                r += (char)(c+32);
            }
            else{
                r += c;
            }
        }
        // return s.toLowerCase();
        return r;
    }
}