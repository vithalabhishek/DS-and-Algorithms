class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> sum = new HashMap<Integer,Integer>();
        int[] ans = new int[2];
        
        for(int i = 0; i < nums.length;i++){
            if(sum.containsKey(target - nums[i])){
                ans[1] = i;
                ans[0] = sum.get(target - nums[i]);
            }
            sum.put(nums[i], i);
        }
        return ans;
    }
}