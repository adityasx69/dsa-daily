class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            String s = Integer.toString(arr1[i]);
            for(int j=0;j<s.length();j++){
                set.add(s.substring(0,j+1));
            }
        }
        int length = 0;
        for(int i=0;i<arr2.length;i++){
            String s = Integer.toString(arr2[i]);
            for(int j=0;j<s.length();j++){
                if(set.contains(s.substring(0,j+1))) length = Math.max(length, j+1);
            }
        }
        return length;
    }
}

//tle 
// class Solution {
//     public int longestCommonPrefix(int[] arr1, int[] arr2) {
//         int total = 0;
//         for(int i=0;i<arr1.length;i++){
//             String a1 = Integer.toString(arr1[i]);
//             int y = 0;
//             for(int j=0;j<arr2.length;j++){
//                 String a2 = Integer.toString(arr2[j]);
//                 int count = 0;
//                 for(int k=0;k<Math.min(a1.length(),a2.length());k++){
//                     if(a1.charAt(k) == a2.charAt(k)) count++;
//                     else break;
//                 }
//                 y = Math.max(y,count);
//             }
//             total = Math.max(y,total);
//         }
//         return total;
//     }
// }