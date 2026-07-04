class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        boolean sign = true;
        if((dividend>=0 && divisor<0)||(dividend<0 && divisor>0)) sign = false;
        long n=Math.abs((long)dividend);long d=Math.abs((long)divisor);
        long ans=0;
        while(n>=d){
            int count = 0;
            while(count<31 && n>=(d<<(count+1))){
                count++;
            }
            ans+=(1L<<count);
            n-= d*(1L<<count);
        }
        if(ans>Integer.MAX_VALUE && sign==true){
            return Integer.MAX_VALUE;
        }
        else if(ans>Integer.MAX_VALUE && sign==false){
            return Integer.MIN_VALUE;
        }
        if(sign == false){
            return (int)-ans;
        }
        return (int)ans;
    }
}