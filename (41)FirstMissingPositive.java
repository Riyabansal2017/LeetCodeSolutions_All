class Solution {
    public int firstMissingPositive(int[] nums) {
        int miss=1;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>miss)
                return miss;
            if(nums[i]==miss)
                miss++;
        }
        return miss;
    }
}