class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = 0;

        for(int i= n-1;i>=0;i--){
            if(arr[i] > max){
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            }
            else{
                arr[i] = max;
            }
        }
        arr[n-1] = -1;
        return arr;
    }
}