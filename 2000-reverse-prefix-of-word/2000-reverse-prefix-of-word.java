class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        int found = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
                stack.push(word.charAt(i));
                while(!stack.isEmpty()){
                    char c = stack.pop();
                    ans += c;
                }
                for(int j=i+1;j<word.length();j++){
                    char d = word.charAt(j);
                    ans += d;
                }
                found = 1;
                break;
            }
            stack.push(word.charAt(i));
        }
        if(found == 1){
            return ans;
        }
        return word;
    }
}