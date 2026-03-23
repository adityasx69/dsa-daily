class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++){
            String s = "";
            char ch1 = details[i].charAt(11);
            char ch2 = details[i].charAt(12);
            s = s + ch1 + ch2;
            int num = Integer.parseInt(s);
            if(num>60){
                count++;
            }
        }
        return count;
    }
}