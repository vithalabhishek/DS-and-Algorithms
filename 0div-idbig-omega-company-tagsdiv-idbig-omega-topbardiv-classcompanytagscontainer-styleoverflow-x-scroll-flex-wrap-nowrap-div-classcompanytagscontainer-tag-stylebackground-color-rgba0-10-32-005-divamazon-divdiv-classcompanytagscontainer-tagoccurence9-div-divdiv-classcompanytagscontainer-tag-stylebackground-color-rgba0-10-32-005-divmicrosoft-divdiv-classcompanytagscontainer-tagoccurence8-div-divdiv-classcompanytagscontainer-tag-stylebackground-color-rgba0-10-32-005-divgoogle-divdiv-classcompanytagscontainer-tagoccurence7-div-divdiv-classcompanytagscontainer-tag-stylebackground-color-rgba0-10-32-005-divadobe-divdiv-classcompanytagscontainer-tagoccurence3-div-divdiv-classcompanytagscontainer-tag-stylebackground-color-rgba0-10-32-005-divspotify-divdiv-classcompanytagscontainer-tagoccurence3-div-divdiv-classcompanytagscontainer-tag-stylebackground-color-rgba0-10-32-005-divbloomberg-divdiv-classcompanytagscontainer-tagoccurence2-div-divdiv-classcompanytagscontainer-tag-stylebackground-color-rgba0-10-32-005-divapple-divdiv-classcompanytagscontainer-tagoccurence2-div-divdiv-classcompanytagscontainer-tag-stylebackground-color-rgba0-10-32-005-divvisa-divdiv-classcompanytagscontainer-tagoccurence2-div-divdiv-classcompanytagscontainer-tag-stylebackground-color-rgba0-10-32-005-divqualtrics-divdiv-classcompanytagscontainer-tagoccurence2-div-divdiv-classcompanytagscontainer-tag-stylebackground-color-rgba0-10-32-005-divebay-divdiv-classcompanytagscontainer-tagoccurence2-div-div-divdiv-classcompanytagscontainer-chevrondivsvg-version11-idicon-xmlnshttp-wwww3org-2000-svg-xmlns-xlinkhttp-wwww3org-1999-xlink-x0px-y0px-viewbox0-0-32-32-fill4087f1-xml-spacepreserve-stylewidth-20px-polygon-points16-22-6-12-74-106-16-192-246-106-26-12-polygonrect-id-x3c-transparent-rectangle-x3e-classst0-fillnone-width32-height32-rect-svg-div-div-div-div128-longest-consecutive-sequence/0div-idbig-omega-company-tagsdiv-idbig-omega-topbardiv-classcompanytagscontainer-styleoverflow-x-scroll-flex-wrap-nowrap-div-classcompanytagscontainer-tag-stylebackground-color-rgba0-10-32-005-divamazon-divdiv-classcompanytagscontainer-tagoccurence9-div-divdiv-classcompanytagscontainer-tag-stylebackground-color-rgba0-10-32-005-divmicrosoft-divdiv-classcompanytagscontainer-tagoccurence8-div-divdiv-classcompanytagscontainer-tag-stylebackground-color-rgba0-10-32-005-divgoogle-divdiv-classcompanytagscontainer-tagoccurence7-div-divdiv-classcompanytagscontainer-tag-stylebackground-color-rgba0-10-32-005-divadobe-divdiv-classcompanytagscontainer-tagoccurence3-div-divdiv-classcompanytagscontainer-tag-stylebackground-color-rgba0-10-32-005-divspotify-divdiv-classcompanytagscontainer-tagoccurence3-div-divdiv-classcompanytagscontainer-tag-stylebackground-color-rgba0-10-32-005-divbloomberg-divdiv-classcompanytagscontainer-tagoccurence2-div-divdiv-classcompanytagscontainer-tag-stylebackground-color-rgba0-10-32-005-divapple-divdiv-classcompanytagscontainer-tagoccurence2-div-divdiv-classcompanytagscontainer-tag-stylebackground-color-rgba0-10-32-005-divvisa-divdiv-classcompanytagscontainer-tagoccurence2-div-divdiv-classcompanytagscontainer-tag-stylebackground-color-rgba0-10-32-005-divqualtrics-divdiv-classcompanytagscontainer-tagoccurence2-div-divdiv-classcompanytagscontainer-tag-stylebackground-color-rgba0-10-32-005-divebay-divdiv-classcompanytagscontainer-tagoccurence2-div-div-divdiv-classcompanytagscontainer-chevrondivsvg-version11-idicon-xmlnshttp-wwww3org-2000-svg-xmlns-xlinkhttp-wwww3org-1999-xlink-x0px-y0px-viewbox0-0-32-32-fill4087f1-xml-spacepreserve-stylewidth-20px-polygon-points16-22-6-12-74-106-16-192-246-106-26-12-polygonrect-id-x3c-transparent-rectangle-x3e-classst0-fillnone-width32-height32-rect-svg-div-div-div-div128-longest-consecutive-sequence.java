class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        
        int longeststreak = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int current = num;
                int streak = 1;
                while(set.contains(current + 1)){
                    current += 1;
                    streak += 1;
                }
                longeststreak = Math.max(longeststreak,streak);
            }
        }
       return longeststreak; 
    }
}