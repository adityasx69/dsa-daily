class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i=1;i<=num;i++){
            String s = String.valueOf(i);
            int sum = 0;
            for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
                int x = Character.getNumericValue(ch);
                sum += x;
            }
            if(sum % 2 == 0){
                count++;
            }
        }
        return count;
    }
}