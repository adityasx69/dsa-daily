class Solution {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int length = 0;
            for(int j=0;j<boxes.length();j++){
                if(j == i){
                    continue;
                }
                else{
                    if(boxes.charAt(j) == '1'){
                        length += Math.abs(i-j);
                    }
                }
            }
            arr[i] = length;
        }
        return arr;
    }
}