// 58. Length of Last Word
class LengthOfLastWord
{
    public int lengthOfLastWord(String s)
    {
        int count=0;
        int ref=s.length()-1;
        while(ref>=0 && s.charAt(i) == ' ')
        {
            ref--;
        }
        while(ref>=0 && s.charAt(i) != ' ')
        {
            count++;
            ref--;
        }
        return count;
    }
}
