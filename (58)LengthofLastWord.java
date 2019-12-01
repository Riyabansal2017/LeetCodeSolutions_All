// 58. Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int ref=s.length()-1;
        while(i>=0 && s.charAt(i) == ' ')
        {
            ref--;
        }
        while(i>=0 && s.charAt(i) != ' ')
        {
            count++;
            ref--;
        }
        return count;
    }
}
