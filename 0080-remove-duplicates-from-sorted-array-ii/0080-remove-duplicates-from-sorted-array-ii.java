class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;
        int index = 2;
        for(int j = 2; j < nums.length; j++){
            if(nums[j] != nums[index - 2]){
                nums[index++] = nums[j];
            }
        }
        return index;
    }
}