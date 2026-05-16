class Solution {
    public int findClosest(int x, int y, int z) {
        int dist_1 = Math.abs(x-z);
        int dist_2 = Math.abs(y-z);
        if(dist_1 < dist_2){
            return 1;
        }
        else if(dist_2 < dist_1){
            return 2;
        }
        else{
            return 0;
        }
    }
}