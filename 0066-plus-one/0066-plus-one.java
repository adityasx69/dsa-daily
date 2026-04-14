class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i=n-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[n+1];
        arr[0] = 1;
        return arr;
    }
}

// class Solution {
//     public int[] plusOne(int[] digits) {
//         int n = digits.length;
//         if(digits[n-1] == 9){
//             int arr[] = new int[n + 1];
//             for(int i=0;i<n-1;i++){
//                 arr[i] = digits[i];
//             }
//             arr[n-1] = 1;
//             arr[n] = 0;
//             return arr;
//         }
//         digits[n-1] = digits[n-1] + 1;
//         return digits;
//     }
// }