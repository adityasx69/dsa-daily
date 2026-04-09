class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        return set.size();
    }
}
// class Solution {
//     public int maxDistinct(String s) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 int ch = s.charAt(j) - 'a';
//                 map.put(ch,map.getOrDefault(ch,0)+1);
//             }
//         }
//         int count = 0;
//         for(int i=0;i<map.size();i++){
//             if(map.getOrDefault(i, 0) > 0){
//                 count++;
//             }
//         }
//         return count;
//     }
// }