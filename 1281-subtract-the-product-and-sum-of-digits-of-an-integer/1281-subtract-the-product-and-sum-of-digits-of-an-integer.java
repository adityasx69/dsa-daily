class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            product = product * digit;
            sum = sum + digit;
            temp = temp / 10;
        }
        return product - sum;
    }
}