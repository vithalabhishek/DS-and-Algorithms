class Solution {
    public int majorityElement(int[] nums) {
        // floor of n/2 times
        //Moore's Voting Algorithm
        int count = 0;
        int element = 0;
        for(int num : nums){
            if(count == 0)
                element = num;
            if(element == num)
                count +=1 ;
            else
                count -=1 ;
        }
        return element;
    }
}