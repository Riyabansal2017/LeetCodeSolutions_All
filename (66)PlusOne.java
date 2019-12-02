//66. Plus One

class Solution {
    public int[] plusOne(int[] digits) {
        int carry1 = 1;
        for(int i=digits.length-1;i>=0;i--)
        {
            int sum = digits[i]+carry;
            if(sum == 10)
            {
                digits[i]=0;
                carry1 = 1;
            }
            else
            {
                digits[i]=sum;
                carry1 = 0;
            }
        }
        if(carry1 == 1)
        {
            digits = Arrays.copyOf(digits, digits.length + 1);
            digits[0] = carry1;
        }
        return digits;
    }
}
