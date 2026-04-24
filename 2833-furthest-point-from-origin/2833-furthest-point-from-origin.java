class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int num = 0;
        int l = 0;
        int r = 0;
        int dash = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'L'){
                l++;
            }
            else if(moves.charAt(i) == 'R'){
                r++;
            }
            if(moves.charAt(i) == '_'){
                dash++;
            }
        }
        if(l>r){
            l += dash;
        }
        else{
            r += dash;
        }
        return Math.abs(r-l);
    }
}