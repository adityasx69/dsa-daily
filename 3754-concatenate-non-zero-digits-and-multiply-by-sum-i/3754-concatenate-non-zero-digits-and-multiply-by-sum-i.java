class Solution {
    public long sumAndMultiply(int n) {
        long temp = n; long ans = 0; long sum=0;
        while(temp>0){
            long digit = temp%10;
            if(digit!=0){
                ans = (ans*10)+digit;
                sum+=digit;
            }
            temp = temp/10;
        }
        long finalAns = 0;
        while(ans>0){
            long x = ans%10;
            finalAns = (finalAns*10)+x;
            ans = ans/10;
        }
        return finalAns * sum;
    }
}