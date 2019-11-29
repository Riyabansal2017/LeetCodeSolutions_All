//66. Plus One

class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1;i>=0;i--)
        {
            int sum = digits[i]+carry;
            if(sum == 10)
            {
                digits[i]=0;
                carry = 1;
            }
            else
            {
                digits[i]=sum;
                carry = 0;
            }
        }
        if(carry == 1)
        {
            digits = Arrays.copyOf(digits, digits.length + 1);
            digits[0] = carry;
        }
        return digits;
    }
}