class Solution {
    public int lengthOfLastWord(String s) {
        String x = s.trim();
        int len = 0;
        
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }
        return len;
    }
}