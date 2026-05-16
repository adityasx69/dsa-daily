class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            int temp = i;
            boolean valid = true;
            boolean diff = false;
            while(temp>0){
                int digit = temp%10;
                if(digit == 3 || digit == 4 || digit == 7){
                    valid = false;
                    break;
                }
                else if(digit == 2 || digit == 5 || digit == 6 || digit == 9){
                    diff = true;
                }
                temp = temp/10;
            }
            if(valid && diff){
                    count++;
                }
        }
        return count;
    }
}