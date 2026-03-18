class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int[] arr = new int[32];
        int i = 0;
        int x = n;
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

// if(n==0) return 1;

//         int bits = (int)(Math.log(n)/Math.log(2)) + 1;
//         int mask = (1<<bits) - 1;

//         return n ^ mask;