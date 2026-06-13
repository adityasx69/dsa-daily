class Solution {
    public int romanToInt(String s) {
        int ans=0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length()-1;i++){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                ans-=map.get(s.charAt(i));
            }
            else{
                ans+=map.get(s.charAt(i));
            }
        }
        return ans+=map.get(s.charAt(s.length()-1));
    }
}

// my approach
// class Solution {
//     public int romanToInt(String s) {
//         int num = 0;
//         for(int i=0;i<s.length()-1;i++){
//             if(s.charAt(i) == 'C' && s.charAt(i+1)=='M' && i+1<s.length()){
//                 num+=900;
//                 i++;
//             }
//             else if(s.charAt(i) == 'M'){
//                 num+=1000;
//             }
//             else if(s.charAt(i) == 'C' && s.charAt(i+1)=='D' && i+1<s.length()){
//                 num+=400;
//                 i++;
//             }
//             else if(s.charAt(i) == 'D'){
//                 num+=500;
//             }
//             else if(s.charAt(i) == 'X' && s.charAt(i+1)=='C' && i+1<s.length()){
//                 num+=90;
//                 i++;
//             }
//             else if(s.charAt(i) == 'C'){
//                 num+=100;
//             }
//             else if(s.charAt(i) == 'X' && s.charAt(i+1)=='L' && i+1<s.length()){
//                 num+=40;
//                 i++;
//             }
//             else if(s.charAt(i) == 'L'){
//                 num+=50;
//             }
//             else if(s.charAt(i) == 'I' && s.charAt(i+1)=='X' && i+1<s.length()){
//                 num+=9;
//                 i++;
//             }
//             else if(s.charAt(i) == 'X'){
//                 num+=10;
//             }
//             else if(s.charAt(i) == 'I' && s.charAt(i+1)=='V' && i+1<s.length()){
//                 num+=4;
//                 i++;
//             }
//             else if(s.charAt(i) == 'V'){
//                 num+=5;
//             }
//             else if(s.charAt(i) == 'I'){
//                 num+=1;
//             }
//         }
//         return num;
//     }
// }