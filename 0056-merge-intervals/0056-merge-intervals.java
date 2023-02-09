class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals == null || intervals.length == 0){
            res.toArray(new int[0][]);
        }
        
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]); //ascending order
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int[] a : intervals){
            if(a[0] <= end){
                end = Math.max(end, a[1]);
            }
            else{
                res.add(new int[]{start,end});
                start = a[0];
                end = a[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}