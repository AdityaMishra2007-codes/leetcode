class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        int m=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(i<m){
                ans-=nums[i];
            }
            else{
                ans+=nums[i];
            }
            
        }
        return ans;
    }
}