class Solution {
    public int firstUniqChar(String s) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Integer c = s.charAt(i) - 97;
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(int i=0;i<s.length();i++){
            Integer c = s.charAt(i) - 97;
            int value = map.get(c);
            if(value == 1){
                return i;
            }
        }
        return -1;
    }
}