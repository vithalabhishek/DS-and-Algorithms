class Solution {
    public int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        int n = s.length() - 1;
        
        for(int i = n; i >= 0; i--){
            if(s.charAt(i) != ' '){
                lengthOfLastWord++;
            }else{
                if(lengthOfLastWord > 0)
                    return lengthOfLastWord;
            }
        }
        return lengthOfLastWord;
    }
}