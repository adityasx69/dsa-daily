class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        else{
            Map<Character,Integer> x = new HashMap<>();
            Map<Character,Integer> y = new HashMap<>();

            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                char c1 = t.charAt(i);
                x.put(c,x.getOrDefault(c,0) + 1);
                y.put(c1,y.getOrDefault(c1,0) + 1);
            }
            if(x.equals(y)){
                return true;
            }
        }
        return false;
    }
}