class Solution {
    public int findComplement(int num) {
        if(num==0) return 1;
        int[] arr = new int[32];
        int i = 0;
        int x = num;
        int sum = 0;
        while(x>0){
            arr[i] = x%2;
            x = x/2;

            if(arr[i] == 1){
                arr[i] = 0;
            }
            else if(arr[i] == 0){
                arr[i] = 1;
            }

            sum += arr[i] * (int)(Math.pow(2,i));
            i++;
        }
        return sum;
    }
}