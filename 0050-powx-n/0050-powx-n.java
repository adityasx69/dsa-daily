class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        int sign = 1;
        if(nn<0){
            nn = (-1)*nn;
            sign = -1;
        }
        while(nn>0){
            if(nn%2==1){
                ans *= x;
                nn -=1;
            }
            else{
                x *=x;
                nn /=2;
            }
        }
        if(sign==-1) ans = (double)(1.0)/(double)(ans);
        return ans;
    }
}