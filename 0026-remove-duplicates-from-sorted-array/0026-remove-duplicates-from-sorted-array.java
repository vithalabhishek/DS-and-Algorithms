class Solution {
    public int removeDuplicates(int[] nums) {
        //Brute Force Approach
       HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        // converting HashSet to arraylist
        ArrayList <Integer> arrayList = new ArrayList(set);

        // sorting the list
        Collections.sort(arrayList);
        System.out.println(arrayList);
        int k = arrayList.size();
        
        int j = 0;
        for (int x = 0; x < arrayList.size(); x++) {
            nums[j++] = arrayList.get(x);
        }
        return k;
    }
}