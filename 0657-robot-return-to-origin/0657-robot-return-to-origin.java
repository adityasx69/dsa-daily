class Solution {
    public boolean judgeCircle(String moves) {
        int row = 0;
        int col = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'R'){
                row++;
            }
            else if(moves.charAt(i) == 'L'){
                row--;
            }
            if(moves.charAt(i) == 'U'){
                col++;
            }
            else if(moves.charAt(i) == 'D'){
                col--;
            }
        }
        if(row==0 && col==0){
            return true;
        }
        return false;
    }
}