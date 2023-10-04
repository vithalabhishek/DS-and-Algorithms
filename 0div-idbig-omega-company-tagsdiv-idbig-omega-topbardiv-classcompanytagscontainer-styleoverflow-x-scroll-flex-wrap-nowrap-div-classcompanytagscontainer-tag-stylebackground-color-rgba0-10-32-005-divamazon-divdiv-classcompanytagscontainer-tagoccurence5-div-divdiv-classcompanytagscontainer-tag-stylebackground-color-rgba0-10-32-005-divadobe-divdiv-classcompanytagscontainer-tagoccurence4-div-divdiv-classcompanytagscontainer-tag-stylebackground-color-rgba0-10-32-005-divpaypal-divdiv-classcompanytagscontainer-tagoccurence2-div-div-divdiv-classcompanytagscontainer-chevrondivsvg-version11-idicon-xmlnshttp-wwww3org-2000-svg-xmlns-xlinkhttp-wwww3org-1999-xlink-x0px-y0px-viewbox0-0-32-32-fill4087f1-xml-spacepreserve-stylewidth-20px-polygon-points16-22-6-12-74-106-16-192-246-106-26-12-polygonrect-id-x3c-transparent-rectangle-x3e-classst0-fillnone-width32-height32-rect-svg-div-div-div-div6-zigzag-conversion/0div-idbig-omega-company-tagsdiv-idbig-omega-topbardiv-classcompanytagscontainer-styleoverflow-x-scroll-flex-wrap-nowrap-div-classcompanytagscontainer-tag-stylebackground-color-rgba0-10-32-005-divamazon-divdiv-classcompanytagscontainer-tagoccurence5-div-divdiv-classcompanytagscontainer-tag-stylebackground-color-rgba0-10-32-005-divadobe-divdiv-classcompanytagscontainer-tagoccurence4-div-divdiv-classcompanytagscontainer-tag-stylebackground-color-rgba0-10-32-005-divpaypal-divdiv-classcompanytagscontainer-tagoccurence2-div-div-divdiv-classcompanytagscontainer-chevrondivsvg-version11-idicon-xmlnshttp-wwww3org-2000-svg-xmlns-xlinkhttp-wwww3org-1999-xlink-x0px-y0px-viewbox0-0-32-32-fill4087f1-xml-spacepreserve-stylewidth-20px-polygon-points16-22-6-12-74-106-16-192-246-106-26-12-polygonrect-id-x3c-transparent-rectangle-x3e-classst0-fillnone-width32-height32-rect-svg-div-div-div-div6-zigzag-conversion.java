class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        //One builder for each row
        StringBuilder[] listOfSb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            listOfSb[i] = new StringBuilder();
        }
        int k = (numRows - 1) * 2;
        for (int i = 0; i < s.length(); i++) {
            int rest = i % k;
            //i-th char in row [0, numRows-1] when rest < numRows
            int row = rest < numRows ? rest : k - rest;
            listOfSb[row].append(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        //combine all builders
        for (StringBuilder b : listOfSb) {
            sb.append(b);
        }
        return sb.toString();
    }
}