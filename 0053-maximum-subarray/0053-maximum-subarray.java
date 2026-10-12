class Solution {
    public int maxSubArray(int[] nums) {
        int gsum=nums[0];
        int current=nums[0];
        for(int i=1;i<nums.length;i++){
            current=Math.max(nums[i],current+nums[i]);
            gsum=Math.max(gsum,current);
            }

        return gsum;
    }
}